//A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/1/16
//Class - 6th period
//Lab  - Colored Boxes

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxesStuckiLogan extends Canvas {
    public ColoredBoxesStuckiLogan() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics window) {

        drawBoxes(window);

        window.setColor(Color.RED);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.drawString("Graphics Lab Lab11g ", 20, 40);
        window.drawString("Drawing boxes with nested loops ", 20, 80);
    }

    public void drawBoxes(Graphics window) {
        //nested loops to draw the pretty boxes
        window.setColor(Color.BLUE);
        for (int x = 100; x < (9*20)+100; x += 20) {
            // for loop to go down the y - getHeight() might be useful
            for (int y = 100; y < (9*20)+100; y += 20) {
                window.fillRect(x + 2, y + 2, 20 - 4, 20 - 4);
            }
        }
    }
}