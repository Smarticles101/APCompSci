//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore s = new ToyStore();
		System.out.println(s);
		s.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(s);
		System.out.println("max == "+s.getMostFrequentToy());
	}
}