//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas {
	
	public Robot() {   //constructor method - sets up the class
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }
   
   public void paint( Graphics window ) {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      head(window);
      
      //call other methods
      upperBody(window);
      lowerBody(window);
      
   }

   public void head(Graphics window) {
      window.setColor(Color.YELLOW);

      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.BLUE);
      window.fillOval(350, 125, 25, 10);
      window.fillOval(425, 125, 25, 10);
      
      window.setColor(Color.BLACK);
      window.fillOval(395, 140, 10, 10);
      
      window.drawArc(375, 145, 50, 50, 180, 180);
   }

   public void upperBody( Graphics window ) {
	   window.setColor(Color.CYAN);
	   window.fillRect(300, 225, 200, 100);
	   
	   window.setColor(Color.GRAY);
	   window.drawLine(300, 225, 250, 175);
	   window.drawLine(500, 225, 550, 175);
   }

   public void lowerBody( Graphics window ) {
	   window.setColor(Color.MAGENTA);
	   window.fillRect(300, 350, 200, 100);
	   
	   window.setColor(Color.DARK_GRAY);
	   window.drawLine(300, 450, 250, 500);
	   window.drawLine(500, 450, 550, 500);
   }
}