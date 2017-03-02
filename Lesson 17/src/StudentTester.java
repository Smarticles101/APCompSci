//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

/** Output:
 Billy Bob 90.0 85.0 95.5 77.5 88.0
 sum = 436.0
 average = 87.2
 average after dropping low grade = 89.625
 low grade = 77.5
 high grade = 95.5
 */

import static java.lang.System.*;

public class StudentTester
{
   public static void main( String args[] )
   {
		Student stu = new Student("Billy Bob","5 - 90 85 95.5 77.5 88");
		out.println(stu);
		out.println("sum = " + stu.getSum());		
		out.println("average = " + stu.getAverage());	
		out.println("average after dropping low grade = " + stu.getAverageMinusLow());				
		out.println("low grade = " + stu.getLowGrade());		
		out.println("high grade = " + stu.getHighGrade());
	}		
}