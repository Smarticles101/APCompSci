//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 22/10/16
//Class - 6th period
//Lab  - Discount

/* Output:
Enter the original bill amount :: 500
Bill after discount :: 500.0
Enter the original bill amount :: 2500
Bill after discount :: 2125.0
Enter the original bill amount :: 4000
Bill after discount :: 3400.0
Enter the original bill amount :: 333.33
Bill after discount :: 333.33
Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08309
*/

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunnerStuckiLogan {
	public static void main( String args[] ) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		out.println("Bill after discount :: "+DiscountStuckiLogan.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("Bill after discount :: "+DiscountStuckiLogan.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("Bill after discount :: "+DiscountStuckiLogan.getDiscountedBill(amt));
	
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("Bill after discount :: "+DiscountStuckiLogan.getDiscountedBill(amt));
		
		out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
		out.println("Bill after discount :: "+DiscountStuckiLogan.getDiscountedBill(amt));
	}
}
