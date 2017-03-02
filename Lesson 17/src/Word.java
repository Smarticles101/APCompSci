//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{
		this("");
	}

	public Word(String wrd)
	{
		setWord(wrd);
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;


		for(int x = 0; x<word.length(); x++) {
			for(int y = 0; y<vowels.length(); y++) {
				if(word.charAt(x)==vowels.charAt(y)) count++;
			}
		}


		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}