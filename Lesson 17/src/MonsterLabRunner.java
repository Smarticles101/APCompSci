//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			int h;
			int w;
			int a;

			System.out.print("Enter the ht :: ");
			h = keyboard.nextInt();
			System.out.print("Enter the wt :: ");
			w = keyboard.nextInt();
			System.out.print("Enter the age :: ");
			a = keyboard.nextInt();

			System.out.println("\n");
			herd.add(i, new Monster(h,w,a));
			
		}		
		
		System.out.println("HERD :: "+herd);

		System.out.println("SMALLEST :: " + herd.getSmallest().toString());

		System.out.println("LARGEST :: " + herd.getLargest().toString());

		System.out.println("HERD :: " + herd);
			
	}		
}