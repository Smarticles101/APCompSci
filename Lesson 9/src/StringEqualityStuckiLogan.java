//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 27/10/16
//Class - 6th period
//Lab  - String Equality

import static java.lang.System.*;

public class StringEqualityStuckiLogan {
	private String wordOne, wordTwo;

	public StringEqualityStuckiLogan() {
		this("","");
	}

	public StringEqualityStuckiLogan(String one, String two) {
		setWords(one,two);
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( ) {
		if(wordOne.equals(wordTwo)) {
			return true;
		}
		
		return false;
	}

	public String toString() {
		if(checkEquality()) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		
		return wordOne + " does not have the same letters as " + wordTwo + "\n";
	}
}