//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 3/11/16
//Class - 6th period
//Lab  - Social Security

/* Output:
SS# 456-56-234 has a total of 746

SS# 1-1-1 has a total of 3

SS# 102-2-12 has a total of 116

SS# 0-0-0 has a total of 0
*/

import static java.lang.System.*;

public class SocialRunnerStuckiLogan {
	public static void main(String args[]) {
		// add test cases
		SocialStuckiLogan demo = new SocialStuckiLogan("456-56-234");
		demo.chopAndAdd();
		System.out.println(demo);

		demo.setWord("1-1-1");
		demo.chopAndAdd();
		System.out.println(demo);

		demo.setWord("102-2-12");
		demo.chopAndAdd();
		System.out.println(demo);

		demo.setWord("0-0-0");
		demo.chopAndAdd();
		System.out.println(demo);
	}
}
