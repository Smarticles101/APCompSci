//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Sum Lab
// I got help from my brain, fingers, and eyeballs

/**
 * Several of these labs use the same methods
 * we could, perhaps, implement an interface 
 * with some abstract base methods
 */
 
/*
 * Output:
5.0 + 5.0 = 10.00

90.0 + 100.0 = 190.00

100.5 + 85.8 = 186.30

-100.0 + 55.0 = -45.00

15236.0 + 5642.0 = 20878.00

1000.0 + 555.0 = 1555.00

 */

public class SumRunnerStuckiLogan {
	public static void main( String[] args ) {
		SumStuckiLogan test = new SumStuckiLogan();
		
		test.setNums(5,5);
		test.sum( );
		test.print();

		test.setNums(90, 100);
		test.sum( );
		test.print();
		
		test.setNums(100.5, 85.8);
		test.sum( );
		test.print();
		
		test.setNums(-100, 55);
		test.sum( );
		test.print();
		
		test.setNums(15236, 5642);
		test.sum( );
		test.print();
		
		test.setNums(1000, 555);
		test.sum( );
		test.print();
	}
}
