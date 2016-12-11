//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
	234 reversed is 432
	10000 reversed is 1
	111 reversed is 111
	9005 reversed is 5009
	84645 reversed is 54648
	8547 reversed is 7458
	123456789 reversed is 987654321
*/

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		System.out.println(new ReverseNumber(234));
		System.out.println(new ReverseNumber(10000));
		System.out.println(new ReverseNumber(111));
		System.out.println(new ReverseNumber(9005));
		System.out.println(new ReverseNumber(84645));
		System.out.println(new ReverseNumber(8547));
		System.out.println(new ReverseNumber(123456789));
	}
}