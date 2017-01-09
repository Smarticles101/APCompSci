
//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRunner {
	public static void main(String args[]) {
		BiggestString demo = new BiggestString("abc", "cba", "bca");
		System.out.println(demo);
		System.out.println("Biggest: "+demo.getBiggest());
		demo.setStrings("one", "fourteen", "twenty");
		System.out.println(demo);
		System.out.println("Biggest: "+demo.getBiggest());
		demo.setStrings("124323", "20009", "3434");
		System.out.println(demo);
		System.out.println("Biggest: "+demo.getBiggest());
		demo.setStrings("abcde", "ABCDE", "1234234324");
		System.out.println(demo);
		System.out.println("Biggest: "+demo.getBiggest());
	}
}