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
		this("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int compInt = (int)Math.floor(Math.random()*3);
		compChoice = compInt==0? "R" : compInt==1? "P" : "S";
	}

	public String determineWinner()
	{
		String winner="";
		if(playChoice.equals(compChoice)) {
			winner = "!Draw Game!";
		} else if(playChoice.equals("R") && compChoice.equals("S")) {
			winner = "!Player wins <<Rock Breaks Scissors>>!";
		} else if(playChoice.equals("S") && compChoice.equals("P")) {
			winner = "!Player wins <<Scissors Cut Paper!>>!";
		} else if(playChoice.equals("P") && compChoice.equals("R")) {
			winner = "!Player wins <<Paper Covers Rock!>>!";
		} else if(compChoice.equals("R") && playChoice.equals("S")) {
			winner = "!Computer wins <<Rock Breaks Scissors>>!";
		} else if(compChoice.equals("S") && playChoice.equals("P")) {
			winner = "!Computer wins <<Scissors Cut Paper!>>!";
		} else if(compChoice.equals("P") && playChoice.equals("R")) {
			winner = "!Computer wins <<Paper Covers Rock!>>!";
		}
		return winner;
	}

	public String toString()
	{
		return "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner();
	}
}