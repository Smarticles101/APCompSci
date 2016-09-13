//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/8/16
//Class - 6th period
//Lab  - Input basics

/** @Output:
Enter an integer :: 23
Enter an integer :: 2346
Enter a double :: 46.2
Enter a double :: 345.2
Enter a float :: 542.23
Enter a float :: 432.543
Enter a short :: 12
Enter a short :: 13
Enter a byte :: 14
Enter a byte :: 14
Enter a long :: 435254326
Enter a long :: 23643265473

integer one = 23
integer two = 2346
double one = 46.2
double two = 345.2
float one = 542.23
float two = 432.543
short one = 12
short two = 13
byte one = 14
byte two = 14
long one = 435254326
long two = 23643265473

intOne + intTwo = 2369
doubleOne + doubleTwo = 391.4
 * 
 */

import static java.lang.System.*;
import java.util.Scanner;

public class InputStuckiLogan {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;
		byte byteOne, byteTwo;
		long longOne, longTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		//add in input for all variables
		
		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();
		
		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();
		
		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.print("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		
		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();
		
		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();
		
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();
		
		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();
		
		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );

		//add in output for all variables

		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		System.out.println("float one = " + floatOne);
		System.out.println("float two = " + floatTwo);
		System.out.println("short one = " + shortOne);
		System.out.println("short two = " + shortTwo);
		System.out.println("byte one = " + byteOne);
		System.out.println("byte two = " + byteTwo);
		System.out.println("long one = " + longOne);
		System.out.println("long two = " + longTwo);
		
		System.out.println();

		System.out.print("intOne + intTwo = ");
		System.out.println(intOne + intTwo);
		
		System.out.print("doubleOne + doubleTwo = ");
		System.out.println(doubleOne + doubleTwo);
	}
}