//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - String length

/* Output:
 hello does not have the same # of letters as goodbye

 one has the same # of letters as two

 three does not have the same # of letters as four

 TCEA does not have the same # of letters as UIL

 State does not have the same # of letters as Champions

 ABC has the same # of letters as DEF

 four has the same # of letters as five

 whoot does not have the same # of letters as what
*/

import static java.lang.System.*;

public class StringLengthRunnerStuckiLogan {
	public static void main( String args[] ) {
		//add test cases
		StringLengthCheckStuckiLogan demo = new StringLengthCheckStuckiLogan("hello","goodbye");
		System.out.println(demo);
		
		demo.setWords("one","two");
		System.out.println(demo);
		
		demo.setWords("three","four");
		System.out.println(demo);
		
		demo.setWords("TCEA","UIL");
		System.out.println(demo);
		
		demo.setWords("State","Champions");
		System.out.println(demo);
		
		demo.setWords("ABC","DEF");
		System.out.println(demo);
		
		demo.setWords("four","five");
		System.out.println(demo);
		
		demo.setWords("whoot","what");
		System.out.println(demo);
	}
}
