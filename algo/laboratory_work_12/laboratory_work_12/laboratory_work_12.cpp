#include <iostream>
using namespace std;
void add(int** arr1, int** arr2, int n)
{
	int** arr3 = new int* [n];
	for (int i = 0; i < n; i++) {
		arr3[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			arr3[i][j] = 0;
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
		{
			arr3[i][j] = arr1[i][j] + arr2[i][j];
		}
	}
}
void sub(int** arr1, int** arr2, int n)
{
	int** arr3 = new int* [n];
	for (int i = 0; i < n; i++) {
		arr3[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			arr3[i][j] = 0;
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
		{
			arr3[i][j] = arr1[i][j] - arr2[i][j];
		}
	}
}
void mult(int** arr1, int** arr2, int n)
{
	int** arr3 = new int* [n];
	for (int i = 0; i < n; i++) {
		arr3[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			arr3[i][j] = 1;
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
		{
			for (int k = 0; k < n; k++)
				arr3[i][j] += arr1[i][k] * arr2[k][j];
		}
	}
}
int main()
{
    srand(time(0));
	int m = 0;
    for (int n = 2; n <= 1024; n*=2)
    {
		int** arr1 = new int* [n];
		for (int i = 0; i < n; i++) {
			arr1[i] = new int[n]; m++;
			for (int j = 0; j < n; j++)
			{
				arr1[i][j] = rand() % 1000;
			}
		}
		int** arr2 = new int* [n];
		for (int i = 0; i < n; i++) {
			arr2[i] = new int[n]; m++;
			for (int j = 0; j < n; j++)
			{
				arr2[i][j] = rand()%1000;
			}
		}
    }
}

