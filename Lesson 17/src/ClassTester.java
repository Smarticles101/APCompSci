//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

/** Output:
 Comp Sci 1
 Jimmy 100.0 90.0 80.0 60.0
 Sandy 100.0 100.0 80.0 70.0
 Fred 50.0 50.0 70.0 68.0
 Jimmy's average = 82.50
 Sandy's average = 87.50
 Fred's average 59.50
 Sandy's average 87.50
 Failure List = Fred
 Highest Average = Sandy
 Lowest Average = Fred
 Class Average = 76.50
 */

import static java.lang.System.*;

public class ClassTester
{
   public static void main( String args[] )
   {
		Class test = new Class("Comp Sci 1",3);
		test.addStudent(0,new Student("Jimmy","4 - 100 90 80 60"));
		test.addStudent(1,new Student("Sandy","4 - 100 100 80 70"));
		test.addStudent(2,new Student("Fred","4 - 50 50 70 68"));				
		out.println(test);
		
		out.println(String.format(test.getStudentName(0) + "\'s average = %.2f",test.getStudentAverage(0)));	
		out.println(String.format(test.getStudentName(1) + "\'s average = %.2f",test.getStudentAverage(1)));	
		out.println(String.format(test.getStudentName(2) + "\'s average %.2f",test.getStudentAverage(2)));	
		
		out.println(String.format("Sandy" + "\'s average %.2f",test.getStudentAverage("Sandy")));	

		out.println("Failure List = " + test.getFailureList(70));	
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());

		out.println(String.format("Class Average = %.2f",test.getClassAverage()));									
	}		
}