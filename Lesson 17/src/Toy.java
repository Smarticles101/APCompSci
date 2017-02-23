//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Toy implements Comparable<Toy>
{
	private String name;
	private int count;

	public Toy()
	{
		this("toy");
	}

	public Toy( String nm )
	{
		setName(nm);
		setCount(1);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public int compareTo(Toy t) {
		if(this.getCount() >t.getCount()) return -1;
		else if(this.getCount() < t.getCount()) return 1;
		else return 0;
	}

	public String toString()
	{
	   return name+" "+count;
	}
}