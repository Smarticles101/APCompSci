
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Biggest Double

public class BiggestDoubleStuckiLogan {
	private double one, two, three, four;

	public BiggestDoubleStuckiLogan() {
		this(0, 0, 0, 0);
	}

	public BiggestDoubleStuckiLogan(double a, double b, double c, double d) {
		setDoubles(a, b, c, d);
	}

	public void setDoubles(double a, double b, double c, double d) {
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest() {
		double max = 0;
		if (one > max)
			max = one;
		if (two > max)
			max = two;
		if (three > max)
			max = three;
		if (four > max)
			max = four;
		return max;
		
		/* 
		 * This would be better if we used an array of numbers.
		 * we could make a simple algorithm to find the max 
		 */
	}

	public String toString() {
		return one + " " + two + " " + three + " " + four;
	}
}