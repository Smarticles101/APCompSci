//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t = new Toy("ugh");
		System.out.println(t);
		t = new Toy("These labs are long");
		t.setCount(5);
		System.out.println(t);
	}
}