// omp_get_max_threads.cpp
// compile with: /openmp
#include <iostream>
#include <omp.h>
#include <stdio.h>
using namespace std;

int main()
{
    setlocale(LC_ALL,"rus");
    int n = 1;
    cout << "n � ���������������� �������(������):" << n;
#pragma omp parallel private(n)
    {
        n = omp_get_thread_num();
        cout << "�������� n �� ����:" << n;
    }

}
