//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki 
//Date - 24/10/16
//Class - 6th period
//Lab  - character analyzer

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzerStuckiLogan {
	private char theChar;

	public CharacterAnalyzerStuckiLogan() {
		this(' ');
	}

	public CharacterAnalyzerStuckiLogan(char c) {
		setChar(c);
	}

	public void setChar(char c) {
		theChar = c;
	}

	public char getChar() {
		return theChar;
	}

	public boolean isUpper() {
		return theChar>=65 && theChar<=90;
	}

	public boolean isLower() {
		return theChar>=97 && theChar<=122;
	}
	
	public boolean isNumber() {
		return theChar>=48 && theChar<=57;
	}	

	public int getASCII() {
		return 0 + theChar;
	}

	public String toString() {
		String output = getChar() + " is a "; 
		if(isLower()) {
			output += "lowercase character";
		}
		if(isUpper()) {
			output+= "uppercase characer";
		}
		if(isNumber()) {
			output+= "number";
		}
			
		output += ". ASCII == " + getASCII() + "\n";
		return output;  
	}
}
