//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 10/15/16
//Class - 6th period
//Lab  - First and last letters

import static java.lang.System.*;

public class FirstAndLastStuckiLogan {
	private String word;

	public FirstAndLastStuckiLogan(String s) {
		setString(s);
	}

	public void setString(String s) {
		word = s;
	}

	public String getFirst() {
		return "" + word.charAt(0);
	}
	
	public String getLast() {
		return "" + word.charAt(word.length()-1);
	}

 	public String toString() {
 		String output = "Word :: " + word + "\n" +
						"first letter :: " + getFirst() + "\n" +
						"last letter :: " + getLast() + "\n";
 		return output;
	}
}
