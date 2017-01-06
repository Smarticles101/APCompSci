
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString {
	private String[] words;

	public BiggestString() {
		this("", "", "");
	}

	public BiggestString(String... words) {
		setStrings(words);
	}

	public void setStrings(String... words) {
		this.words = words;
	}

	public String getBiggest() {
		String big = "";
		for(int i = 0; i<words.length; i++) {
			if(words[i].length()>big.length()) {
				big = words[i];
			}
		}
		return big;
	}

	public String toString() {
		return "";
	}
}