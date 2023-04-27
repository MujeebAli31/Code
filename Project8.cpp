// Project8.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include"HealthData.h"
#include"HealthTracker.h"
#include<sstream>
#include<string>
void getUserInfo(string& username, string& usergender, int& userage, int& historySize) {
    cout << "Name: ";
    getline(cin, username);
    cout << "Gender: ";
    getline(cin, usergender);
    cout << "Age: ";
    cin >> userage;
    cout << "Fitness inputs: ";
    bool invalidInput = true;
    do {
        cin >> historySize;
        if (cin.fail() || historySize < 1) {
            cout << "Invalid input. Please enter a positive integer." << endl;
            cin.clear();
            cin.ignore(10000, '\n');
        }
        else {
            invalidInput = false;
        }
    } while (invalidInput);
}

int main()
{
    string username;
    string usergender;
    int userage;
    int historySize;
    getUserInfo(username, usergender, userage, historySize);
    HealthTracker healthTracker(username, usergender, userage, historySize);
    healthTracker.menu();
    return 0;
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
