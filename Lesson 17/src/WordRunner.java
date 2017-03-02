//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

/** Output:
 chicken
 num vowels == 2
 num chars == 7
 alligator
 num vowels == 4
 num chars == 9
 elephant
 num vowels == 3
 num chars == 8
 */

import static java.lang.System.*;

public class WordRunner
{
	public static void main(String[] args)
	{
		Word[] w = {new Word("chicken"), new Word("alligator"), new Word("elephant")};
		for(Word word: w) {
			System.out.println(word);
			System.out.println("num vowels == "+word.getNumVowels());
			System.out.println("num chars == "+word.getLength());
		}
	}
}