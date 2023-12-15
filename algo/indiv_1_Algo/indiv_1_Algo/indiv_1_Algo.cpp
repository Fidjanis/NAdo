
#include <iostream>

using namespace std;

int step(int** arr, int l, int n) { //�-��� ������� ������� �������� �������, ���������� l ����� ������� 
	int k = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++)
			if (i != l && j==l && arr[i][j]==1) { 
				k++;
			}
	}
	return k;
}

int main()
{
	int n;
	cin >> n;
	int** arr1 = new int* [n]; //����� ������ ������� ��������� 
	cout << "First matrix:"<<endl;
	for (int i = 0; i < n; i++) {
		arr1[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			cin>>arr1[i][j];
		}
	}
	cout << endl;
	int** arr2 = new int* [n]; //����� ������ ������� ���������
	cout << "Second matrix:"<<endl;
	for (int i = 0; i < n; i++) {
		arr2[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			cin >> arr2[i][j];
		}
	}
	cout << endl;
	int* st1 = new int[n]; //������ ������ , � ������� �������� ������� ������ ������ ������� ���������
	for (int i = 0; i < n; i++)
		st1[i] = step(arr1, i, n);
	int* st2 = new int[n]; //������ ������ , � ������� �������� ������� ������ ������ ������� ���������
	for (int i = 0; i < n; i++)
		st2[i] = step(arr2, i, n);
	for (int i = 0; i < n; i++) { // ������������ ��� ������� , ����� ����� ���������� ������� 
		for (int j = 0; j < n; j++) {
			if (st1[i] == st2[j])
			{
				st1[i] = -1; // ���� ����� �������, �� ��� �� �������� ����������� -1, ���� ��������� �� �� ����������� ��������, � ������ ����� ��������� �� ��������� �������� i ��� ��� �� ����� 
				st2[j] = -1;
				break;
			}
		}
	
	}
	bool flag = 1;
	for (int i = 0; i < n; i++) {
		if (st1[i] != -1 || st2[i] != -1) // ��������� ��� �� ������� ����� -1, ���� �� , �� flag ������� 1 � ����� ���������, ����� flag =0 � ����� �� ��������� 
			flag = 0;
	}
	if (flag)
		cout << "Isomorf";
	else cout << "Not isomorf";
}
