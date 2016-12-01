
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 1/12/16
//Class - 6th period
//Lab  - Loop stats

import static java.lang.System.*;

public class LoopStatsStuckiLogan {
	private int start, stop;

	public LoopStatsStuckiLogan() {
		this(0, 0);
	}

	public LoopStatsStuckiLogan(int beg, int end) {
		setNums(beg, end);
	}

	public void setNums(int beg, int end) {
		start = beg;
		stop = end;
	}

	public int getEvenCount() {
		int evenCount = 0;

		for (int x = start; x <= stop; x++) {
			if (x % 2 == 0) {
				evenCount++;
			}
		}

		return evenCount;
	}

	public int getOddCount() {
		int oddCount = 0;

		for (int x = start; x <= stop; x++) {
			if (x % 2 != 0) {
				oddCount++;
			}
		}

		return oddCount;
	}

	public int getTotal() {
		int total = 0;
		for (int x = start; x <= stop; x++) {
			for (int y = 1; y <= x; y++) {
				total++;
			}
		}

		return total;
	}

	public String toString() {
		return start + " " + stop + "\ntotal " + getTotal() + "\neven count " + getEvenCount() + "\nodd count "
				+ getOddCount() + "\n";
	}
}