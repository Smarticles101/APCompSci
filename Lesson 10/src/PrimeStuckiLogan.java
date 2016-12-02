
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Prime

import static java.lang.System.*;
import java.lang.Math;

public class PrimeStuckiLogan {
	private int number;

	public PrimeStuckiLogan() {
		this(0);
	}

	public PrimeStuckiLogan(int num) {
		setPrime(num);
	}

	public void setPrime(int num) {
		number = num;

	}

	public boolean isPrime() {
		if (number == 0 || number == 1)
			return false;

		for (int y = 2; y < number; y++) {
			if (number % y == 0) {
				return false;
				// We found a multiple!
			}
		}
		return true;
	}

	public String toString() {
		String output = "";
		output = number + " is " + (isPrime() ? "" : "not") + " prime";

		return output;
	}
}