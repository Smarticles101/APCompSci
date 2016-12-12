//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
	public StringRemover() {
		this("", "");
	}

	public StringRemover(String s, String rem) {
		setRemover(s, rem);
	}

	public void setRemover(String s, String rem) {
		sentence = s;
		remove = rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		int location;

		while((location = cleaned.indexOf(remove)) != -1) {
			cleaned = cleaned.substring(0, location) + cleaned.substring(location+remove.length());
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - String to remove " + remove + "\n" + removeStrings();
	}
}