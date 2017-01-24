//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Array fun house

/** Output:
 [7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7]
 sum of spots 3-6  =  14
 sum of spots 2-9  =  34
 # of 4s  =  1
 # of 9s  =  1
 # of 7s  =  3
 new array with all 7s removed  =  [4, 10, 0, 1, 6, 5, 3, 2, 9]
 # of 7s  =  0
 [4, 10, 0, 1, 6, 5, 3, 2, 9]
 sum of spots 3-16  =  76
 sum of spots 2-9  =  46
 # of 0s  =  2
 # of 3s  =  2
 # of 7s  =  9
 new array with all 7s removed  =  [4, 2, 3, 4, 6, 8, 9, 0, 10, 0, 1, 6, 5, 3, 2, 9, 9, 8]
 # of 7s  =  0
 */

import java.util.Arrays;

public class ArrayFunHouseRunnerStuckiLogan {
    public static void main(String args[]) {
        int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

        System.out.println(Arrays.toString(one));
        System.out.println("sum of spots 3-6  =  " + ArrayFunHouseStuckiLogan.getSum(one, 3, 6));
        System.out.println("sum of spots 2-9  =  " + ArrayFunHouseStuckiLogan.getSum(one, 2, 9));
        System.out.println("# of 4s  =  " + ArrayFunHouseStuckiLogan.getCount(one, 4));
        System.out.println("# of 9s  =  " + ArrayFunHouseStuckiLogan.getCount(one, 9));
        System.out.println("# of 7s  =  " + ArrayFunHouseStuckiLogan.getCount(one, 7));
        one = ArrayFunHouseStuckiLogan.removeVal(one, 7);
        System.out.println("new array with all 7s removed  =  "+Arrays.toString(one));
        System.out.println("# of 7s  =  " + ArrayFunHouseStuckiLogan.getCount(one, 7));

        int[] two = {7, 4, 2, 7, 3, 4, 6, 7, 8, 9, 7, 0, 10, 7, 0, 1, 7, 6, 5, 7, 3, 2, 7, 9, 9, 8,7};

        System.out.println(Arrays.toString(one));
        System.out.println("sum of spots 3-16  =  " + ArrayFunHouseStuckiLogan.getSum(two, 3, 16));
        System.out.println("sum of spots 2-9  =  " + ArrayFunHouseStuckiLogan.getSum(two, 2, 9));
        System.out.println("# of 0s  =  " + ArrayFunHouseStuckiLogan.getCount(two, 0));
        System.out.println("# of 3s  =  " + ArrayFunHouseStuckiLogan.getCount(two, 3));
        System.out.println("# of 7s  =  " + ArrayFunHouseStuckiLogan.getCount(two, 7));
        two = ArrayFunHouseStuckiLogan.removeVal(two, 7);
        System.out.println("new array with all 7s removed  =  "+Arrays.toString(two));
        System.out.println("# of 7s  =  " + ArrayFunHouseStuckiLogan.getCount(two, 7));


    }
}