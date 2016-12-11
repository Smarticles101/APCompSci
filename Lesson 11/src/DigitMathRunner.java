//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
The digit average of 234 is 3.0
The digit average of 10000 is 0.2
The digit average of 111 is 1.0
The digit average of 9005 is 3.5
The digit average of 84645 is 5.4
The digit average of 8547 is 6.0
The digit average of 123456789 is 5.0
*/

import static java.lang.System.*;

public class DigitMathRunner
{
	public static void main( String args[] )
	{
		/**
		234
		10000
		111
		9005
		84645
		8547
		123456789
		*/
		System.out.println("The digit average of 234 is " + DigitMath.averageDigits(234));
		System.out.println("The digit average of 10000 is " + DigitMath.averageDigits(10000));
		System.out.println("The digit average of 111 is " + DigitMath.averageDigits(111));
		System.out.println("The digit average of 9005 is " + DigitMath.averageDigits(9005));
		System.out.println("The digit average of 84645 is " + DigitMath.averageDigits(84645));
		System.out.println("The digit average of 8547 is " + DigitMath.averageDigits(8547));
		System.out.println("The digit average of 123456789 is " + DigitMath.averageDigits(123456789));
	}
}