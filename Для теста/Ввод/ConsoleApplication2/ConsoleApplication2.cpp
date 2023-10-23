#include <iostream>
#include <fstream>
#include <string>
#include <Windows.h>

using namespace std;

int main()
{
    string nickname;
    string n;
    cout << "input nickname" << endl;
    getline(cin, nickname);
    cout << "input zapis" << endl;

    while (1)
    {
        getline(cin, n);
        ofstream file("O:\cheks.txt", ios::app);
        file << "@" << nickname << ": " << n << endl;
        file.close();
    }
}