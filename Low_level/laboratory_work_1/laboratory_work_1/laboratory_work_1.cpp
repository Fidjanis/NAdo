#include <iostream>

using namespace std;
void wo_1() {
	int a, b, sum;
	cin >> a >> b;
	_asm {
		mov eax, a
		mov ecx, 5
		m:add eax, b
		loop m
		mov sum, eax
	}
	cout << sum;
}

void wo_2() {
	int a, b,c, max;
	cin >> a >> b>>c;
	_asm {
		mov eax, a
		mov ebx, b;
		cmp eax, ebx;
		jg m1
		mov eax,ebx
		m1: mov ebx,c
		cmp eax,ebx
		jg m2
		mov eax, ebx
		m2: mov max,eax
	}
	cout << max;
}

void vo_3() {
	int a, b, c, max, min, z;
	cin >> a >> b >> c;
	_asm {
		mov eax,a
		mov ebx,b
		add eax,abx
		add eax,eax
		mov edx,c 
		cmp eax,edx 



	}
}

int main()
{
	//wo_1();
	//wo_2();
}


