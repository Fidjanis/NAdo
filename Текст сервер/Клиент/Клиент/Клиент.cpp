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
    return "Ваш индекс массы тела = " + IMT;
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
    setlocale(LC_ALL, "ru");
    char c;
    int ID;
    cout << "Введите ID клиента\n";
    cin >> ID;
    while (true) {
        c = _getch();
        if (c == 'e') {
            return 1;
        }
        else {
            cout << "Введите имя, рост, вес\n";
            Person p;
            cin >> p.name >> p.height >> p.weight;
            addPersonInFile("Z:/сервер и клиен/Для теста/text.txt", p, ID);
            string lastAnswer = getLastTaskFromFile("Z:/сервер и клиен/Для теста/answer.txt");
            while ((lastAnswer == "" || getClientIdFromAnswer(lastAnswer) != ID)) {
                Sleep(200);
                lastAnswer = getLastTaskFromFile("Z:/сервер и клиен/Для теста/answer.txt");

            }
            string clientMessage = getClientMessage(lastAnswer);
            cout << clientMessage << endl << endl;
            Sleep(200);
        }
    }
}