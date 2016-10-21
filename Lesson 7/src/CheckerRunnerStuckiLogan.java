//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 21/10/16
//Class - 6th period
//Lab  - String checker

/* Output:
looking for c true
looking for ch true
looking for x false
chicken


looking for g true
looking for all true
looking for gater false
alligator


looking for U true
looking for COMP SCI false
looking for SCIENCE true
COMPUTER SCIENCE IS THE BEST!
 */

import static java.lang.System.*; 

public class CheckerRunnerStuckiLogan {
	public static void main ( String[] args ) {
		StringCheckerStuckiLogan demo = new StringCheckerStuckiLogan("chicken");
		out.println("looking for c "+demo.findLetter('c'));
		out.println("looking for ch "+demo.findSubString("ch"));
		out.println("looking for x "+demo.findSubString("x"));
		out.println(demo);

		demo.setString("alligator");
		out.println("looking for g "+demo.findLetter('g'));
		out.println("looking for all "+demo.findSubString("all"));
		out.println("looking for gater "+demo.findSubString("gater"));
		out.println(demo);

		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println("looking for U "+demo.findLetter('U'));
		out.println("looking for COMP SCI "+demo.findSubString("COMP SCI"));
		out.println("looking for SCIENCE "+demo.findSubString("SCIENCE"));
		out.println(demo);
	}
}
