
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Digit Counter

import static java.lang.System.*;

public class DigitCounterStuckiLogan {
	public static int countDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum++;
			number /= 10;
		}
		return sum;
	}
}