#include <iostream>

using namespace std;

struct Coord {
	int x;
	int y;
	void clear() {
		x = -1;
		y = -1;
	}
};

int main()
{
	srand(time(0));
	int n = 25;
	short** arr = new short* [n];
	for (int i = 0; i < n; i++) {
		arr[i] = new short[n];
		for (int j = 0; j < n; j++)
		{
			arr[i][j] = rand()%10;
		}
	}
	/*arr[11][0] = 1;
	arr[12][0] = 2;
	arr[13][0] = 3;
	arr[14][0] = 4;
	arr[15][0] = 5;
	arr[16][0] = 6;
	arr[17][0] = 7;
	arr[18][0] = 8;

	arr[0][0] = 8;
	arr[1][0] = 10;
	arr[2][0] = 8;
	arr[3][0] = 7;
	arr[4][0] = 6;
	arr[5][0] = 5;
	arr[6][0] = 4;
	arr[7][0] = 3;
	arr[8][0] = 2;
	arr[9][0] = 1;

	arr[11][10] = 1;
	arr[12][10] = 2;
	arr[13][10] = 3;
	arr[14][10] = 4;
	arr[15][10] = 5;
	arr[16][10] = 6;
	arr[17][10] = 7;
	arr[18][10] = 8;*/
	Coord* t = new Coord[8];
	bool flag1 = 1;
	bool flag2 = 1;
	int k = 0;
	for (int i = 0; i < n; i++) {
		int x = 8;
		k = 0;
		Coord* t = new Coord[8];
		for (int j = 0; j < n-1; j++) {
			x = 8 - k;
			if (arr[j][i] == x)
			{
				k++;
				t[k-1].x = j;
				t[k-1].y = i;
			}
			else
			{
				k = 0;
				for (int l = 0; l < 8; l++)
				{
					t[l].clear();
				}
				
			}
			if (k == 8)
			{
				for (int i = 0; i < n; i++)
				{
					for (int j = 0; j < n; j++)
						cout << arr[i][j] << " ";
					cout << endl;
				}
				cout<<"Up->Down"<<endl;
				for (int l = 0; l < 8; l++)
					cout << "{" << t[l].x << "," << t[l].y << "}" << endl;
			}
		}
		
	}
	for (int i = 0; i < n; i++) {
		int x = 8;
		k = 0;
		Coord* t = new Coord[8];
		for (int j = n-1; j >1; j--) {
			x = 8 - k;
			if (arr[j][i] == x)
			{
				k++;
				t[k - 1].x = j;
				t[k - 1].y = i;
			}
			else
			{
				k = 0;
				for (int l = 0; l < 8; l++)
				{
					t[l].clear();
				}

			}
			if (k == 8)
			{
				for (int i = 0; i < n; i++)
				{
					for (int j = 0; j < n; j++)
						cout << arr[i][j]<<" ";
					cout << endl;
				}
				cout << "Down->Up" << endl;
				for (int l = 0; l < 8; l++)
					cout << "{" << t[l].x << "," << t[l].y << "}" << endl;
			}
		}

	}
	/*for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
			cout << arr[i][j]<<" ";
		cout << endl;
	}*/
}
