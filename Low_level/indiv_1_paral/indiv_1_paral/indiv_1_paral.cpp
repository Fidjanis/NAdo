#include <omp.h>
#include <iostream>

using namespace std;

void rand_mat(int *arr,int n) {
    for (int i = 0; i < n; i++)
        //for (int j = 0; j < n; j++)
        arr[i] = rand() % 100;
}

void buble_mat(int** arr, int n)
{
    int temp;
    for (int i = 0; i < n; i++) {
        bool flag = 1;
        for (int j = 1; j < n; j++) {
            if (arr[i][j - 1] < arr[i][j]) {
                flag = 0;
                temp = arr[i][j - 1];
                arr[i][j - 1] = arr[i][j];
                arr[i][j] = temp;
            }
            else
                flag = 1;
            if (flag == 0)
                j = 0;
        }

    }
}
void buble_arr(int* arr, int n)
{
    int temp, i;

    #pragma omp parallel private (i) num_threads(4)
    {
        bool flag = 1;
        #pragma omp for
        for(int j=0;j<n;j++)
            for (i = 1; i < n; i++) {
                    if (arr[i - 1] < arr[i]) {
                    //flag = 0;
                    //temp = arr[i - 1];
                    //arr[i - 1] = arr[i];
                    //arr[i] = temp;
                    swap(arr[i - 1], arr[i]);
                    }
                
            }
    }
}

int main()
{
    srand(time(0));
    int n;
    cin >> n;
    //int** arr = new int* [n];
    //for (int i = 0; i < n; i++)
        //arr[i] = new int[n];
    int* arr = new int[n];
    rand_mat(arr, n);
    for (int i = 0; i < n; i++)
    {
        //for (int j = 0; j < n; j++)
            cout << arr[i]<< " ";
    }
    cout << endl << endl;
    buble_arr(arr, n);
    for (int i = 0; i < n; i++)
    {
        //for (int j = 0; j < n; j++)
            cout << arr[i] << " ";
    }

}


