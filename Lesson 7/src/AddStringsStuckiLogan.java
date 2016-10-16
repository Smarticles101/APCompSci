//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/15/16
//Class - 6th period
//Lab  - Adding strings

import static java.lang.System.*;

public class AddStringsStuckiLogan {
	private String first, last;
	private String sum;
	
	public AddStringsStuckiLogan() {
		this("", "");
	}

	public AddStringsStuckiLogan(String one, String two) {
		setStrings(one, two);
	}

	public void setStrings(String one, String two) {
		first = one;
		last = two;
	}

	public void add() {
		sum = first + " " + last;
	}

	public String toString() {
		String output = "first :: " + first + "\n" +
						"last :: " + last + "\n" +
						"sum :: " + sum + "\n";
		return output;
	}
}
