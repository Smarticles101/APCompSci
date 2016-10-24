//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 23/10/16
//Class - 6th period
//Lab  - String odd or even

/* Output:
Enter a word :: cat
cat is odd

Enter a word :: boot
boot is even

Enter a word :: if
if is even

Enter a word :: a
a is odd

Enter a word :: eleven
eleven is even

Enter a word :: thirteen
thirteen is even

Enter a word :: odd
odd is odd

Enter a word :: even
even is even
*/

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunnerStuckiLogan {
	public static void main ( String[] args ) {
		Scanner in = new Scanner(System.in);
		StringOddOrEvenStuckiLogan demo = new StringOddOrEvenStuckiLogan();

		for(int x = 0; x<8; x++) {
			System.out.print("Enter a word :: ");
			demo.setString(in.next());
			System.out.println(demo);
		}
	}
}
