//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class AddRunnerStuckiLogan
{
	public static void main ( String[] args )
	{
		AddStringsStuckiLogan demo = new AddStringsStuckiLogan("hello","world");
		demo.add();
		out.println(demo);

		demo.setStrings("jim","bob");
		demo.add();
		out.println(demo);

		//add more test cases		
	}
}