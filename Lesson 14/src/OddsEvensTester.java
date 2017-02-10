import java.util.Arrays;

/**
 * Created by stuckil on 2/9/17.
 */
public class OddsEvensTester {
    public static void main(String args[]) {
        int s = 20;
        int a = 100;
        for(int x = 0; x<a; x++) {
            int[] random = new int[s];
            for(int y = 0; y<s; y++) {
                random[y] = (int)Math.ceil((Math.random()*100.0));
            }
            System.out.println("A new array : " + Arrays.toString(random));
            int[] odds = OddsAndEvensStuckiLogan.getAllOdds(random);
            int[] evens = OddsAndEvensStuckiLogan.getAllEvens(random);
            System.out.println("Odds : "+Arrays.toString(odds));
            System.out.println("Evens : "+Arrays.toString(evens) + "\n");
        }
    }
}