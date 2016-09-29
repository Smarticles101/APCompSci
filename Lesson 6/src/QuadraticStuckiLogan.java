//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/29/16
//Class - 6th period
//Lab  - Quadratic lab

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticStuckiLogan {
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public QuadraticStuckiLogan() {
		this(0, 0, 0);
	}

	public QuadraticStuckiLogan(int quadA, int quadB, int quadC) {
		setEquation(quadA, quadB, quadC);
		rootOne = 0;
		rootTwo = 0;
	}

	public void setEquation(int quadA, int quadB, int quadC) {
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public void calcRoots() {
		rootOne = (-b + (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
		rootTwo = (-b - (Math.sqrt((Math.pow(b, 2)) - (4*a*c))))/(2*a);
	}

	public void print() {
		System.out.print("\n");
		System.out.println("Root one :: " + String.format("%.2f", rootOne));
		System.out.println("Root two :: " + String.format("%.2f", rootTwo));
		System.out.print("\n\n");
	}
}
