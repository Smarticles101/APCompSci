//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Array fun house two

/** Output:
     Is going up? true
     Is going up? true
     Is going up? false
     Is going up? false
     Is going down? false
     Is going down? false
     Is going down? true
     Is going down? false
     first 7 values greater than 9 [12, 15, 18, 21, 23, 19, 17]
     first 5 values greater than 15 [18, 21, 23, 19, 17]
 */

import java.util.Arrays;

public class ArrayFunHouseTwoRunnerStuckiLogan {
    public static void main(String args[]) {
		int[] one = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] two = {1, 2, 3, 9, 11, 20, 30};
		int[] three = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};
		int[] four = {3, 6, 9, 12, 15, 18, 21, 23, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0};
        u(one);
        u(two);
        u(three);
        u(four);
        d(one);
        d(two);
        d(three);
        d(four);
        Arrays.toString(four);
        System.out.println("first 7 values greater than 9 "+Arrays.toString(ArrayFunHouseTwoStuckiLogan.getCountValuesBiggerThanX(four, 7, 9)));
        System.out.println("first 5 values greater than 15 "+Arrays.toString(ArrayFunHouseTwoStuckiLogan.getCountValuesBiggerThanX(four, 5, 15)));
    }

    public static void d(int[] n) {
        Arrays.toString(n);
        System.out.println("Is going down? " + ArrayFunHouseTwoStuckiLogan.goingDown(n));
    }

    public static void u(int[] n) {
        Arrays.toString(n);
        System.out.println("Is going up? " + ArrayFunHouseTwoStuckiLogan.goingUp(n));
    }
}