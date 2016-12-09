
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Vowel Counter

/** Output:
0bcd1f
hhhhhhh
0123456
c0tp1gd2tr3th4gb5gfr6gm78s9g01s2
hhhhhhh1234356HHHHDH
0123456789878780lkjd1slwl2jrl3jfl4wjkflwj

x
0
 */

import static java.lang.System.*;

public class VowelCounterRunnerStuckiLogan {
	public static void main(String[] args) {
		System.out.println(VowelCounterStuckiLogan.getNumberString("abcdef"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("hhhhhhh"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("aaaaaaa"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("catpigdatrathogbogfrogmoosegeese"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("hhhhhhh1234356HHHHDH"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj"));
		System.out.println(VowelCounterStuckiLogan.getNumberString(""));
		System.out.println(VowelCounterStuckiLogan.getNumberString("x"));
		System.out.println(VowelCounterStuckiLogan.getNumberString("e"));

	}
}
