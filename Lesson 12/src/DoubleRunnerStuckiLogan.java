
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/6/17
//Class - 6th period
//Lab  - Biggest Double

/** Output:
	4.5 6.7 7.8 9.0
	biggest = 9.0
	
	4.5 6.7 71.8 1.0
	biggest = 71.8
	
	41.15 816.7 17.8 19.0
	biggest = 816.7
	
	884.5 16.7 7.8 9.0
	biggest = 884.5
	
	4.5 -456.7 677.8 9.0
	biggest = 677.8
	
	4.5 16.7 -7.8 -9.0
	biggest = 16.7
 */

public class DoubleRunnerStuckiLogan {
	public static void main(String[] args) {
		BiggestDoubleStuckiLogan run = new BiggestDoubleStuckiLogan(4.5, 6.7, 7.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		run.setDoubles(4.5, 6.7, 71.8, 1.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		run.setDoubles(41.15, 816.7, 17.8, 19.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		run.setDoubles(884.5, 16.7, 7.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		run.setDoubles(4.5, -456.7, 677.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		run.setDoubles(4.5, 16.7, -7.8, -9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
	}
}