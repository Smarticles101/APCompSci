
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Digit Avg

import static java.lang.System.*;

public class DigitMathStuckiLogan {
	private static int countDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum++;
			number /= 10;
		}
		return sum;
	}

	private static int sumDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static double averageDigits(int number) {
		return (double) sumDigits(number) / (double) countDigits(number);
	}
}