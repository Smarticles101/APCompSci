//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 22/10/16
//Class - 6th period
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountStuckiLogan{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill) {
		if(bill>2000) {
			return bill-bill*0.15;
		}
		
		return bill;
	}
}
