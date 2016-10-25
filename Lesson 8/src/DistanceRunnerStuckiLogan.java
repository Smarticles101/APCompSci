//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/10/16
//Class - 6th period
//Lab  - Distance lab

/* Output:
Enter X1 :: 3
Enter Y1 :: -2
Enter X2 :: -5
Enter Y2 :: -3
A is closer to (0,0)
Enter X1 :: 5
Enter Y1 :: 5
Enter X2 :: 1
Enter Y2 :: 2
B is closer to (0,0)
Enter X1 :: 9
Enter Y1 :: 9
Enter X2 :: 8
Enter Y2 :: 8
B is closer to (0,0)
Enter X1 :: 8
Enter Y1 :: 8
Enter X2 :: 9
Enter Y2 :: 9
A is closer to (0,0)
*/

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunnerStuckiLogan {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner( System.in );

		out.print("Enter X1 :: ");
		int xOne = keyboard.nextInt();
		out.print("Enter Y1 :: ");
		int yOne = keyboard.nextInt();
		out.print("Enter X2 :: ");
		int xTwo = keyboard.nextInt();
		out.print("Enter Y2 :: ");
		int yTwo = keyboard.nextInt();

		DistanceStuckiLogan test = new DistanceStuckiLogan();
		test.setCoordinates(xOne, yOne, xTwo, yTwo);
		out.println(test.determineClosest());
		
		//add more test cases
		
		for(int x = 0; x<3; x++) {
			out.print("Enter X1 :: ");
			xOne = keyboard.nextInt();
			out.print("Enter Y1 :: ");
			yOne = keyboard.nextInt();
			out.print("Enter X2 :: ");
			xTwo = keyboard.nextInt();
			out.print("Enter Y2 :: ");
			yTwo = keyboard.nextInt();

			test.setCoordinates(xOne, yOne, xTwo, yTwo);
			out.println(test.determineClosest());
		}
	}
}
