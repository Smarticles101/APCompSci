//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Cube lab

/*
 * Output:
The surface area is :: 75264

The surface area is :: 96

The surface area is :: 6534

The surface area is :: 15000

The surface area is :: 150

The surface area is :: 2166
*/

public class CubeRunnerStuckiLogan {
	public static void main( String[] args ) {
		CubeStuckiLogan test = new CubeStuckiLogan();
	 	
	 	test.setSide(112);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(4);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(33);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(50);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(5);
	 	test.calculateSurfaceArea();
	 	test.print();
	 	
	 	test.setSide(19);
	 	test.calculateSurfaceArea();
	 	test.print();
	}
}
