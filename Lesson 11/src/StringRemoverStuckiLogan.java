
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/12/16
//Class - 6th period
//Lab  - String Cleaner

import static java.lang.System.*;

class StringRemoverStuckiLogan {
	private String sentence;
	private String remove;

	// add in constructors
	public StringRemoverStuckiLogan() {
		this("", "");
	}

	public StringRemoverStuckiLogan(String s, String rem) {
		setRemover(s, rem);
	}

	public void setRemover(String s, String rem) {
		sentence = s;
		remove = rem;
	}

	public String removeStrings() {
		String cleaned = sentence;
		int location;

		while ((location = cleaned.indexOf(remove)) != -1) {
			cleaned = cleaned.substring(0, location-1) + cleaned.substring(location + remove.length());
		}

		return cleaned;
	}

	public String toString() {
		return sentence + " - String to remove " + remove + "\n" + removeStrings();
	}
}