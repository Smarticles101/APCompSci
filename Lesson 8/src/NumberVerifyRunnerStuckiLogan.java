//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date -  22/10/16
//Class - 6th period
//Lab  - Number verify

/* Output:
Enter a whole number :: 111
111 is odd :: true
111 is even :: false
Enter a whole number :: 2000
2000 is odd :: false
2000 is even :: true
Enter a whole number :: -99
-99 is odd :: true
-99 is even :: false
Enter a whole number :: 1111
1111 is odd :: true
1111 is even :: false
Enter a whole number :: -850
-850 is odd :: false
-850 is even :: true
*/

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunnerStuckiLogan {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.print("Enter a whole number :: ");
		num = in.nextInt();
		System.out.println(num+" is odd :: " + NumberVerifyStuckiLogan.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerifyStuckiLogan.isEven(num));
		
		System.out.print("Enter a whole number :: ");
		num = in.nextInt();
		System.out.println(num+" is odd :: " + NumberVerifyStuckiLogan.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerifyStuckiLogan.isEven(num));
		
		System.out.print("Enter a whole number :: ");
		num = in.nextInt();
		System.out.println(num+" is odd :: " + NumberVerifyStuckiLogan.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerifyStuckiLogan.isEven(num));
		
		System.out.print("Enter a whole number :: ");
		num = in.nextInt();
		System.out.println(num+" is odd :: " + NumberVerifyStuckiLogan.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerifyStuckiLogan.isEven(num));
		
		System.out.print("Enter a whole number :: ");
		num = in.nextInt();
		System.out.println(num+" is odd :: " + NumberVerifyStuckiLogan.isOdd(num));
		System.out.println(num+" is even :: " + NumberVerifyStuckiLogan.isEven(num));
	}
}
