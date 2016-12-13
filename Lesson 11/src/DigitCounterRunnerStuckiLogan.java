//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Digit Counter

/** Output:
234 contains 3 digits
10000 contains 5 digits
111 contains 3 digits
9005 contains 4 digits
84645 contains 5 digits
8547 contains 4 digits
123456789 contains 9 digits
 */

import static java.lang.System.*;

public class DigitCounterRunnerStuckiLogan {
	public static void main(String args[]) {
		System.out.println("234 contains " + DigitCounterStuckiLogan.countDigits(234) + " digits");
		System.out.println("10000 contains " + DigitCounterStuckiLogan.countDigits(10000) + " digits");
		System.out.println("111 contains " + DigitCounterStuckiLogan.countDigits(111) + " digits");
		System.out.println("9005 contains " + DigitCounterStuckiLogan.countDigits(9005) + " digits");
		System.out.println("84645 contains " + DigitCounterStuckiLogan.countDigits(84645) + " digits");
		System.out.println("8547 contains " + DigitCounterStuckiLogan.countDigits(8547) + " digits");
		System.out.println("123456789 contains " + DigitCounterStuckiLogan.countDigits(123456789) + " digits");
	}
}