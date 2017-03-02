//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class GradeBookRunner
{
   public static void main( String args[] )
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner keyboard = new Scanner(System.in);

	   out.print("What is the name of this class? ");

	   String className = keyboard.nextLine();

	   out.print("How many students are in this class? ");

	   int amt = keyboard.nextInt();

	   keyboard.nextLine();

	   Class c = new Class(className, amt);
	   String name;
	   String grades;
	   for(int i = 1; i<=amt; i++) {
	   		System.out.print("Enter the name of student " + i + " : ");
			name = keyboard.nextLine();
			System.out.println("Enter the grades for " + name);
			System.out.print("Use the format x - grades (2 - 100 100) : ");
			grades = keyboard.nextLine();
			c.addStudent(i-1, new Student(name, grades));
	   }

	   System.out.println(c);
	}		
}