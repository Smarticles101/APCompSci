//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 27/10/16
//Class - 6th
//Lab  - Number Compare

/* Output:
5 -- 6
largest == 6
smallest == 5


45 -- 66
largest == 66
smallest == 45


-25 -- 10324
largest == 10324
smallest == -25


324 -- 12312
largest == 12312
smallest == 324


34 -- 33
largest == 34
smallest == 33
 */

import static java.lang.System.*;

public class NumberCompareRunnerStuckiLogan {
	public static void main( String args[] ) {
	   NumberCompareStuckiLogan test = new NumberCompareStuckiLogan(5,6);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");

		//add more test cases
	   
	   test.setNums(45, 66);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	   
	   test.setNums(-25, 10324);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");

	   test.setNums(324, 12312);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	
	   test.setNums(34, 33);
	   out.println(test);
	   out.println("largest == "+test.getLargest());
	   out.println("smallest == "+test.getSmallest()+"\n\n");
	}
}