#include <iostream>
#include <omp.h>

using namespace std;

void w1() {
	int count, num;
#pragma omp parallel
	{
		count = omp_get_num_threads();
		num = omp_get_thread_num();
		if (num == 0)
			cout << "Vsego putei: " << count << endl;
		else
			cout << "Nit' nomer " << num << endl;
	}
}

void w2() {
	int s, i, n;
	s = 0;
	#pragma omp parallel private (i,n) reduction(+:s)
	{
		n = omp_get_thread_num();
		#pragma omp for
		for (i = 1; i < 10; i++)
		{
			s = s + i;
			cout << "Nit' " << n << " slogila el s nomerami" << i<<endl;
		}
	}
	cout << s << endl;
}

void w3() {
	omp_set_num_threads(4);
	int i;
	#pragma omp parallel private(i)
	{
		#pragma omp for schedule(static)
		//#pragma omp for schedule(static,1)
		//#pragma omp for schedule(static,2)
		//#pragma omp for schedule(dynamic)
		//#pragma omp for schedule(dynamic,2)
		//#pragma omp for schedule(guided)
		//#pragma omp for schedule(guided,2)
		for (i = 0; i < 10; i++)
		{
			cout << "Nit' " << omp_get_thread_num() << " vipolnila iterazi " << i << endl;
		}
	}
}

int main()
{
	//w1();
	//w2();
}
