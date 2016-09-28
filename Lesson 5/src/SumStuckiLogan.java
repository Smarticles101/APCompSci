//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Sum lab

public class SumStuckiLogan {
	//instance variables
	private double one, two, sum;

	public void setNums(double num1, double num2) {
		one = num1;
		two = num2;
	}

	public void sum() {
		sum = one + two;
	}

	public void print() {
		System.out.println(one + " + " + two + " = " + String.format("%.2f" + "\n", sum));
	}
}
