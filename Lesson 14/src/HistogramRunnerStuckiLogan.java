//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Histogram

/** Output:
 0 - 0
 1 - 1
 2 - 1
 3 - 3
 4 - 2
 5 - 7
 6 - 0
 7 - 0
 8 - 0
 9 - 0

 0 - 1
 1 - 0
 2 - 2
 3 - 2
 4 - 2
 5 - 3
 6 - 2
 7 - 1
 8 - 4
 9 - 2

 0 - 1
 1 - 0
 2 - 3
 3 - 2
 4 - 2
 5 - 3
 6 - 2
 7 - 1
 8 - 4
 9 - 1
 */

public class HistogramRunnerStuckiLogan
{
	public static void main(String args[])
	{
		int[] x = {1, 5, 3, 4, 5, 5, 5, 4, 3, 2, 5, 5, 5, 3};
		test(x);
		int[] y = {2, 3, 4, 5, 6, 7, 8, 9, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		test(y);
		int[] z = {2, 3, 4, 5, 6, 7, 8, 2, 0, 2, 3, 5, 6, 8, 8, 8, 9, 4, 5};
		test(z);
	}

	public static void test(int[] nums) {
		System.out.println(new Histogram(nums));
	}
}