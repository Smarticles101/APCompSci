//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Stars and stripes lab

import static java.lang.System.*;

public class StarsAndStripes {
   public StarsAndStripes() {
      out.println("StarsAndStripes");
      printTwoBlankLines();   
   }

   public void printTwentyStars() {
	   for(int x = 0; x<20; x++) {
		   System.out.print("*");
	   }
	   System.out.print("\n");
   }

   public void printTwentyDashes() {
	   for(int x = 0; x<20; x++) {
		   System.out.print("-");
	   }
	   System.out.print("\n");
   }

   public void printTwoBlankLines() {
	   System.out.println("\n");
   }
   
   public void printASmallBox() {
	   printTwentyDashes();
	   printTwentyDashes();
   }
 
   public void printABigBox() { 	
	   printTwentyDashes();
	   printTwoBlankLines();
	   printTwentyDashes();
   }   
}