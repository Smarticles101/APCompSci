//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	public NumberAnalyzer()
	{
		this("");
	}

	public NumberAnalyzer(String numbers)
	{
		setList(numbers);
	}
	
	public void setList(String numbers)
	{
		list = new ArrayList<Number>();
		for(String n:numbers.split(" ")) {
			list.add(new Number(Integer.parseInt(n)));
		}
	}

	public int countOdds()
	{
      int oddCount=0;

      for(Number n:list) if(n.isOdd()) oddCount++;


      return oddCount;
	}

	public int countEvens()
	{
      int evenCount=0;
      for(Number n:list) if(!n.isOdd()) evenCount++;

      return evenCount;
	}

	public int countPerfects()
	{
		int perfectCount=0;
		for(Number n:list) if(n.isPerfect()) perfectCount++;

      return perfectCount;
	}
	
	public String toString( )
	{
		return list.toString();
	}
}