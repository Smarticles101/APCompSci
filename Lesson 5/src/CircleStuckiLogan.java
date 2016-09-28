//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Circle lab

public class CircleStuckiLogan {
	private double radius;
	private double area;

	public void setRadius(double rad) {
		radius = rad;
	}

	public void calculateArea() {
		area = Math.PI*Math.pow(radius, 2);
	}

	public void print() {
		System.out.println("The area is :: " + String.format("%.4f" + "\n", area));
	}
}
