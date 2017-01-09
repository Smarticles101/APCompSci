
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
		int bigInt = 0;
		for(int i = 0; i<words.length; i++) {
			if(words[i].compareTo(big)>bigInt) {
				bigInt = words[i].compareTo("");
				big = words[i];
			}
		}
		return big;
	}

	public String toString() {
		String joined = "";
		for(String word:words) {
			joined+=word+" ";
		}
		return joined;
	}
}