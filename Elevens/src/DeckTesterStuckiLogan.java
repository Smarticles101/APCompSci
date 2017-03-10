
/* Output:
size = 4
Undealt cards:
rank1 of yellow (point value == 12), rank3 of green (point value == 9001),
rank2 of green (point value == 20), rank1 of green (point value == 12)

Dealt cards:
rank3 of yellow (point value == 9001), rank2 of yellow (point value == 20)
 */
public class DeckTesterStuckiLogan {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"rank1", "rank2", "rank3"};
        String[] suits = {"yellow", "green"};
        int[] points = {12, 20, 9001};
        DeckStuckiLogan d = new DeckStuckiLogan(ranks, suits, points);
        d.deal();
        d.deal();

		System.out.println(d);
    }
}