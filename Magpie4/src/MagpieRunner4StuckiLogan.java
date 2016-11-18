// Logan Stucki
// 10/11/16
// 6th period
// magpie 4

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * 
 * @author Laurie White
 * @version April 2012
 */

public class MagpieRunner4StuckiLogan {

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args) {
		Magpie4StuckiLogan maggie = new Magpie4StuckiLogan();

		System.out.println(maggie.getGreeting());
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println(maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
