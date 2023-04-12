package edu.monmouth.lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;

public class Lab2 {
    public static void main(String[] args) {
    	PrintStream out = null;
    	try {
			out = new PrintStream(new File("Lab2.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	System.setOut(out);
    	System.setErr(out);
    	
    	State newJersey = new State("New Jersey", 130,  "Eastern Goldfinch");
    	State newYork = new State("New York", 127,  "Eastern Bluebird");
    	State pennsylvania = new State("Pennsylvania", 0,  "Ruffles Grouse");
    	State delaware = new State("Delaware", 28,  "Blue Hen");
    	State maryland = new State("Maryland", 31,  "Oriole");
    	State connecticut = new State("Connecticut", 96,  "Robin");
    	State newJersey2 = new State("New Jersey", 130,  "Eastern Goldfinch");
    	
    	Governor njGov = new Governor("Murphy", 65);
    	Governor nyGov = new Governor("Hochul", 64);
    	Governor paGov = new Governor("Shapiro", 49);
    	Governor deGov = new Governor("Carney", 66);
    	Governor mdGov = new Governor("Moore", 44);
    	Governor ctGov = new Governor("Lamont", 69);
	// verify State hashCode and equals methods are consistent
	 System.out.println("New Jersey:" + newJersey.equals(newJersey2));
     System.out.println("New Jersey hashcode: " + newJersey.hashCode());
     System.out.println(" 'New' New Jersey hashcode: " + newJersey2.hashCode());
	// verify Governor hashCode and equals methods are consistent
     System.out.println("NJ Governor: " + njGov.equals(njGov));
     System.out.println("NJ Governor hashcode: " + njGov.hashCode());
	// create a HashSet that can only house State objects
     HashSet<State> state = new HashSet<>();
	// attempt to insert all 7 State objects to the HashSet
	// print whether or not the object was added or not
     System.out.println("New Jersey: " + state.add(newJersey));
     System.out.println("New York: " + state.add(newYork));
     System.out.println("Pennsylvania: " + state.add(pennsylvania));
     System.out.println("Delaware: " + state.add(delaware));
     System.out.println("Maryland: " + state.add(maryland));
     System.out.println("Connecticut: " + state.add(connecticut));
     System.out.println("New Jersey2: " + state.add(newJersey2));
	
	// create a HashMap associating State and Governor objects
     HashMap<State, Governor> stateGovMap = new HashMap<>();
	// for the 6 unique State objects insert State and Governor objects 
     stateGovMap.put(newJersey, njGov);
     stateGovMap.put(newYork, nyGov);
     stateGovMap.put(pennsylvania, paGov);
     stateGovMap.put(delaware, deGov);
     stateGovMap.put(maryland, mdGov);
     stateGovMap.put(connecticut, ctGov);
	// print all elements in the HashMap
     for (State state2 : stateGovMap.keySet()) {
         System.out.println(state2.getName() + "," + stateGovMap.get(state2).getName());
	// print the governor for newYork State object
     System.out.println("NY Gov: " + stateGovMap.get(newYork).getName());
	// determine if the State object newJersey exists as a key
	// if it exists, print the governor
     Governor njGov2 = stateGovMap.get(newJersey);
     if (njGov2 != null) {
         System.out.println("NJ Gov: " + njGov2.getName());
     }
	// determine if the State object rhodeIsland exists as a key
	// if it exists, print the governor
     State rhodeIsland = new State("RI", 40, "RI Key");
     Governor rIGov = stateGovMap.get(rhodeIsland);
     if (rIGov != null) {
         System.out.println("RI Gov " + rIGov.getName());
     } else {
         System.out.println("Error no governer found");
     }
     }
    }
}

