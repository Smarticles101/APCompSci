//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 29/10/16
//Class - 6th period
//Lab  - String Compare

/*Output:
abe should be placed after ape

giraffe should be placed after gorilla

one should be placed after two

fun should be placed after funny

123 should be placed after 19

193 should be placed after 1910

goofy should be placed after godfather

funnel should be placed after fun
 */

import static java.lang.System.*;

public class WordsCompareRunnerStuckiLogan {
   public static void main(String args[]) {
		WordsCompareStuckiLogan demo = new WordsCompareStuckiLogan("abe", "ape");
		System.out.println(demo);
		
		demo.setWords("giraffe", "gorilla");
		System.out.println(demo);
		
		demo.setWords("one", "two");
		System.out.println(demo);
		
		demo.setWords("fun", "funny");
		System.out.println(demo);
		
		demo.setWords("123", "19");
		System.out.println(demo);
		
		demo.setWords("193", "1910");
		System.out.println(demo);
		
		demo.setWords("goofy", "godfather");
		System.out.println(demo);
		
		demo.setWords("funnel", "fun");
		System.out.println(demo);
	}
}
