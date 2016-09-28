//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Average lab

public class AverageStuckiLogan {
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2) {
		one = num1;
		two = num2;
	}

	public void average() {
		double sum=0;
		sum = one + two;
		average = sum/2;
	}
	public void print() {
		System.out.println(one + " + " + two + " has an average of " + String.format("%.2f" + "\n", average));
	}
}
