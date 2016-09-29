//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Distance lab

/*
 * Output:
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
Distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
Distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
Distance == 1.414
*/

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunnerStuckiLogan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1, y1, x2, y2;
		DistanceStuckiLogan test;
		
		System.out.print("Enter X1 :: ");
		x1 = in.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = in.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = in.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = in.nextInt();
		
		test = new DistanceStuckiLogan(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.print("Enter X1 :: ");
		x1 = in.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = in.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = in.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = in.nextInt();
		
		test = new DistanceStuckiLogan(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
		
		System.out.print("Enter X1 :: ");
		x1 = in.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = in.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = in.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = in.nextInt();
		
		test = new DistanceStuckiLogan(x1, y1, x2, y2);
		test.calcDistance();
		test.print();
	}
}
