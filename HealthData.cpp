#include"HealthTracker.h"
#include<iostream>
#include<string>
using namespace std;
HealthData::HealthData()
{
	userweight = 0.0;
	exercisetype = "";
	exercisetime = 0.0;
}
HealthData::HealthData(double userW, string exerciseTp, double exerciseT)
{
	userweight = userW;
	exercisetype = exerciseTp;
	exercisetime = exerciseT;
}
void HealthData::setWeight(double userW)
{
	userweight = userW;
}
void HealthData::setExercisetype(string exerciseTp)
{
	exercisetype = exerciseTp;
}
void HealthData::setExercisetime(double exerciseT)
{
	exercisetime = exerciseT;
}
string HealthData::getExercisetype()
{
	return exercisetype;
}
double HealthData::getExercisetime()
{
	return exercisetime;
}
double HealthData::getWeight()
{
	return userweight;
}
void HealthData::print()
{
	cout << "Weight: " << userweight << "kg" << endl;
	cout << "Exercise: " << exercisetype << " (" << fixed << setprecision(1) << exercisetime << " minutes)" << endl;
}
