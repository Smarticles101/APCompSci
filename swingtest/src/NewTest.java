import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewTest {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		NewTest test = new NewTest();
		System.out.println( 1 % 5 );				// LINE 1

		System.out.println( 5 % 2 );				// LINE 2

		System.out.println( 7.2 % 3 );				// LINE 3

		System.out.println( 'A' + 9 );				// LINE 4

		System.out.println( 9.3 % 3 );				// LINE 5

		System.out.println( 'c' + 5 );				// LINE 6

		System.out.println( Math.pow(3,3) );    		// LINE 7

		System.out.println( Math.ceil(3.4) );    		// LINE 8

		System.out.println( Math.floor(4.6) );   		// LINE 9

		System.out.println( Math.sqrt(12) );    		// LINE 10

		System.out.println( Math.round(12.34) );   		// LINE 11

		System.out.println( Math.round(12.56) );   		// LINE 12

		System.out.println( Math.max(12,34));    		// LINE 13

		System.out.println( Math.min(12,34));    		// LINE 14

		System.out.println( Math.max(12.3,45.6));  		// LINE 15

		System.out.println( Math.min(12.3,45.6));  		// LINE 16

		System.out.println( Math.abs(-213));    		// LINE 17

		System.out.println( Math.abs(213));    		// LINE 18

		System.out.println( Math.ceil(Math.sqrt(17)));	// LINE 19
	}

	/**
	 * Create the frame.
	 */
	public NewTest() {
		
	}

}
