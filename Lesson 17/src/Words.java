//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		words = new ArrayList<Word>();

		for(String w:wordList.split(", ")) {
			words.add(new Word(w));
		}

	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;

		for(Word w:words) if(w.getLength()==size) count++;

		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		for(int i = words.size(); i>=0; i--) {
			if(words.get(i).getNumVowels() == size) {
				words.remove(i);
			}
		}
		return 0;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;






		return count;
	}
	
	public String toString()
	{
	   return "";
	}
}