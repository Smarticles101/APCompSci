//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 17/10/16
//Class - 6th period
//Lab  - String Ripper

import static java.lang.System.*;

public class StringRipperStuckiLogan {
	private String word;
	
	public StringRipperStuckiLogan() {
		this("");
	}

	public StringRipperStuckiLogan(String s) {
		setString(s);
	}
	
   public void setString(String s) {
	   word = s;
   }	

	public String ripString(int x, int y) {
		return word.substring(x,y);
	}

 	public String toString() {
 		return word + "\n\n";
	}
}
