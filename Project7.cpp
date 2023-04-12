#include <iostream>
#include<string>
using namespace std;
struct Fitness {
	double userweight;
	double exercisetype;
	string exercisetime;
};
void getUserInfo(string& username, string& usergender, int& userage)
{
	cout << "Personal Fitness Application\n";
	cout << "Name: ";
	getline(cin, username);
	cout << "Gender: ";
	cin >> usergender;
	cout << "Age: ";
	cin >> userage;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Age:";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userage;
	}
}
void printMenu()
{
	cout << "Use the menu below:" << endl;
	cout << "1: to enter your information" << endl;
	cout << "2: to print your information" << endl;
	cout << "3: to print your fitness history" << endl;
	cout << "4: to exit" << endl;

}
int getUserChoice()
{
	int options;
	bool invalidInput = true;
	do {
		cout << "Press 1, 2, 3 or 4" << endl;
		cin >> options;
		if (cin.fail() || options < 1 || options>4)
		{
			cout << "Option 1, 2, 3, 4 is not selected. Please choose 1, 2, 3 or 4" << endl;
			cin.clear();
			cin.ignore(10000, '\n');
		}
		else
		{
			invalidInput = false;
		}
	} while (invalidInput);
	return options;
}
void input(Fitness userInput[], int& count, int size)
{
	if (count == size)
	{
		for (int i = 0; i < size - 1; i++)
		{
			userInput[i].userweight = userInput[i + 1].userweight;
			userInput[i].exercisetime = userInput[i + 1].exercisetime;
			userInput[i].exercisetype = userInput[i + 1].exercisetype;
		}
		count = count - 1;
	}
	cout << "Weight in kg: ";
	cin >> userInput[count].userweight;
	while (cin.fail())
	{
		cout << "Enter only numeric values!" << endl;
		cout << "Weight in kg: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userInput[count].userweight;
	}
	cout << "Exercise type: ";
	cin.ignore();
	getline(cin, userInput[count].exercisetype);
	cout << "Exercise time: ";
	cin >> userInput[count].exercisetime;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Exercise time: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> userInput[count].exercisetime;
	}
	count++;
}
void print(const string& username, const string& usergender, const int& userage, const Fitness& userInput)
{
	cout << "   " << username << "(" << usergender << "," << userage << ")" << endl;;
	cout << "Weight: " << userInput.userweight << "kg" << endl;
	cout << "Exercise: " << userInput.exercisetype << " " << "(" << userInput.exercisetime << " minutes" << ")" << endl;
}
void printHistory(const Fitness* userInput, const string& username, const string& usergender, const int& userage, const int& count)
{
	cout << "Fitness History for " << username << " (" << usergender << ", " << userage << "):" << endl;
	if (count == 0) {
		cout << "No data entered" << endl;
	}
	else {
		for (int i = count - 1; i >= 0; i--)
		{
			print(username, usergender, userage, userInput[i]);
		}
	}
}
int main()
{
	int size;
	cout << "Enter the max number: ";
	cin >> size;
	while (cin.fail())
	{
		cout << "Input is not valid! Enter only numeric values!" << endl;
		cout << "Enter the max number: ";
		cin.clear();
		cin.ignore(10000, '\n');
		cin >> size;
	}
	cin.ignore(10000, '\n');
	string username;
	string usergender;
	int userage;
	getUserInfo(username, usergender, userage);
	Fitness* userInput = new Fitness[size];
	int count = 0;
	int options = 0;

	do {
		printMenu();
		options = getUserChoice();
		switch (options) {
		case 1:
			input(userInput, count, size);
			break;
		case 2:
			if (count > 0) {
				print(username, usergender, userage, userInput[count - 1]);
			}
			else
			{
				cout << "Data not entered" << endl;
			}
			break;
		case 3:
			printHistory(userInput, username, usergender, userage, count);
			break;
		}
	} while (options == 1 || options == 2 || options == 3);
	delete[]userInput;
	return 0;
}

