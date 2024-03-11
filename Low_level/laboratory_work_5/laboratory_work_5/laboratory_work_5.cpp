#include <iostream>
#include <omp.h>

using namespace std;

void w_1() {
    int n = 100000, i;
    double sum = 0.0, pi, h, x;
    h = 1.0 / (double)n;
#pragma omp parallel private (i,x) shared (h,n,sum) num_threads(4)
    {
        double l_sum = 0.0;
#pragma omp for
        for (i = 0; i <= n; i++)
        {
            x = h * ((double)i - 0.5);
            l_sum += (4.0 / (1.0 + x * x));
        }
        sum += l_sum;
    }
    pi = h * sum;
    cout << pi << endl;
}

void w_2() {
    int n = 100000, i;
    double sum = 0.0, pi, h, x;
    h = 1.0 / (double)n;
#pragma omp parallel private (i,x) shared (h,n,sum) num_threads(4)
    {
        double l_sum = 0.0;
#pragma omp for
        for (i = 0; i <= n; i++)
        {
            x = h * ((double)i - 0.5);
            l_sum += (4.0 / (1.0 + x * x));
        }
#pragma omp atomic
        sum += l_sum;
    }
    pi = h * sum;
    cout << pi << endl;
}

void w_3() {
    int n = 100000, i;
    double sum = 0.0, pi, h, x;
    h = 1.0 / (double)n;
#pragma omp parallel private (i,x) shared (h,n,sum) num_threads(4)
    {
        double l_sum = 0.0;
#pragma omp for
        for (i = 0; i <= n; i++)
        {
            x = h * ((double)i - 0.5);
            l_sum += (4.0 / (1.0 + x * x));
        }
#pragma omp critical
        sum += l_sum;
    }
    pi = h * sum;
    cout << pi << endl;
}

void w_4() {
    int a, b;
    cout << "Write a,b";
    cin >> a >> b;
    int delta = b - a,i;
    double x, c,sum=0.0,f;
    cout << "Write x=";
    cin >> x;
    cout << endl<<"Write c=";
    cin >> c;
#pragma omp parallel private(i,f) shared (delta,sum,x,c) num_threads(4)
    {
        double l_sum = 0.0;
#pragma omp for
        for (i = 0; i <= delta; i++)
        {
            f = (x * (i + delta) - x * i) / delta;
            l_sum += f;
        }
    }

}

int main()
{
    //w_1();
    //w_2();
    w_3();
}
