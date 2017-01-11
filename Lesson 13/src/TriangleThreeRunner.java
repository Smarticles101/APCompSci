
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

/** Output:
	  A
	 AA
	AAA
	
	
	      X
	     XX
	    XXX
	   XXXX
	  XXXXX
	 XXXXXX
	XXXXXXX
	
	
	R
	
	
	    T
	   TT
	  TTT
	 TTTT
	TTTTT
	
	
	   W
	  WW
	 WWW
	WWWW
 */

import static java.lang.System.*;

public class TriangleThreeRunner {
	public static void main(String args[]) {
		test(3, "A");
		test(7, "X");
		test(1, "R");
		test(5, "T");
		test(4, "W");
	}

	public static void test(int size, String c) {
		System.out.println(new TriangleThree(size, c));
	}
}