//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Rock Paper Scissors

/**
 * Output:
 * type in your prompt [R,P,S] :: R
 * player had R
 * computer had R
 * !Draw Game!
 * Would you like to play again? (y/n) : y
 * type in your prompt [R,P,S] :: P
 * player had P
 * computer had S
 * !Computer wins <<Scissors Cut Paper!>>!
 * Would you like to play again? (y/n) : y
 * type in your prompt [R,P,S] :: S
 * player had S
 * computer had P
 * !Player wins <<Scissors Cut Paper!>>!
 * Would you like to play again? (y/n) : n
 */

import java.util.Scanner;

import static java.lang.System.*;

public class RPSRunnerStuckiLogan {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        char response;

        //add in a do while loop after you get the basics up and running
        while (true) {
            String player = "";

            out.print("type in your prompt [R,P,S] :: ");

            player = keyboard.next();

            RockPaperScissorsStuckiLogan game = new RockPaperScissorsStuckiLogan(player);

            System.out.println(game);

            System.out.print("Would you like to play again? (y/n) : ");

            if (!keyboard.next().equals("y")) {
                break;
            }
        }
    }
}