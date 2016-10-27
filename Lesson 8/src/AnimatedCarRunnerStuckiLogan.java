//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 25/10/16
//Class - 6th period
//Lab  - Animated car

import javax.swing.JFrame;

public class AnimatedCarRunnerStuckiLogan extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public AnimatedCarRunnerStuckiLogan() {
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new AnimatedCarStuckiLogan(WIDTH, HEIGHT));
				
		setVisible(true);
	}
	
	public static void main( String args[] ) {
		AnimatedCarRunnerStuckiLogan run = new AnimatedCarRunnerStuckiLogan();
	}
}