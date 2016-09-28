//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/27/16
//Class - 6th period
//Lab  - Cube lab

public class CubeStuckiLogan {
	private int side;
	private int surfaceArea;

	public void setSide(int s) {
		side = s;
	}

	public void calculateSurfaceArea() {
		surfaceArea = 6*(side*side);
	}

	public void print() {
		System.out.println("The surface area is :: " + surfaceArea + "\n");
	}
}
