//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 27/10/16
//Class - 6th period
//Lab  - String Equality

/* Output:
hello does not have the same letters as goodbye

one does not have the same letters as two

three does not have the same letters as four

TCEA does not have the same letters as UIL

State does not have the same letters as Champions

ABC has the same letters as ABC

ABC does not have the same letters as CBA

Same has the same letters as Same
*/

import static java.lang.System.*;

public class StringEqualityRunner {
	public static void main( String args[] ) {
		StringEqualityStuckiLogan demo = new StringEqualityStuckiLogan("hello","goodbye");
		System.out.println(demo);
		
		demo.setWords("one", "two");
		System.out.println(demo);
		
		demo.setWords("three", "four");
		System.out.println(demo);
		
		demo.setWords("TCEA", "UIL");
		System.out.println(demo);
		
		demo.setWords("State", "Champions");
		System.out.println(demo);
		
		demo.setWords("ABC", "ABC");
		System.out.println(demo);
		
		demo.setWords("ABC", "CBA");
		System.out.println(demo);
		
		demo.setWords("Same", "Same");
		System.out.println(demo);
	}
}
