//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th Period
//Lab  -  Rectangle lab

public class RectangleStuckiLogan {
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid ) {
		length=len;
		width=wid;
	}

	public void calculatePerimeter() {
		perimeter = (length*2) + (width*2);
	}

	public void print() {
		System.out.println("The perimeter is :: " + perimeter + "\n");
	}
}
