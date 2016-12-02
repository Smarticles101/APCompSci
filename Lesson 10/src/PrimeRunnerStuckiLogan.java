//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Prime

/** Output:
24 is not prime
7 is  prime
100 is not prime
113 is  prime
65535 is not prime
2 is  prime
7334 is not prime
7919 is  prime
1115125003 is not prime
 */

import static java.lang.System.*;
import java.lang.Math;

public class PrimeRunnerStuckiLogan {
	public static void main(String[] args) {
		System.out.println(new PrimeStuckiLogan(24));
		System.out.println(new PrimeStuckiLogan(7));
		System.out.println(new PrimeStuckiLogan(100));
		System.out.println(new PrimeStuckiLogan(113));
		System.out.println(new PrimeStuckiLogan(65535));
		System.out.println(new PrimeStuckiLogan(2));
		System.out.println(new PrimeStuckiLogan(7334));
		System.out.println(new PrimeStuckiLogan(7919));
		System.out.println(new PrimeStuckiLogan(1115125003));

	}
}