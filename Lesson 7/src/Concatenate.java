//© A+ Computer Science
// www.apluscompsci.com

//String concatenation example

import static java.lang.System.*;

public class Concatenate
{
   public static void main( String args[] )
   {
		String one = "comp";
		String two = "-sci";
					
		String s = one.substring(0,4) + two;  //adding strings together
		out.println(s);
		out.println(s.length());

		String what = one + 2 + 4;
		out.println(what);

		String who = 2 + 4 + one;
		out.println(who);

		String what = s.concat(two);		//adding strings together
		out.println(what);
		out.println(what.length());
	}
}

/*
comp-sci
8
comp24
6comp
comp-sci-sci
12
*/