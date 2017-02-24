//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
 7 is odd.
 7 is not perfect.

 28 is not odd.
 28 is perfect.

 496 is not odd.
 496 is perfect.

 1111 is odd.
 1111 is not perfect.

 199 is odd.
 199 is not perfect.

 201 is odd.
 201 is not perfect.

 17 is odd.
 17 is not perfect.
 */

import static java.lang.System.*;

public class NumberRunner
{
	public static void main(String[] args)
	{
		int[] nums = {7,28,496,1111,199,201,17};
		for( int num : nums )
		{
			Number one = new Number( num );
			out.println( one.isOdd() ? one + " is odd." : one + " is not odd." );
			out.println( one.isPerfect() ? one + " is perfect.\n" : one + " is not perfect.\n" );
		}
	}
}