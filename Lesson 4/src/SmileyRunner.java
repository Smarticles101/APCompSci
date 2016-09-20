//� A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Smiley face lab

import javax.swing.JFrame;

public class SmileyRunner extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public SmileyRunner() {
		super("Smiley Face");

		setSize(WIDTH,HEIGHT);

		//getContentPane().add(new Circles());

		//getContentPane().add(new Rectangles());

		//getContentPane().add(new Lines());

		//getContentPane().add(new Polygons());

		//getContentPane().add(new Arcs());

		//getContentPane().add(new Colors());

		//getContentPane().add(new Fonts());

		//getContentPane().add(new ImageOne());

		//getContentPane().add(new DoubleBuffer());

		//getContentPane().add(new Animation());

		getContentPane().add(new SmileyFace());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] ) {
		SmileyRunner run = new SmileyRunner();
	}
}