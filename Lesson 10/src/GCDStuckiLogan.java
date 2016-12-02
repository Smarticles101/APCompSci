
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - GCD

import static java.lang.System.*;

public class GCDStuckiLogan {
	private int one, two;

	public GCDStuckiLogan() {
		this(0, 0);
	}

	public GCDStuckiLogan(int numOne, int numTwo) {
		setNums(numOne, numTwo);
	}

	public void setNums(int numOne, int numTwo) {
		one = numOne;
		two = numTwo;
	}

	public long getGCD() {
		long gcd = one;

		for (int x = one; x <= two; x++) {
			if (one % x == 0 && two % x == 0 && x <= gcd) {
				gcd = x;
			}
		}
		return gcd;
	}

	public String toString() {
		return "The GCD of " + one + " and " + two + " is " + getGCD();
	}
}