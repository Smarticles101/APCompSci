//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Guessing Game

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGameStuckiLogan
{
	private int upperBound;

	public GuessingGameStuckiLogan(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int g = 0;
		int c = 0;
		int num = (int)Math.ceil(Math.random()*upperBound);
		do {
			System.out.print("Enter a number between 1 and " + upperBound + " : ");
			g = keyboard.nextInt();
			if(g>upperBound || g<1) {
				System.out.println("Number out of bounds!");
			} else {
				c++;
			}
		} while(g!=num);
		System.out.println("It took " + c + " guesses to guess " + num);
		System.out.println("You guessed wrong " + (int)(((c-1.0)/c)*100.0) + " percent of the time");
	}

	public String toString()
	{
		String output="";
		return output;
	}
}