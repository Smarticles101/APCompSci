//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 17/10/16
//Class - 6th period
//Lab  - String Ripper

/* Output:
cke
chicken


igato
alligator


SCI
COMPUTER SCI
TER SCIENCE IS 
COMPUTER SCIENCE IS THE BEST!


I like 
fried ch
icken and m
nd m
I like fried chicken and mashed potatoes!
*/

import static java.lang.System.*;

public class RipperRunnerStuckiLogan {
	public static void main ( String[] args ) {
		StringRipperStuckiLogan demo = new StringRipperStuckiLogan("chicken");
		out.println(demo.ripString(3,6));
		out.println(demo);
		
		demo.setString("alligator");
		out.println(demo.ripString(3,8));
		out.println(demo);		

		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		out.println(demo.ripString(9,12));
		out.println(demo.ripString(0,12));
		out.println(demo.ripString(5,20));				
		out.println(demo);	

		demo.setString("I like fried chicken and mashed potatoes!");
		out.println(demo.ripString(0,7));
		out.println(demo.ripString(7,15));
		out.println(demo.ripString(15,26));
		out.println(demo.ripString(22,26));						
		out.println(demo);		
	}
}
