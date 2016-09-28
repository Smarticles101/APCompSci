//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th Period
//Lab  -  Rectangle lab

/*
 * Output:
The perimeter is :: 16

The perimeter is :: 34

The perimeter is :: 412

The perimeter is :: 90

The perimeter is :: 530

The perimeter is :: 216
*/

public class RectangleRunnerStuckiLogan {
	public static void main(String[] args) {
		RectangleStuckiLogan test = new RectangleStuckiLogan();
		
		test.setLengthWidth(2, 6);
		test.calculatePerimeter();
		test.print();
		
		test.setLengthWidth(12, 5);
		test.calculatePerimeter();
		test.print();
		
		test.setLengthWidth(131, 75);
		test.calculatePerimeter();
		test.print();
		
		test.setLengthWidth(20, 25);
		test.calculatePerimeter();
		test.print();
		
		test.setLengthWidth(9, 256);
		test.calculatePerimeter();
		test.print();
		
		test.setLengthWidth(36, 72);
		test.calculatePerimeter();
		test.print();
	}
}
