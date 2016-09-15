//� A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;

public class BigHouseRunner extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BigHouseRunner() {
		super("Big House");

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

		getContentPane().add(new BigHouse());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] ) {
		BigHouseRunner run = new BigHouseRunner();
	}
}