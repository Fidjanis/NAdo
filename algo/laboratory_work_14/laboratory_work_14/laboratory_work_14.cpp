#include <iostream>

using namespace std;
/*
int main()
{
	int n;
	cin >> n;
	int** arr2 = new int* [n];
	for (int i = 0; i < n; i++) {
		arr2[i] = new int[n];
		for (int j = 0; j < n; j++)
		{
			arr2[i][j] = 0;
		}
	}
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
			cout << arr2[i][j];
		cout << endl;
	}

}
*/
#include <fstream>
#include <iostream>
using namespace std;
int** P;
int MAX_SIZE = 1000;
int n = 100;
int S() {
	int k = 0;
	for (int i = 0; i < n; i++) {
		int size = 0, x = 0, y = 0;
		k += 3;
		for (int j = 0; j < n-1; j++) {
			if (P[i][j] == 1) {
				x = i;
				y = j;
				k += 3;
				for (j; P[i][y + 1] != 0;) {
					y++;
					k += 3;
				}
				k += 2;
				for (j;P[i - 1][y] == 0;)
				{
					i++;
					size++;
					k += 4;
				}
				k += 2;
				x = i;
				k += 1;
			}
			k += 1;
		}

		/*if (size != 0) {
			cout << "����������� ����� ������ �������!\n";
			cout << "���������� ������ �������� ����: (" << x - size / 2 << ", " << y - (size-1)<< ")\n";
			cout << "���������� ������� ������� ����: (" << x + size / 2 << ", " << y + (size-1) << ")\n";
			cout << endl;
		}*/

	}
	return k;
}


void F(int x, int y, int t)
{

	int x1 = x, y1 = y;
	bool flag_1 = 0;
	int l = 0;
	for (flag_1;!flag_1 or l < t + t - 1;)
	{
		for (flag_1;l < t + t - 1 and !flag_1;)
		{
			for (flag_1;l < t and P[x1 + 1][y1] != 1 and P[x1 - 1][y1] != 1 and P[x1][y1 + 1] != 1 and P[x1][y1 - 1] != 1 and !flag_1;)
			{
				l++;
				if (P[x1][y1] != 0)
					flag_1 = 1;
				if (P[x1 + 1][y1] == 1 or P[x1 - 1][y1] == 1 or P[x1][y1 + 1] == 1 or P[x1][y1 - 1] == 1)
					flag_1 = 1;
				x1++;
				y1 -= 1;
			}
			for (flag_1;l < t + t - 1 and P[x1 + 1][y1] != 1 and P[x1 - 1][y1] != 1 and P[x1][y1 + 1] != 1 and P[x1][y1 - 1] != 1 and !flag_1;)
			{
				l++;
				if (P[x1][y1] != 0)
					flag_1 = 1;
				x1++;
				y1++;
			}
			break;
		}
		break;
	}
	l = 0;
	x1 = x;
	y1 = y;
	if (!flag_1)
	{
		for (flag_1; l < t - 1;) {
			P[x1][y1] = 1;
			l++;
			x1++;
			y1 -= 1;
		}
		for (flag_1;l < t + t - 1;)
		{
			P[x1][y1] = 1;
			l++;
			x1++;
			y1++;
		}
	}
	else
	{


		cout << "�� ���������";
	}
}
int main()
{
	srand(time(0));
	ofstream f("myfile.txt");
	setlocale(LC_ALL, "rus");
	//for (n = 100; n <= MAX_SIZE; n += 100)
	//{
	int n =100;
		P = new int* [n];
		for (int i = 0; i < n; i++)
		{
			P[i] = new int[n];
			for (int j = 0; j < n; j++)
			{
				P[i][j] = 0;
			}
		}
		int h = 5;
		int x = rand() % 15;
		int y = rand() % 15;
		int t = rand() % 15;
		F(x, y, t);
		int k = S();
		cout << "n=" << n << ": " << k << endl;
		f << "n=" << n << ": " << k << endl;
		cout << endl << endl << endl;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				cout << P[i][j];
			cout << endl;
		}/*���� ���� �������� ��������� �� ���, ���� � ���, ��� ���� ������ ����������� � ������, � ��������� �� ��� � ������, ������� �� ������) 
		 ��� ���� �� �������� ������ ������� ����� �������, ����� ����������� � ������, � ������ �� ��� � ������, ����� ����� ������� ����� �� 
		 �������� - ��� t, �� ������ ��� ������ � ���� ������� , �� ���� �������� �������, ���� ����� ������ � ������ ��, �� ������ ��� �� 
		 ��������� ��� ������� ���� , ��� ����������� ������� ����� ����� , ����� �������� ������� ������, �� ���� �� ��, ������ ���� ����� 
		 ����������� ����� ���������� ����� ����� ����������� � ����� ������
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (P[i][j] == 1)
				{
					for(int t=1;t<h;t++)
					P[i][j - t] = 1;
				}
			}
			cout << endl;
		}*/
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (P[i][j] == 1)
				{
					for(int t=1;t<h;t++)
					P[i][j - t] = 1;
				}
			}
			cout << endl;
		}
		cout << endl << endl << endl;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
				cout << P[i][j];
			cout << endl;
		}
		cout << "x=" << x << " " << "y=" << y << " " << "t=" << t;
	//}
}


