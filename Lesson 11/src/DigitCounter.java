//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounter
{
   public static int countDigits( int number )
	{
		int sum=0;
		while(number>0) {
			sum++;
			number/=10;
		}
		return sum;
	}
}