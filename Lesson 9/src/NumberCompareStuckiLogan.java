//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 27/10/16
//Class - 6th
//Lab  - Number Compare

import static java.lang.System.*;

public class NumberCompareStuckiLogan {
	private int one, two;

	public NumberCompareStuckiLogan() {
		this(0,0);
	}

	public NumberCompareStuckiLogan(int n1, int n2) {
		setNums(n1, n2);
	}

	public void setNums(int n1, int n2) {
		one = n1;
		two = n2;
	}

	public int getLargest() {
		if (one > two)
			return one;
		else
			return two;
	}

	public int getSmallest() {
		return one<two? one:two;
	}

	public String toString() {
		return one + " -- " + two;
	}
}