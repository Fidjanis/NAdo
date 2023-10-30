
#include <iostream>
#include <fstream>
#include <string>
#include <Windows.h>
#include <stdexcept>

using namespace std;

const int NAME_SIZE = 25;

struct Request {
    int client_id;
    char name[NAME_SIZE];
    double height;
    double weight;
};

struct Answer {
    int client_id;
    double IMT;
};

void writeRequest(const string& fileName, Request& request) {
    fstream f(fileName, ios::binary | ios::app);
    if (!f) {
        throw runtime_error("Файл не открылся");
    }
    f.write(reinterpret_cast<const char*>(&request), sizeof(request));
    f.close();
}

Answer getLastAnswer(const string& fileName, long currentSize) {
    size_t size_of_answer = sizeof(Answer);
    long last_answer_position = currentSize - size_of_answer;

    fstream f(fileName, ios::in | ios::binary);
    if (!f) {
        throw runtime_error("Файл не открылся");
    }

    Answer lastAnswer;
    f.seekg(last_answer_position);
    f.read((char*)&lastAnswer, sizeof(Answer));
    f.close();
    return lastAnswer;
}

long getSizeOfFile(const string& fileName) {
    fstream f(fileName, ios::binary | ios::app);
    if (!f) {
        throw runtime_error("Файл не открылся");
    }
    f.seekg(0, ios::end);
    long previousSize = f.tellg();
    f.close();
    return previousSize;
}

int main()
{
    setlocale(LC_ALL, "ru");
    const string PATH_ANSWERS = "Z:/бинарка/answer.bin";
    const string PATH_REQUESTS = "Z:/бинарка/request.bin";
    cout << "Введите ID клиента\n";
    int client_id;
    cin >> client_id;
    while (true) {
        Request request;
        cout << "\nВведите имя (или напишите 0 если вы хотите выйти)\n";
        string name;
        cin >> name;
        if (name == "0") {
            return 1;
        }

        for (int i = 0; i < NAME_SIZE; i++) {
            request.name[i] = '0';
        }
        for (int i = 0; i < name.length(); i++) {
            request.name[i] = name[i];
        }

        cout << "Введите рост и вес\n";
        cin >> request.height >> request.weight;
        request.client_id = client_id;

        long previousSizeOfAnswers = getSizeOfFile(PATH_ANSWERS);
        writeRequest(PATH_REQUESTS, request);
        Sleep(200);
        long currentSizeOfAnswers = getSizeOfFile(PATH_ANSWERS);
        Answer lastAnswer = getLastAnswer(PATH_ANSWERS, currentSizeOfAnswers);
        while (previousSizeOfAnswers >= currentSizeOfAnswers || lastAnswer.client_id != request.client_id) {
            cout << "Нет ответа\n";
            Sleep(100);
            lastAnswer = getLastAnswer(PATH_ANSWERS, currentSizeOfAnswers);
            currentSizeOfAnswers = getSizeOfFile(PATH_ANSWERS);
        }
        cout << "Ваш индекс массы тела = " << lastAnswer.IMT << endl;
    }
}