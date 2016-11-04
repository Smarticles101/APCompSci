//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - First letter

/* Output:
 hello has the same first letter as howdy

 one does not have the same first letter as two

 three has the same first letter as two

 TCEA does not have the same first letter as UIL

 State does not have the same first letter as Champions

 ABC does not have the same first letter as DEF
*/

import static java.lang.System.*;

public class StringFirstLetterRunner {
	public static void main( String args[] ) {
		//add test cases
		StringFirstLetterCheck demo = new StringFirstLetterCheck("hello","howdy");
		System.out.println(demo);

		demo.setWords("one","two");
		System.out.println(demo);

		demo.setWords("three","two");
		System.out.println(demo);

		demo.setWords("TCEA","UIL");
		System.out.println(demo);

		demo.setWords("State","Champions");
		System.out.println(demo);

		demo.setWords("ABC","DEF");
		System.out.println(demo);
	}
}
