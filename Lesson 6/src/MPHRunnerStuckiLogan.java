//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Miles Per Hour

/*
 * Output:
Enter the distance :: 45
Enter the hours :: 0
Enter the minutes :: 32

45 miles in 0 hours and 32 minutes = 84 MPH.


Enter the distance :: 96
Enter the hours :: 1
Enter the minutes :: 43

96 miles in 1 hours and 43 minutes = 56 MPH.


Enter the distance :: 100
Enter the hours :: 2
Enter the minutes :: 25

100 miles in 2 hours and 25 minutes = 41 MPH.


Enter the distance :: 50
Enter the hours :: 2
Enter the minutes :: 25

50 miles in 2 hours and 25 minutes = 21 MPH.
*/

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunnerStuckiLogan {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		MilesPerHourStuckiLogan test = new MilesPerHourStuckiLogan(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		//add more test cases
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test = new MilesPerHourStuckiLogan(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test = new MilesPerHourStuckiLogan(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();

		test = new MilesPerHourStuckiLogan(dist, hrs, mins);
		test.calcMPH();
		test.print();
	}
}
