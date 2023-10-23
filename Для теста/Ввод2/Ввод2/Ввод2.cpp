#include <iostream>
#include <fstream>
#include <string>
#include <Windows.h>

using namespace std;

int main()
{
    string n = "";


    while (1)
    {
        getline(cin, n);
        ofstream file("O:\cheks.txt", ios::app);
        file << "Alt: " << n;
        file.close();
    }
}