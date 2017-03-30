// Logan Stucki

/* Output:
size = 4
Undealt cards:
rank1 of yellow (point value == 12), rank3 of green (point value == 9001),
rank2 of green (point value == 20), rank1 of green (point value == 12)

Dealt cards:
rank3 of yellow (point value == 9001), rank2 of yellow (point value == 20)


size = 4
Undealt cards:
jack of blue (point value == 11), king of red (point value == 13),
queen of red (point value == 12), jack of red (point value == 11)

Dealt cards:
king of blue (point value == 13), queen of blue (point value == 12)


size = 4
Undealt cards:
jack of red (point value == 11), queen of blue (point value == 12),
jack of blue (point value == 11), king of blue (point value == 13)

Dealt cards:
queen of red (point value == 12), king of red (point value == 13)
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
        String[] ranks2 = {"jack", "queen", "king"};
        String[] suits2 = {"blue", "red"};
        int[] points2 = {11, 12, 13};
        d = new DeckStuckiLogan(ranks2, suits2, points2);
        d.deal();
        d.deal();
        System.out.println(d);
        d.shuffle();
        d.deal();
        d.deal();
        System.out.println(d);

    }
}
/* Questions:
1. Deck uses Card objects to store a large amount of them
2. 6 cards
3.  ranks = two, three, four, five, six, seven, eight, nine, ten, jack, queen, king, ace
    suits = spades, hearts, diamonds, clubs
    points = 2,3,4,5,6,7,8,9,10,10,10,10,11
4. no
 */