
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Cool Numbers

/** Output:
4 cool numbers between 6 - 250
20 cool numbers between 6 - 1250
37 cool numbers between 6 - 2250
91 cool numbers between 6 - 5500
158 cool numbers between 6 - 9500
391 cool numbers between 6 - 23500
541 cool numbers between 6 - 32500
 */

import static java.lang.System.*;

public class CoolNumbersRunnerStuckiLogan {
	public static void main(String[] args) {
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(250) + " cool numbers between 6 - " + 250);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(1250) + " cool numbers between 6 - " + 1250);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(2250) + " cool numbers between 6 - " + 2250);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(5500) + " cool numbers between 6 - " + 5500);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(9500) + " cool numbers between 6 - " + 9500);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(23500) + " cool numbers between 6 - " + 23500);
		System.out.println(CoolNumbersStuckiLogan.countCoolNumbers(32500) + " cool numbers between 6 - " + 32500);
		// add more test cases
	}
}