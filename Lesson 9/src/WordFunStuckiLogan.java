//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - Word fun

import static java.lang.System.*;

public class WordFunStuckiLogan {
	private String word;

	public WordFunStuckiLogan() {
		this("");
	}

	public WordFunStuckiLogan(String w) {
		setWord(w);
	}

	public void setWord(String w) {
		word = w;
	}

	public void makeUpper() {
		word = word.toUpperCase();
	}

	public void addHyphen() {
		int loc = word.indexOf(' ');
		word = word.replaceAll(" ", "-");
	}

	public String toString() {
		return word + "\n\n";
	}
}
