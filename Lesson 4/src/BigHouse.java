//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - House lab

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas {
   public BigHouse() { //constructor - sets up the class
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window ) {
      bigHouse(window);
   }

   public void bigHouse( Graphics window ) {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.CYAN);

      window.fillRect( 200, 200, 400, 400 );

      window.setColor(Color.LIGHT_GRAY);
      window.fillRect(100, 100, 600, 100);
      window.fillRect(375, 500, 50, 100);
      
      window.setColor(Color.ORANGE);
      window.fillRect(300, 300, 75, 75);
      window.fillRect(425, 300, 75, 75);
      
      window.drawRect(0, 0, 800, 600);
   }
}