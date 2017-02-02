//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/2/17
//Class - 6th
//Lab - Word Sort

/** Output:
	word 0 :: 12321
	word 1 :: ABC
	word 2 :: abc
	word 3 :: alexander
	word 4 :: fred

	word 0 :: 435
	word 1 :: PRinTeR
	word 2 :: TONER
	word 3 :: a
	word 4 :: acrobatics
	word 5 :: friendly
	word 6 :: zebra

	word 0 :: $
	word 1 :: 4
	word 2 :: r
	word 3 :: s
	word 4 :: x
	word 5 :: y

 	word 0 :: 034
	word 1 :: 123
	word 2 :: 2a2
	word 3 :: ABC
	word 4 :: abc
	word 5 :: bob
	word 6 :: cat
	word 7 :: dog
	word 8 :: sally
	word 9 :: sue
 */

public class WordSortRunnerStuckiLogan {
	public static void main(String args[]) {
		t("abc", "ABC", "12321", "fred", "alexander");
		t("a", "zebra", "friendly", "acrobatics", "435", "TONER", "PRinTeR");
		t("x", "4", "r", "s", "y", "$");
		t("123", "ABC", "abc", "034", "dog", "cat", "sally", "sue", "bob", "2a2");
	}

	public static void t(String... words) {
		System.out.println(new WordSortStuckiLogan(words));
	}
}