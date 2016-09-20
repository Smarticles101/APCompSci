
//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Shape lab

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Timer;

public class ShapePanel extends Canvas {
	int numShapes;
	List<Shape> shapeList;

	public ShapePanel(int numShapes) {

		setIgnoreRepaint(true);

		setBackground(Color.WHITE);

		this.numShapes = numShapes;

		shapeList = new ArrayList<Shape>();

		int minHeight = 25;
		int maxHeight = 200;
		int minWidth = 25;
		int maxWidth = 200;

		/*
		 * For the amount of shapes requested, add a new Shape to the shapeList
		 * with a random x value between 0 and the height of the JFrame minus
		 * the shape width a random y value between 0 and the width of the
		 * JFrame minus the shape height a random width between the minimum
		 * width and the maximum width a random height between the minimum
		 * height and the maximum height a color with rgb values between 0 and
		 * 255 and changeXBy value between -10 and 10
		 */

		for (int x = 0; x < numShapes; x++) {
			int width = (int) getRandom(minWidth, maxWidth);
			int height = (int) getRandom(minHeight, maxHeight);

			int randDeltaX = 0;
			int randDeltaY = 0;

			do {
				randDeltaX = (int) getRandom(-2, 2);
				randDeltaY = (int) getRandom(-2, 2);
			} while (randDeltaX == 0 || randDeltaY == 0);

			shapeList.add(new Shape((int) Math.random() * (getWidth() - width),
					(int) Math.random() * (getHeight() - height), width, height,

					new Color((int) getRandom(0, 255), (int) getRandom(0, 255), (int) getRandom(0, 255)), randDeltaX,
					randDeltaY));

			ActionListener updater = new ActionListener() {
				public void actionPerformed(ActionEvent bleck) {
					updateAnimation();
				}
			};

			new Timer(16, updater).start();

		}
	}

	/*
	 * All of your test code should be placed in paint.
	 */
	public void updateAnimation() {
		try {
			Dimension size = getSize();

			BufferStrategy strategy = getBufferStrategy();
			Graphics window = strategy.getDrawGraphics();

			window.setColor(Color.WHITE);
			window.fillRect(0, 0, getWidth(), getHeight());
			window.setColor(Color.BLUE);
			window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
			window.setFont(new Font("TAHOMA", Font.BOLD, 18));
			window.drawString("CREATE YOUR OWN SHAPE!", 40, 40);

			for (Shape shape : shapeList) {
				if (shape.getDeltaX() > 0) {
					if (shape.getxPos() > size.width - shape.getWidth())
						shape.setDeltaX(-shape.getDeltaX());
				} else {
					if (shape.getxPos() < 0)
						shape.setDeltaX(-shape.getDeltaX());
				}
				// check on the Y axis
				if (shape.getDeltaY() > 0) {
					if (shape.getyPos() > size.height - shape.getHeight())
						shape.setDeltaY(-shape.getDeltaY());
				} else {
					if (shape.getyPos() < 0)
						shape.setDeltaY(-shape.getDeltaY());
				}

				shape.setxPos(shape.getxPos() + shape.getDeltaX());
				shape.setyPos(shape.getyPos() + shape.getDeltaY());

				shape.draw(window);
			}

			window.dispose();

			strategy.show();

		} catch (Exception e) {
			updateAnimation();
		}
	}

	public double getRandom(int min, int max) {
		return min + (Math.random() * ((max - min) + 1));
	}
}
