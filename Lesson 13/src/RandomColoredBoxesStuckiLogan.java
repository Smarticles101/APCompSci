
//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/1/16
//Class - 6th period
//Lab  - Random Colored Boxes

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxesStuckiLogan extends JPanel {
    private Timer timer;
    private final static int SLEEP = 110;

    public RandomColoredBoxesStuckiLogan() {
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
        window.drawString("Graphics Lab Lab11k" +
                "", 20, 40);
        window.drawString("Drawing boxes with nested loops ", 20, 80);

        this.drawBoxes(window);
    }

    public void drawBoxes(Graphics window) {
        // for loop to to across the x - getWidth() might be useful
        for (int x = 0; x < getWidth(); x+=10) {
            // for loop to go down the y - getHeight() might be useful
            for (int y = 0; y < getHeight(); y+=10) {
                window.setColor(new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0)));
                window.fillRect(x + 2, y + 2,  10 - 4, 10 - 4);
            }
        }
    }
}