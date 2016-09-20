//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Smiley face lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas {
   public SmileyFace() {   //constructor - sets up the class 
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window ) {
      smileyFace(window);
   }

   public void smileyFace( Graphics window ) {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 200, 100, 400, 400 );

		//add more code here

      window.setColor(Color.GREEN);
      window.fillOval(375, 150, 20, 50);
      window.fillOval(425, 150, 20, 50);
      
      window.setColor(Color.BLACK);
      window.fillOval(400, 250, 20, 20);
      
      window.drawArc(325, 350, 200, 50, 180, 180);

   }
}