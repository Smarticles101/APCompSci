//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Distance lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceStuckiLogan {
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public DistanceStuckiLogan() {
		this(0, 0, 0, 0);
	}

	public DistanceStuckiLogan(int x1, int y1, int x2, int y2) {
		setCoordinates(x1, y1, x2, y2);
		distance = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow(xTwo - xOne, 2) + Math.pow(yTwo - yOne, 2));
	}

	public void print() {
		System.out.println("Distance == " + String.format("%.3f", distance) + "\n\n");
	}
}
