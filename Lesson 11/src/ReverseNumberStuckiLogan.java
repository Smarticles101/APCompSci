
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Reverse Number

import static java.lang.System.*;

public class ReverseNumberStuckiLogan {
	private int number;

	// add constructors
	public ReverseNumberStuckiLogan() {
		this(0);
	}

	public ReverseNumberStuckiLogan(int number) {
		setNum(number);
	}

	// add a set method
	public void setNum(int number) {
		this.number = number;
	}

	public int getReverse() {
		int rev = 0;
		int num = number; // don't change number
		while (num > 0) {
			rev = (rev * 10) + (num % 10);
			num /= 10;
		}
		return rev;
	}

	// add a toString
	public String toString() {
		return number + " reversed is " + getReverse();
	}
}