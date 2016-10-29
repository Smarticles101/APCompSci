//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 29/10/16
//Class - 6th period
//Lab  - String Compare

import static java.lang.System.*;

public class WordsCompareStuckiLogan {
	private String wordOne, wordTwo;
   private int compare;

	public WordsCompareStuckiLogan() {
		this("","");
	}

	public WordsCompareStuckiLogan(String one, String two) {
		setWords(one, two);
	}

	public void setWords(String one, String two) {
		wordOne = one;
		wordTwo = two;
	}

	public void compare() {
		compare = wordOne.compareTo(wordTwo);
	}

	public String toString() {
		if(compare<0) {
			return wordOne + " should be placed before " + wordTwo + "\n";
		} else {
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}
