//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 24/1/17
//Class - 6th period
//Lab  -  Array fun house

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseStuckiLogan {
    //instance variables and constructors could be used, but are not really needed

    //getSum() will return the sum of the numbers from start to stop, not including stop
    public static int getSum(int[] numArray, int start, int stop) {
        int s = 0;
        for(int x = start; x<=stop; x++) {
            s+=numArray[x];
        }
        return s;
    }

    //getCount() will return number of times val is present
    public static int getCount(int[] numArray, int val) {
        int c = 0;
        for (int i : numArray) {
            if (i == val) c++;
        }
        return c;
    }

    public static int[] removeVal(int[] numArray, int val) {
        int c = getCount(numArray, val);
        int[] n = new int[numArray.length - c];
        int offset = 0;

        for (int x = 0; x < numArray.length; x++) {
            if (numArray[x] == val) {
				offset++;
            } else {
                n[x-offset] = numArray[x];
            }
        }
        return n;
    }
}