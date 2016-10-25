//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/10/16
//Class - 6th period
//Lab  - Distance lab

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceStuckiLogan {
	private int x1,y1,x2,y2;

	public DistanceStuckiLogan() {
		this(0,0,0,0);
	}

	public DistanceStuckiLogan(int xOne, int yOne, int xTwo, int yTwo) {
		setCoordinates(xOne, yOne, xTwo, yTwo);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo) {
		x1 = xOne;
		y1 = yOne;
		x2 = xTwo;
		y2 = yTwo;
	}

	public String determineClosest() {
		double distanceA = 0.0, distanceB = 0.0;
		String result="";
		
		distanceA = Math.sqrt(Math.pow(0 - x1, 2) + Math.pow(0 - y1, 2));
		distanceB = Math.sqrt(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2));

		if(distanceA>distanceB) {
			result += "B";
		}
		if(distanceB>distanceA) {
			result += "A";
		}
		
		result += " is closer to (0,0)";

		return result;
	}
	
	public String toString() {
		return "";
	}
}
