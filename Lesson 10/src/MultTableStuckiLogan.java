
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Multi Table

import static java.lang.System.*;

public class MultTableStuckiLogan {
	private int number;
	private int stop;

	public MultTableStuckiLogan() {
		number = stop = 0;
	}

	public MultTableStuckiLogan(int num, int end) {
		number = num;
		stop = end;
	}

	public void setTable(int num, int end) {
		number = num;
		stop = end;
	}

	public void printTable() {
		System.out.println("Multiplication table for " + number);
		for (int x = 1; x <= stop; x++) {
			System.out.printf(x + "%8d" + "\n", number * x);
		}

		System.out.println("\n\n");
	}
}