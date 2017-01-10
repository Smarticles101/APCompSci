//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Guessing Game

/**
 * Output
 * Guessing Game - how many numbers? 10
 * Enter a number between 1 and 10 : 1
 * Enter a number between 1 and 10 : 2
 * It took 2 guesses to guess 2
 * You guessed wrong 50 percent of the time
 * Play again? (y/n) y
 * Guessing Game - how many numbers? 8
 * Enter a number between 1 and 8 : 1
 * Enter a number between 1 and 8 : 2
 * Enter a number between 1 and 8 : 3
 * Enter a number between 1 and 8 : 4
 * Enter a number between 1 and 8 : 5
 * It took 5 guesses to guess 5
 * You guessed wrong 80 percent of the time
 * Play again? (y/n) n
 */

import java.util.Scanner;

public class GuessRunnerStuckiLogan {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Guessing Game - how many numbers? ");
            int num = keyboard.nextInt();
            new GuessingGameStuckiLogan(num).playGame();
            System.out.print("Play again? (y/n) ");
            if (!keyboard.next().equals("y")) {
                break;
            }
        }
    }
}