
#include <iostream>
#include <fstream>
#include <string>
#include <Windows.h>

using namespace std;

int main()
{
    int size = 0;
    int new_size = 0;
    string n_inf;

    ifstream file("O:\cheks.txt");
    file.seekg(0, ios::end);
    size = file.tellg();
    while (1)
    {
        file.seekg(0, ios::end);
        new_size = file.tellg();
        if (size != new_size)
        {

            file.seekg(size);
            while (!file.eof())
            {
                getline(file, n_inf);
                if (n_inf != "/n")
                    cout << n_inf;
            }
            size = new_size;
        }
    }
    file.close();
}