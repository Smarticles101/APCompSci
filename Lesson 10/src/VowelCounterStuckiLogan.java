
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Vowel Counter

import static java.lang.System.*;

public class VowelCounterStuckiLogan {
	public static String getNumberString(String s) {
		char[] chars = s.toCharArray();
		final char[] VOWELS = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
		int charCount = 0;

		for (int x = 0; x < chars.length; x++) {
			for (char vowel : VOWELS) {
				if (chars[x] == vowel) {
					chars[x] = (charCount++ + "").toCharArray()[0];
					if (charCount > 9) {
						charCount = 0;
					}
					break; // dont keep checking that letter
				}
			}
		}

		return new String(chars);
	}
}
