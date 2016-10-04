//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 4/10/16
//Class - 6th period
//Lab  - Triangle

import java.util.Scanner;
import java.lang.Math.*;

public class TriangleStuckiLogan {
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public TriangleStuckiLogan() {
		setSides(0, 0, 0);
		perimeter = 0;
		theArea = 0;
	}

	public TriangleStuckiLogan(int a, int b, int c) {
		setSides(a, b, c);
		perimeter = 0;
		theArea = 0;
		// we could just call calcPerimeter and calcArea instead of this
	}

	public void setSides(int a, int b, int c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
	}

	public void calcArea() {
		double s;
		s = perimeter/2;
		theArea = Math.sqrt(s * (s-sideA)*(s-sideB)*(s-sideC));
	}

	public void print() {
		System.out.println("\n" + sideA + " " + sideB + " " + sideC);
		System.out.println("Area == " + String.format("%.5f", theArea));
		System.out.println("\n\n");
	}
}