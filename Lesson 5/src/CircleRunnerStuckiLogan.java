//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Circle lab

/*
 * Output:
The area is :: 176.7146

The area is :: 314.1593

The area is :: 16528.4881

The area is :: 9503.3178

The area is :: 32047.3867

The area is :: 31385.7745
*/

public class CircleRunnerStuckiLogan {
	public static void main( String[] args ) {
		CircleStuckiLogan test = new CircleStuckiLogan();
		
		test.setRadius(7.5);
		test.calculateArea();
		test.print();
		
		test.setRadius(10);
		test.calculateArea();
		test.print();
		
		test.setRadius(72.534);
		test.calculateArea();
		test.print();
		
		test.setRadius(55);
		test.calculateArea();
		test.print();
		
		test.setRadius(101);
		test.calculateArea();
		test.print();
		
		test.setRadius(99.952);
		test.calculateArea();
		test.print();
	}
}
