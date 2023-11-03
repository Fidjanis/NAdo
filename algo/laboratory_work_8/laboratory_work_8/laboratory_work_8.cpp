#include <iostream>
using namespace std;
int n = 3;

bool dfs(int i, int **arr, bool *col) {
    if (col[i]) {
        return 0;
    }
    col[i] = true;
    for (int j = 0; j < n; ++j) {
        if (arr[i][j]) {
            dfs(j, arr, col);
        }
    }
}

bool IsTree(int **arr) {
    int edges = 0;
    for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
            if (arr[i][j]) {
                edges++;
            }
        }
    }
    if (edges != n - 1) {
        return false;
    }
    bool *col=new bool[n];
    memset(col, 0, sizeof(col));
    dfs(0, arr, col);
    for (int i = 0; i < n; ++i) {
        if (!col[i]) {
            return false;
        }
    }
    return true;
}
int main()
{
	int** A = new int* [n];
	for (int i = 0; i < n; i++) {
		A[i] = new int[n];
	}
	for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
        {
            cin >> A[i][j];
        }
	}
    cout << IsTree(A);
}


