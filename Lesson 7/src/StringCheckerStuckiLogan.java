//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 21/10/16
//Class - 6th period
//Lab  - String checker

import static java.lang.System.*;

public class StringCheckerStuckiLogan {
	private String word;

	public StringCheckerStuckiLogan() {
		this("");
	}

	public StringCheckerStuckiLogan(String s) {
		setString(s);
	}

	public void setString(String s) {
		word=s;
	}

	public boolean findLetter(char c) {
		if(word.contains("" + c)) {
			return true;
		}
		
		return false;
	}

	public boolean findSubString(String s) {
		if(word.contains(s)) {
			return true;
		}
		
		return false;
	}

 	public String toString() {
 		return word + "\n\n";
	}
}
