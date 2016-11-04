//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - String length

import static java.lang.System.*;

public class StringLengthCheck {
	String wordOne, wordTwo;

	public StringLengthCheck() {
		this("","");
	}

	public StringLengthCheck(String one, String two) {
		setWords(one, two);
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkLength() {
		return wordOne.length() == wordTwo.length();
	}

	public String toString() {
		if(checkLength()) {
			return wordOne + " has the same # of letters as " + wordTwo + "\n";
		}
		return wordOne + " does not have the same # of letters as " + wordTwo + "\n";
	}
}
