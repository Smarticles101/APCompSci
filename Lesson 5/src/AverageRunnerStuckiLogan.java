//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Average lab

/* Output:
5.0 + 5.0 has an average of 5.00

90.0 + 100.0 has an average of 95.00

100.0 + 85.8 has an average of 92.90

-100.0 + 55.0 has an average of -22.50

15236.0 + 5642.0 has an average of 10439.00

1000.0 + 555.0 has an average of 777.50
*/

public class AverageRunnerStuckiLogan {
	public static void main( String[] args ) {
		AverageStuckiLogan test = new AverageStuckiLogan();
		
 		test.setNums(5, 5);
 		test.average();
 		test.print();
 		
 		test.setNums(90, 100);
 		test.average();
 		test.print();
 		
 		test.setNums(100, 85.8);
 		test.average();
 		test.print();
 		
 		test.setNums(-100, 55);
 		test.average();
 		test.print();
 		
 		test.setNums(15236, 5642);
 		test.average();
 		test.print();
 		
 		test.setNums(1000, 555);
 		test.average();
 		test.print();
	}
}
