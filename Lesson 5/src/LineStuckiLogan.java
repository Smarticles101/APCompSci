//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/28/16
//Class - 6th Period
//Lab  - Line lab

public class LineStuckiLogan {
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public LineStuckiLogan(int x1, int y1, int x2, int y2) {
		setCoordinates(x1, y1, x2, y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calculateSlope() {
		slope = ((double)yTwo - (double)yOne)/((double)xTwo - (double)xOne);
	}

	public void print() {
		System.out.println("The slope is " + String.format("%.2f", slope));
	}
}
