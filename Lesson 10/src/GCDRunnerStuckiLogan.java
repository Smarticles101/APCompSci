//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - GCD

/** Output:
The GCD of 5 and 25 is 5
The GCD of 4 and 400 is 4
The GCD of 8 and 80 is 8
The GCD of 15 and 45 is 15
The GCD of 9 and 9 is 9
The GCD of 3 and 543 is 3
 */
import static java.lang.System.*;

public class GCDRunnerStuckiLogan {
	public static void main(String[] args) {
		System.out.println(new GCDStuckiLogan(5, 25));
		System.out.println(new GCDStuckiLogan(4, 400));
		System.out.println(new GCDStuckiLogan(8, 80));
		System.out.println(new GCDStuckiLogan(15, 45));
		System.out.println(new GCDStuckiLogan(9, 9));
		System.out.println(new GCDStuckiLogan(3, 543));
	}
}