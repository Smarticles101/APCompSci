//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 29/10/16
//Class - 6th period
//Lab  - String Compare

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
