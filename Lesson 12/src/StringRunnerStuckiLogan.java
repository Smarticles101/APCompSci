//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Biggest String

/**
 * Output:
 * abc cba bca
 * Biggest: cba
 * one fourteen twenty
 * Biggest: twenty
 * 124323 20009 3434
 * Biggest: 3434
 * abcde ABCDE 1234234324
 * Biggest: abcde
 */

public class StringRunnerStuckiLogan {
    public static void main(String args[]) {
        BiggestStringStuckiLogan demo = new BiggestStringStuckiLogan("abc", "cba", "bca");
        System.out.println(demo);
        System.out.println("Biggest: " + demo.getBiggest());
        demo.setStrings("one", "fourteen", "twenty");
        System.out.println(demo);
        System.out.println("Biggest: " + demo.getBiggest());
        demo.setStrings("124323", "20009", "3434");
        System.out.println(demo);
        System.out.println("Biggest: " + demo.getBiggest());
        demo.setStrings("abcde", "ABCDE", "1234234324");
        System.out.println(demo);
        System.out.println("Biggest: " + demo.getBiggest());
    }
}