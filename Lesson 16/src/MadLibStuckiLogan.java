//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 2/16/17
//Class - 6th period
//Lab  -  Mad Lib

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.*;

public class MadLibStuckiLogan
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String lib;

	public MadLibStuckiLogan()
	{
		this("story.dat");


	}

	public MadLibStuckiLogan(String fileName)
	{
		//load stuff
		this.nouns = new ArrayList<String>();
		this.verbs = new ArrayList<String>();
		this.adjectives = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));

			this.lib = file.nextLine();

			while(this.lib.contains("#")) {
				this.lib = this.lib.replaceFirst("#", getRandomNoun());
			}

			while(this.lib.contains("@")) {
				this.lib = this.lib.replaceFirst("@", getRandomVerb());
			}

			while(this.lib.contains("&")) {
				this.lib = this.lib.replaceFirst("&", getRandomAdjective());
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("nouns.dat"));
			String s;
			while((s = file.nextLine()) != null) {
				this.nouns.add(s);
			}
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("verbs.dat"));
			String s;
			while((s = file.nextLine()) != null) {
				this.verbs.add(s);
			}

	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("adjectives.dat"));
			String s;
			while((s = file.nextLine()) != null) {
				this.adjectives.add(s);
			}
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{

		return this.verbs.get((int)(Math.random()*this.verbs.size()));
	}
	
	public String getRandomNoun()
	{

		return this.nouns.get((int)(Math.random()*this.nouns.size()));
	}
	
	public String getRandomAdjective()
	{

		return this.nouns.get((int)(Math.random()*this.nouns.size()));
	}		

	public String toString()
	{
	   return this.lib+"\n\n\n";
	}
}