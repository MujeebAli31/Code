#pragma once
#include <sstream>
#include "HealthData.h"
#include<string>
using namespace std;
class HealthTracker
{
private:
	string username;
	string usergender;
	int userage;
	int size;
	HealthData*history ;
	int counter;
public:
	HealthTracker(string userN, string userG, int userA, int sI);
	~HealthTracker();
	void input();
	void printHistory()const;
	void printRecent()const;
	void menu();
	void print() const;
};

