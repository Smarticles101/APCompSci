//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 15/9/16
//Class - 6th period
// I got help from my brain

/** Output
 * StarsAndStripes
 *
 *
 * --------------------
 * ********************
 * --------------------
 *
 *
 * --------------------
 * ********************
 * --------------------
 * --------------------
 * ********************
 * --------------------
 *
 */

import static java.lang.System.*;

public class StarsRunner {
	public static void main(String args[]) {
		StarsAndStripes s = new StarsAndStripes();
		
		s.printTwentyDashes();
		s.printTwentyStars();
		s.printABigBox();
		s.printTwentyStars();
		s.printASmallBox();
		s.printTwentyStars();
		s.printTwentyDashes();
	}
}