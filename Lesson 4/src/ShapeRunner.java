// A+ Computer Science
// www.apluscompsci.com

//graphics frame to run graphics examples
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Shape lab

import java.awt.Color;

import javax.swing.JFrame;

public class ShapeRunner extends JFrame {
	private static final int WIDTH = 480;
	private static final int HEIGHT = 272;

	public ShapeRunner() {
		super("Shapes!");

		setSize(WIDTH,HEIGHT);

		ShapePanel sp = new ShapePanel(50);

		getContentPane().add(sp);
		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		sp.createBufferStrategy(2);
	}

	public static void main( String args[] ) {
		ShapeRunner run = new ShapeRunner();
	}
}
