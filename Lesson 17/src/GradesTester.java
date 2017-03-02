//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

/** Output
 90.0 85.0 95.5 77.5 88.0
 sum = 436.0
 num grades = 5
 low grade = 77.5
 high grade = 95.5
 10.0 70.0 90.0 92.5 85.0 95.5 77.5 88.0 100.0
 sum = 708.5
 num grades = 9
 low grade = 10.0
 high grade = 100.0
 */

import static java.lang.System.*;

public class GradesTester
{
   public static void main( String args[] )
   {
		Grades test = new Grades("5 - 90 85 95.5 77.5 88");
		out.println(test);
		out.println("sum = " + test.getSum());	
		out.println("num grades = "+test.getNumGrades());
		out.println("low grade = "+test.getLowGrade());
		out.println("high grade = "+test.getHighGrade());

	   test = new Grades("9 - 10 70 90 92.5 85 95.5 77.5 88 100.0");
	   out.println(test);
	   out.println("sum = " + test.getSum());
	   out.println("num grades = "+test.getNumGrades());
	   out.println("low grade = "+test.getLowGrade());
	   out.println("high grade = "+test.getHighGrade());
	}		
}