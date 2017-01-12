//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxes extends Canvas {
    public ColoredBoxes() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics window) {
        window.setColor(Color.RED);
        window.setFont(new Font("TAHOMA", Font.BOLD, 12));
        window.drawString("Graphics Lab Lab11g ", 20, 40);
        window.drawString("Drawing boxes with nested loops ", 20, 80);

        drawBoxes(window);
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