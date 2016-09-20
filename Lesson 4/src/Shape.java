// A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 9/20/16
//Class - 6th
//Lab  - Shape lab

import java.awt.Color;
import java.awt.Graphics;

public class Shape {
   //instance variables
	private int deltaY;
	private int deltaX;
	
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	private Color color;

   public Shape(int x, int y, int wid, int ht, Color col, int deltaX, int deltaY) {
		this.xPos = x;
		this.yPos = y;
		this.width = wid;
		this.height = ht;
		this.color = col;
		this.deltaY = deltaY;
		this.deltaX = deltaX;
   }


   public void draw(Graphics window) {
	   int greaterNum;
	   
	   if(width > height) {
		   greaterNum = width;
	   } else if(height > width) {
		   greaterNum = height;
	   } else {
		   greaterNum = width;
	   }
	   
	   for(int x = 0; x < greaterNum; x+=5) {
		   window.setColor(color);
		   
		   int w = width - (x*2);
		   int h = height - (x*2);
		   
		   if(w < 0 || h < 0) {
			   continue;
		   }
		   
		   System.out.println(w + ", " + h);
		   window.drawRect(xPos + x, yPos + x, w, h);
	   }
   }

   //BONUS
   //add in set and get methods for all instance variables

   public String toString() {
   	return xPos+" "+yPos+" "+width+" "+height+" "+color;
   }


   public int getDeltaX() {
	   return deltaX;
   }


   public void setDeltaX(int deltaX) {
	   this.deltaX = deltaX;
   }


   public int getDeltaY() {
	   return deltaY;
   }


   public void setDeltaY(int deltaY) {
	   this.deltaY = deltaY;
   }

   public int getxPos() {
		return xPos;
	}


	public void setxPos(int xPos) {
		this.xPos = xPos;
	}


	public int getyPos() {
		return yPos;
	}


	public void setyPos(int yPos) {
		this.yPos = yPos;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}
}
