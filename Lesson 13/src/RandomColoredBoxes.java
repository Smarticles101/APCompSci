
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel {
	private Timer timer;
	private final static int SLEEP = 110;

	public RandomColoredBoxes() {
		setBackground(Color.BLACK);
		setVisible(true);

		ActionListener paintCaller = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				repaint();
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}

	public void paintComponent(Graphics window) {
		super.paintComponent(window);

		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));
		window.drawString("Graphics Lab Lab11k ", 20, 40);
		window.drawString("Drawing boxes with nested loops ", 20, 80);
		System.out.println("WHY");
		this.drawBoxes(window);
	}

	public void drawBoxes(Graphics window) {
		// for loop to to across the x - getWidth() might be useful
		window.setColor(Color.BLUE);
		for (int x = 0; x < getWidth() / 10; x++) {
			// for loop to go down the y - getHeight() might be useful
			for (int y = 0; y < getHeight() / 10; y++) {
				window.fillRect(x + 1, y + 1, (getWidth() / 10) - 2, (getHeight() / 10) - 2);
				System.out.println(x + " " + y);
			}
		}
	}
}