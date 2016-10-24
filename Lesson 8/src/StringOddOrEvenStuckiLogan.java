//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 23/10/16
//Class - 6th period
//Lab  - String odd or even

import static java.lang.System.*;

public class StringOddOrEvenStuckiLogan {
	private String word;

	public StringOddOrEvenStuckiLogan() {
		this("");
	}

	public StringOddOrEvenStuckiLogan(String s) {
		setString(s);
	}

	public void setString(String s) {
		word = s;
	}

 	public boolean isEven() {
		return NumberVerifyStuckiLogan.isEven(word.length());
	}

 	public String toString() {
 		String output= word + " is " + (isEven()? "even" : "odd") + "\n";
 		return output;
	}
}
