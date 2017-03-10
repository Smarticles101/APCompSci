/** Output:
 Rank : the best card
 Suite : green
 Point value : 10000
 Equals the medium card of red (point value == 5000) ? false
 the best card of green (point value == 10000)
 Rank : the worst card
 Suite : blue
 Point value : 0
 Equals the medium card of red (point value == 5000) ? false
 the worst card of blue (point value == 0)
 Rank : the medium card
 Suite : red
 Point value : 5000
 Equals the medium card of red (point value == 5000) ? true
 the medium card of red (point value == 5000)
 */
public class CardTesterStuckiLogan {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        CardStuckiLogan[] tests = {
                new CardStuckiLogan("the best card", "green", 10000),
                new CardStuckiLogan("the worst card", "blue", 0),
                new CardStuckiLogan("the medium card", "red", 5000)
        };

        CardStuckiLogan equalityTest = new CardStuckiLogan("the medium card", "red", 5000);

        for(CardStuckiLogan c: tests) {
            System.out.println("Rank : " + c.rank());
            System.out.println("Suite : " + c.suit());
            System.out.println("Point value : " + c.pointValue());
            System.out.println("Equals " + equalityTest + " ? " + equalityTest.matches(c));
            System.out.println(c);
        }
    }
}