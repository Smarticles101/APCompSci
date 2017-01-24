//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Roman Numeral

/** Output:
 10 is X

 100 is C

 1000 is M

 2500 is MMD

 1500 is MD

 23 is XXIII

 38 is XXXVIII

 49 is XLIX

 LXXVII is 77

 XLIX is 49

 XX is 20

 XLIX is 49
 */

import static java.lang.System.*;

public class RomanNumeralRunnerStuckiLogan {
	public static void main(String args[]) {
		RomanNumeralStuckiLogan test = new RomanNumeralStuckiLogan(10);
		out.println("10 is " + test.toString());

		test.setNumber(100);
		out.println("100 is " + test.toString());

		test.setNumber(1000);
		out.println("1000 is " + test.toString());

		test.setNumber(2500);
		out.println("2500 is " + test.toString());

		test = new RomanNumeralStuckiLogan(1500);
		out.println("1500 is " + test.toString());

		test.setNumber(23);
		out.println("23 is " + test.toString());

		test.setNumber(38);
		out.println("38 is " + test.toString());

		test.setNumber(49);
		out.println("49 is " + test.toString());

		test.setRoman("LXXVII");
		out.println("LXXVII is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");

		test.setRoman("XX");
		out.println("XX is " + test.getNumber() + "\n");

		test.setRoman("XLIX");
		out.println("XLIX is " + test.getNumber() + "\n");
	}
}