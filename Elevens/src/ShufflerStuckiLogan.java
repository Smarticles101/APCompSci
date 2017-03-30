// Logan Stucki

import java.util.Arrays;
/* Output:
Results of 5 consecutive perfect shuffles:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  1: 0 5 1 6 2 7 3 8 4 9
[0, 5, 1, 6, 2, 7, 3, 8, 4, 9]
  2: 0 7 5 3 1 8 6 4 2 9
[0, 7, 5, 3, 1, 8, 6, 4, 2, 9]
  3: 0 8 7 6 5 4 3 2 1 9
[0, 8, 7, 6, 5, 4, 3, 2, 1, 9]
  4: 0 4 8 3 7 2 6 1 5 9
[0, 4, 8, 3, 7, 2, 6, 1, 5, 9]
  5: 0 2 4 6 8 1 3 5 7 9

Results of 5 consecutive efficient selection shuffles:
  1: 7 0 5 8 2 9 4 3 1 6
  2: 4 2 0 8 6 5 7 3 1 9
  3: 0 6 3 7 5 1 9 4 2 8
  4: 2 6 0 9 4 7 5 3 8 1
  5: 4 5 6 3 0 1 7 2 9 8
 */

/* Questions:
1.
public static String flip() {
    int r = (int)(Math.random()*3);
    return r==0? "tails" : "heads";
}
2.
public static boolean arePermutations(int[] x, int[] y) {
    for(int i = 0; i<x.length; i++) {
        if(!x[i]==y[i])
            return false;
    }
    return true;
}
3. 3,2,1,0
 */

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class ShufflerStuckiLogan {
    /**
     * The number of consecutive shuffle steps to be performed in each call
     * to each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 5;

    /**
     * The number of values to shuffle.
     */
    private static final int VALUE_COUNT = 10;

    /**
     * Tests shuffling methods.
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive perfect shuffles:");
        int[] values1 = new int[VALUE_COUNT];
        for (int i = 0; i < values1.length; i++) {
            values1[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT +
                " consecutive efficient selection shuffles:");
        int[] values2 = new int[VALUE_COUNT];
        for (int i = 0; i < values2.length; i++) {
            values2[i] = i;
        }
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * Apply a "perfect shuffle" to the argument.
     * The perfect shuffle algorithm splits the deck in half, then interleaves
     * the cards in one half with the cards in the other.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void perfectShuffle(int[] values) {
		int[] half1 = Arrays.copyOfRange(values, 0, values.length/2);
		int[] half2 = Arrays.copyOfRange(values, values.length/2, values.length);
        System.out.println(Arrays.toString(values));
		int i = 0;
        int j = 0;
        while(i<values.length) {
            values[i++] = half1[j];
            values[i++] = half2[j++];
        }
    }

    /**
     * Apply an "efficient selection shuffle" to the argument.
     * The selection shuffle algorithm conceptually maintains two sequences
     * of cards: the selected cards (initially empty) and the not-yet-selected
     * cards (initially the entire deck). It repeatedly does the following until
     * all cards have been selected: randomly remove a card from those not yet
     * selected and add it to the selected cards.
     * An efficient version of this algorithm makes use of arrays to avoid
     * searching for an as-yet-unselected card.
     * @param values is an array of integers simulating cards to be shuffled.
     */
    public static void selectionShuffle(int[] values) {
		for(int i = values.length-1; i>=0; i--) {
		    int r = (int)Math.round(Math.random()*i);
		    int t = values[i];
		    values[i] = values[r];
		    values[r] = t;
        }
    }
}