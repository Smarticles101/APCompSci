//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Miles Per Hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHourStuckiLogan {
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHourStuckiLogan() {
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHourStuckiLogan(int dist, int hrs, int mins) {
		setNums(dist, hrs, mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins) {
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH() {
		double hours = (double)minutes/60.0;
		hours+=this.hours;
		
		mph = (double)distance/hours;
	}

	public void print() {
		System.out.println("\n" + distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH." + "\n\n");
	}
}
