//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/15/16
//Class - 6th period
//Lab  - First and last letters

/* Output:
Word :: Hello
first letter :: H
last letter :: o

Word :: World
first letter :: W
last letter :: d

Word :: JukeBox
first letter :: J
last letter :: x

Word :: FBLA
first letter :: F
last letter :: A

Word :: Tigers
first letter :: T
last letter :: s
*/

import static java.lang.System.*;

public class FirstRunnerStuckiLogan {
	public static void main ( String[] args ) {
		FirstAndLastStuckiLogan demo = new FirstAndLastStuckiLogan("Hello");
		System.out.println(demo);
		
		demo.setString("World");
		System.out.println(demo);
		
		demo.setString("JukeBox");
		System.out.println(demo);
		
		demo.setString("FBLA");
		System.out.println(demo);
		
		demo.setString("Tigers");
		System.out.println(demo);
		
		//add more test cases	
		
	}
} 