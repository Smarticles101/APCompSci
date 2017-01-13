
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/1/16
//Class - 6th period
//Lab  - Triangle Three

public class TriangleThreeStuckiLogan {
	private int size;
	private String letter;

	public TriangleThreeStuckiLogan() {
		this(6,"#");
	}

	public TriangleThreeStuckiLogan(int count, String let) {
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