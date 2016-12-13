//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - String Cleaner

/** Output:
	xR-MxR-MHelloxR-M - String to remove R-M
	Hello
	sxsssxssxsxssexssxsesss - String to remove xs
	sesss
	fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty
	fun
*/

import static java.lang.System.*;

public class StringRemoverRunnerStuckiLogan {
	public static void main(String args[]) {
		System.out.println(new StringRemoverStuckiLogan("xR-MxR-MHelloxR-M", "R-M"));
		System.out.println(new StringRemoverStuckiLogan("sxsssxssxsxssexssxsesss", "xs"));
		System.out.println(new StringRemoverStuckiLogan("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty"));
	}
}