#pragma once
#include<string>
#include<iomanip>
using namespace std;
class HealthData
{
private:
	double userweight;
	string exercisetype;
	double exercisetime;
public:
	HealthData();
	HealthData(double userW, string exerciseTp, double exerciseT);
	void setWeight(double userW);
	void setExercisetype(string exerciseTp);
	void setExercisetime(double exerciseT);
	double getWeight();
	string getExercisetype();
	double getExercisetime();
	void print();


};

