//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/15/16
//Class - 6th period
//Lab  - Adding strings

/* Output:
first :: hello
last :: world
sum :: hello world

first :: jim
last :: bob
sum :: jim bob

first :: sally
last :: sue
sum :: sally sue

first :: computer
last :: science
sum :: computer science

first :: Tigers
last :: #1
sum :: Tigers #1
*/

import static java.lang.System.*;

public class AddRunnerStuckiLogan {
	public static void main ( String[] args ) {
		AddStringsStuckiLogan demo = new AddStringsStuckiLogan("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		demo.setStrings("sally", "sue");
		demo.add();
		out.println(demo);
		
		demo.setStrings("computer", "science");
		demo.add();
		out.println(demo);
		
		demo.setStrings("Tigers", "#1");
		demo.add();
		out.println(demo);	
	}
}
