//� A+ Computer Science  -  www.apluscompsci.com
//Name -  
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
	}

	public RockPaperScissors(String player)
	{
	}

	public void setPlayers(String player)
	{
	}

	public String determineWinner()
	{
		String winner="";
		int compInt = (double)Math.floor(Math.random()*3);
		String computer = compInt==0? "R" : compInt==1? "P" : "S";
		if(playChoice.equals(compChoice)) {
			winner = "!Draw Game!";
		} else if(playChoice.equals("R")) {

		}
		return winner;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}