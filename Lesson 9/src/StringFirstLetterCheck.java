//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - First letter

import static java.lang.System.*;

public class StringFirstLetterCheck {
	String wordOne, wordTwo;

	public StringFirstLetterCheck() {
		this("","");
	}

	public StringFirstLetterCheck(String one, String two) {
		setWords(one, two);
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkFirstLetter( ) {
		return wordOne.charAt(0) == wordTwo.charAt(0);
	}

	public String toString() {
		if(checkFirstLetter()) {
			return wordOne + " has the same first letter as " + wordTwo + "\n";
		}
	   return wordOne + " does not have the same first letter as " + wordTwo + "\n";
	}
}
