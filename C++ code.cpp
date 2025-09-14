#include <iostream>
#include <string>
#include <vector>
using namespace ::std;
int main() {
    string str1 = "AaBbCcDd";
    cout << "строчка с заглавными буквами: ";
    for (int i = 0; i < str1.length(); i += 2) 
    cout << str1[i];
    cout << endl;
    cout << "строчка со строчными буквами: ";
    for (int i = 1; i < str1.length(); i += 2) 
    cout << str1[i];
    cout << endl;
    vector<string> str2 = {"a", "1", "b", "2", "c", "3"};
    cout << "буквы: ";
    for (int i = 0; i < str2.size(); i += 2) 
    cout << str2[i] << " ";
    cout << endl;
    cout << "цифры: ";
    for (int i = 1; i < str2.size(); i += 2) 
    cout << str2[i] << " ";
    return 0;
}



