
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
		this(6,"#");
	}

	public TriangleThree(int count, String let) {
		setTriangle(let, count);
	}

	public void setTriangle(String let, int sz) {
		letter = let;
		size = sz;
	}

	public String getLetter() {
		return letter;
	}

	public String toString() {
		String out = "";
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size - 1 - x; y++) {
				out += " ";
			}
			for (int y = 0; y <= x; y++) {
				out += letter;
			}
			out += "\n";
		}
		return out + "\n";
	}
}