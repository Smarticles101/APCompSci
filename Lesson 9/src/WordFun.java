//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/11/16
//Class - 6th period
//Lab  - Word fun

/* Output:
Hello World


HELLO WORLD


HELLO-WORLD


Jim Bob


JIM BOB


JIM-BOB


Computer Science


COMPUTER SCIENCE


COMPUTER-SCIENCE


UIL TCEA


UIL TCEA


UIL-TCEA


State Champions


STATE CHAMPIONS


STATE-CHAMPIONS
*/

import static java.lang.System.*;

public class WordFun {
	private String word;

	public WordFun() {
		this("");
	}

	public WordFun(String w) {
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
