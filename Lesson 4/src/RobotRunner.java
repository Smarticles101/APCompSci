//� A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples

import javax.swing.JFrame;

public class RobotRunner extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public RobotRunner() {
		super("Robot");

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

		getContentPane().add(new Robot());

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] ) {
		RobotRunner run = new RobotRunner();
	}
}