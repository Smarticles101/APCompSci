//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Quadratic lab

/*
 * Output:
Enter a :: 5
Enter b :: -8
Enter c :: 3

Root one :: 1.00
Root two :: 0.60


Enter a :: 3
Enter b :: 2
Enter c :: -7

Root one :: 1.23
Root two :: -1.90


Enter a :: 9
Enter b :: 6
Enter c :: 1

Root one :: -0.33
Root two :: -0.33
*/

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunnerStuckiLogan {
	public static void main(String[] args) {
		int a, b, c;
		QuadraticStuckiLogan test;
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter a :: ");
		a = in.nextInt();
		System.out.print("Enter b :: ");
		b = in.nextInt();
		System.out.print("Enter c :: ");
		c = in.nextInt();
		
		test = new QuadraticStuckiLogan(a, b, c);
		test.calcRoots();
		test.print();
		
		
		System.out.print("Enter a :: ");
		a = in.nextInt();
		System.out.print("Enter b :: ");
		b = in.nextInt();
		System.out.print("Enter c :: ");
		c = in.nextInt();
		
		test = new QuadraticStuckiLogan(a, b, c);
		test.calcRoots();
		test.print();
		
		
		System.out.print("Enter a :: ");
		a = in.nextInt();
		System.out.print("Enter b :: ");
		b = in.nextInt();
		System.out.print("Enter c :: ");
		c = in.nextInt();
		
		test = new QuadraticStuckiLogan(a, b, c);
		test.calcRoots();
		test.print();
	}
}
