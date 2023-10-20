#include <iostream>
#include <string>
#include <fstream>
using namespace std;
struct Hash {
    string Zna="";
    int key;
};
int hash_function(string a, int n)
{
    int key = 0;
    for(int i=0;i<a.size();i++)
        key += a[i] % n;
    return key;
}
string gen(int m) {
    string a = "";
    char c =' ';
    while (a.size() < m)
    {
        c = '0' + rand() % 122;
        if ((c >= 48 and c <= 57) or (c >= 65 and c <= 90) or (c >= 97 and c <= 122))
        {
            a+=c;
        }
    }
    return a;
}

int main()
{
    srand(time(0));
    int m,n;
    cin >>n;
    Hash* h = new Hash[n];
    for (int i = 0; i < n; i++)
    {
        cin >> m;
        h[i].Zna = gen(m);
        h[i].key = hash_function(h[i].Zna, n);
    }
    for (int i = 0; i < n; i++)
    {
        cout<<h[i].Zna <<" "<< h[i].key << endl;
    }
}
