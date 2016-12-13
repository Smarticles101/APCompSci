//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Digit Avg

/** Output:
The digit average of 234 is 3.0
The digit average of 10000 is 0.2
The digit average of 111 is 1.0
The digit average of 9005 is 3.5
The digit average of 84645 is 5.4
The digit average of 8547 is 6.0
The digit average of 123456789 is 5.0
*/

import static java.lang.System.*;

public class DigitMathRunnerStuckiLogan {
	public static void main(String args[]) {
		/**
		 * 234 10000 111 9005 84645 8547 123456789
		 */
		System.out.println("The digit average of 234 is " + DigitMathStuckiLogan.averageDigits(234));
		System.out.println("The digit average of 10000 is " + DigitMathStuckiLogan.averageDigits(10000));
		System.out.println("The digit average of 111 is " + DigitMathStuckiLogan.averageDigits(111));
		System.out.println("The digit average of 9005 is " + DigitMathStuckiLogan.averageDigits(9005));
		System.out.println("The digit average of 84645 is " + DigitMathStuckiLogan.averageDigits(84645));
		System.out.println("The digit average of 8547 is " + DigitMathStuckiLogan.averageDigits(8547));
		System.out.println("The digit average of 123456789 is " + DigitMathStuckiLogan.averageDigits(123456789));
	}
}