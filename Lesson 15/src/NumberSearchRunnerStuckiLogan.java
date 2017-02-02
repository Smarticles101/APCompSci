//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/2/17
//Class - 6th
//Lab - Number Search

/** Output:
    [1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1]
    The next largest value after 5 is 6
    [10, 30, 20, 40, 50, 15]
    The next largest value after 12 is 15
    [3, 4, 5, 6, 8, 9, 10, 11, 2, 3, 4, 65]
    The next largest value after 25 is 65
    [100, 110, 1000, 25000, 65535]
    The next largest value after 32767 is 65535
 */

public class NumberSearchRunnerStuckiLogan {
    public static void main(String args[]) {
        t(5, 1,2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1);
        t(12, 10, 30, 20, 40, 50, 15);
        t(25, 3, 4,5,6,8,9,10,11,2,3,4,65);
        t(32767, 100, 110, 1000, 25000, 65535);
    }

    public static void t(int t, int... nums) {
        System.out.println(new NumberSearchStuckiLogan(t, nums));
    }
}
