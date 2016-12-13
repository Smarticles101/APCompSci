//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - Ten to Any

/** Output:
	234 base 10 is 280 in base 9
	100 base 10 is 1100100 in base 2
	10 base 10 is 1010 in base 2
	15 base 10 is 1111 in base 2
	256 base 10 is 100000000 in base 2
	100 base 10 is 144 in base 8
	250 base 10 is FA in base 16
	56 base 10 is 51 in base 11
	89 base 10 is 324 in base 5
	23 base 10 is 212 in base 3
	50 base 10 is 200 in base 5
	55 base 10 is 131 in base 6
	2500 base 10 is 15324 in base 6
*/

import static java.lang.System.*;

public class TenToAnyRunnerStuckiLogan {
	public static void main(String args[]) {
		System.out.println(new TenToAnyStuckiLogan(234, 9));
		System.out.println(new TenToAnyStuckiLogan(100, 2));
		System.out.println(new TenToAnyStuckiLogan(10, 2));
		System.out.println(new TenToAnyStuckiLogan(15, 2));
		System.out.println(new TenToAnyStuckiLogan(256, 2));
		System.out.println(new TenToAnyStuckiLogan(100, 8));
		System.out.println(new TenToAnyStuckiLogan(250, 16));
		System.out.println(new TenToAnyStuckiLogan(56, 11));
		System.out.println(new TenToAnyStuckiLogan(89, 5));
		System.out.println(new TenToAnyStuckiLogan(23, 3));
		System.out.println(new TenToAnyStuckiLogan(50, 5));
		System.out.println(new TenToAnyStuckiLogan(55, 6));
		System.out.println(new TenToAnyStuckiLogan(2500, 6));

	}
}