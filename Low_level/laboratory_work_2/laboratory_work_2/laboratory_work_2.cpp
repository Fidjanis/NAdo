#include <iostream>

using namespace std;

void w1() {
    int a, del = 10, sum = 0;
    cin >> a;
    _asm {
    M:mov edx, 0
    mov eax, a
    div del
    add sum, edx
    mov a, eax
    cmp a, 0
    jne M
    }
    cout << sum;
}

void w2() {
    int a, del = 10, sum = 0, two = 2, b,d ;
    cin >> a;
    _asm {
    M:mov edx, 0
    mov eax, a
    div del
    mov b, eax
    mov d, edx
    mov eax, d
    mov edx,0
    div two
    mov d, edx
    cmp d, 0
    je m1
    jmp M
    m1 : mov eax, d
    add sum, eax
    cmp b, 0
    jne M
    }
    cout << sum;
   
}

int main()
{
    //w1();
    w2();
}


