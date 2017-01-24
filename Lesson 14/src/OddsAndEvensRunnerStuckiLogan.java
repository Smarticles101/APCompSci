//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Odds and Evens

import java.util.Arrays;
import java.util.Scanner;

/** Output:
 	Enter space seperated list of numbers : 2 4 6 8 10 12 14
 	Odds : []
 	Evens : [2, 4, 6, 8, 10, 12, 14]
 	Enter y to exit, n to continue n
 	Enter space seperated list of numbers : 1 2 3 4 5 6 7 8 9
 	Odds : [1, 3, 5, 7, 9]
 	Evens : [2, 4, 6, 8]
 	Enter y to exit, n to continue n
 	Enter space seperated list of numbers : 2 10 20 21 23 24 40 55 60 61
 	Odds : [21, 23, 55, 61]
 	Evens : [2, 10, 20, 24, 40, 60]
 	Enter y to exit, n to continue y
 */

public class OddsAndEvensRunnerStuckiLogan
{
	public static void main( String args[] ) {
		Scanner in = new Scanner(System.in);
		boolean test = true;
		do {
			System.out.print("Enter space seperated list of numbers : ");
			String[] nums = in.nextLine().split(" ");
			int[] legitNums = new int[nums.length];
			for(int i = 0; i<nums.length; i++) {
				legitNums[i] = Integer.parseInt(nums[i]);
			}
			test(legitNums);
			System.out.print("Enter y to exit, n to continue ");
			if(in.nextLine().charAt(0)=='y') {
				test = false;
			}
		} while (test);
	}

	public static void test(int[] nums) {
		System.out.println("Odds : " + Arrays.toString(OddsAndEvensStuckiLogan.getAllOdds(nums)));
		System.out.println("Evens : " + Arrays.toString(OddsAndEvensStuckiLogan.getAllEvens(nums)));
	}
}