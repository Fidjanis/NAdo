#include <iostream>
#include <fstream>
#include <string>
#include <Windows.h>
#include <conio.h>

using namespace std;

struct Person {
    string name;
    double height;
    double weight;
};

void addPersonInFile(string fileName, Person p, int ID) {
    fstream f(fileName, ios::app);
    f << ID << ' ' << p.name << ' ' << p.height << ' ' << p.weight << ' ' << endl;
    f.close();
}

string getLastTaskFromFile(string fileName) {
    fstream f(fileName, ios::in);
    string task = "";
    string currentLine;
    while (getline(f, currentLine)) {
        task = currentLine;
    }
    return task;
}

string getClientMessage(string answerTask) {
    for (auto it = answerTask.begin(); it < answerTask.end() && *it != ' ';) {
        it = answerTask.erase(it);
    }
    answerTask.erase(answerTask.begin());
    string IMT = answerTask;
    return "Your IMT = " + IMT;
}

int getClientIdFromAnswer(string s) {
    string number = "";
    for (int i = 0; i < s.length() && s[i] != ' '; i++) {
        number += s[i];
    }
    return stod(number);
}

int main()
{
    int ID;
    cout << "Input ID clienta\n";
    cin >> ID;
    while (true) {
        cout << "Input name, height, weight\n";
        Person p;
        cin >> p.name >> p.height >> p.weight;
        addPersonInFile("Z:/Разумовский/сервер и клиен/Для теста/text.txt", p, ID);
        Sleep(200);
        
    }
}