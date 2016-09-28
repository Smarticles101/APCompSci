//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Average lab

/**
 * This class could be drastically improved
 * 		We could pass an array of doubles to the method setNums(double[] nums)
 * 
 * 		When calling average(), we could do this:
 * 			for(double number : nums) {
 * 				sum += number;
 * 			}
 * 		average = sum/nums.length()
 * 
 * 
 * 		When calling print(), we could do this:
 * 			for(int x = 0; x<nums.length(); x++) {
 * 				if(x == nums.length()-1) {
 * 					System.out.println(nums[x] + " has an average of " + String.format("%.2f" + "\n", average));
 * 				} else {
 * 					System.out.print(nums[x] + " + ");
 * 				}
 * 			}
 */

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
