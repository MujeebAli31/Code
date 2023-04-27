#include "HealthTracker.h"
#include "HealthData.h"
#include <iostream>
#include<string>
#include<iomanip>
using namespace std;
HealthTracker::HealthTracker(string userN, string userG, int userA, int sI)
{
	username = userN;
	usergender = userG;
	userage = userA;
	size = sI;
	history = new HealthData[size];
	counter = 0;
}
HealthTracker::~HealthTracker()
{
	delete[]history;
}
void HealthTracker::input()
{
	if (counter >= size)
	{
		cout << "OVERFLOW" << endl;
		counter = size - 1;
	}
	double userweight;
	string exercisetype;
	double exercisetime;
	cout << "Weight in kg: ";
	cin >> userweight;
	while (cin.fail())
	{
		cout << "Enter only numeric values!" << endl;
		cout << "Weight in kg: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userweight;
	}
	history[counter].setWeight(userweight);
	cout << "Exercise type: ";
	cin.ignore();
	getline(cin,exercisetype);
	history[counter].setExercisetype(exercisetype);
	cout << "Exercise time: ";
	cin >> exercisetime;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Exercise time: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >>userweight;
	}
	history[counter].setExercisetime(exercisetime);
	counter++;
}
void  HealthTracker::printHistory() const
{
	{
		cout << "Fitness History for " << username << " (" << usergender << ", " << userage << "):" << endl;
		if (counter == 0) {
			cout << "No data entered" << endl;
		}
		else {
			for (int i = counter - 1; i >= 0; i--)
			{
				history[i].print();
			}
		}
	}
}
void HealthTracker::printRecent() const
{
	if (counter == 0)
	{
		cout << "NO DATA" << endl;
	}
	else
	{
		cout << "   " << username << " (" << usergender << ", " << userage << ")" << endl;
		cout << "Weight: " << history[counter - 1].getWeight() << "kg" << endl;
		cout << "Exercise: " << history[counter - 1].getExercisetype() << " (" << history[counter - 1].getExercisetime() << " minutes)" << endl;;
	}
}
void HealthTracker::menu()
{
	int options;
	do {
		cout << "Use the menu below:" << endl;
		cout << "1: to enter your information" << endl;
		cout << "2: to print your information" << endl;
		cout << "3: to print your fitness history" << endl;
		cout << "4: to exit" << endl;
		cin >> options;
		switch (options)
		{
		case 1:
			input();
			break;
		case 2:
			printRecent();
			break;
		case 3:
			printHistory();
			break;
		}
	}
	while (options == 1 || options == 2 || options == 3);
	delete[]history;
}
