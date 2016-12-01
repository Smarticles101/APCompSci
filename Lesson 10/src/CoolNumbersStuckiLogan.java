
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Cool Numbers

import static java.lang.System.*;

public class CoolNumbersStuckiLogan {
	/*
	 * method isCoolNumber will return true if num % 3-6 all have a remainder of
	 * 1 it will return false otherwize
	 */
	public static boolean isCoolNumber(int num) {
		for (int x = 3; x <= 6; x++) {
			if (num % x != 1) {
				return false; // triggered
			}
		}

		return true;
	}

	/*
	 * method countCoolNumbers will return the count of the coolNumbers between
	 * 6 and stop
	 */
	public static int countCoolNumbers(int stop) {
		int count = 0;

		for (int x = 6; x <= stop; x++) {
			if (isCoolNumber(x)) {
				++count;
			}
		}
		return count;
	}
}