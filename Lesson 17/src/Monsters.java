//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;
	}

	public Monster getLargest( )
	{
		Arrays.sort(myMonsters);
		return myMonsters[myMonsters.length-1];
	}

	public Monster getSmallest( )
	{
		Arrays.sort(myMonsters);
		return myMonsters[0];
	}

	public String toString()
	{
		return Arrays.toString(myMonsters);
	}
}