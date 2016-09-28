//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/28/16
//Class - 6th Period
//Lab  - Line lab

/*
 * Output:
The slope is -0.54
The slope is -0.24
The slope is 0.50
The slope is -1.00
The slope is 8.00
*/

public class LineRunnerStuckiLogan {
	public static void main(String[] args) {
		LineStuckiLogan test = new LineStuckiLogan(1, 9, 14, 2);
		test.calculateSlope();
		test.print();
		
		test = new LineStuckiLogan(1, 7, 18, 3);
		test.calculateSlope();
		test.print();
		
		test = new LineStuckiLogan(6, 4, 2, 2);
		test.calculateSlope();
		test.print();
		
		test = new LineStuckiLogan(4, 4, 5, 3);
		test.calculateSlope();
		test.print();
		
		test = new LineStuckiLogan(1, 1, 2, 9);
		test.calculateSlope();
		test.print();
	}
}
