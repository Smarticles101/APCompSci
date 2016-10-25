//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki 
//Date - 24/10/16
//Class - 6th period
//Lab  - character analyzer

/* Output:
Enter a letter :: A
A is a uppercase characer. ASCII == 65

Enter a letter :: 1
1 is a number. ASCII == 49

Enter a letter :: a
a is a lowercase character. ASCII == 97

Enter a letter :: 7
7 is a number. ASCII == 55

Enter a letter :: D
D is a uppercase characer. ASCII == 68

Enter a letter :: 2
2 is a number. ASCII == 50

Enter a letter :: X
X is a uppercase characer. ASCII == 88

Enter a letter :: Z
Z is a uppercase characer. ASCII == 90

Enter a letter :: 9
9 is a number. ASCII == 57
*/

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunnerStuckiLogan {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzerStuckiLogan test = new CharacterAnalyzerStuckiLogan(letter);
		out.println(test);   //A

		//add more test cases
		
		
		for(int x = 0; x<8; x++) {
				out.print("Enter a letter :: ");
				letter = keyboard.next().charAt(0);
				test.setChar(letter);
				out.println(test);
		}
		
		
		
		
		

	}
}
