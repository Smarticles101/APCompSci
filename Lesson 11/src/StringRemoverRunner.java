//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
	xR-MxR-MHelloxR-M - String to remove R-M
	xxHellox
	sxsssxssxsxssexssxsesss - String to remove xs
	sssssesesss
	fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn - String to remove qwerty
	fuxqwexxqwexrtyxrtyn
*/

import static java.lang.System.*;

public class StringRemoverRunner
{
	public static void main( String args[] )
	{
		System.out.println(new StringRemover("xR-MxR-MHelloxR-M", "R-M"));
		System.out.println(new StringRemover("sxsssxssxsxssexssxsesss", "xs"));
		System.out.println(new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrtyn", "qwerty"));
	}
}