import java.awt.*;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;

public class Mahem extends JFrame {
    private static int width = 50;
    private static int height = 50;

    public static void main(String[] args) {
    	
    	SwingUtilities.invokeLater(new Runnable() {
    		int xDir = 1;
    		int yDir = 1;
    		int changeBy = 10;
    	    int x = 0;
        	int y = 0;
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            public void run() {
            	while(true) {
                    Mahem m = new Mahem(x += (changeBy * xDir), y += (changeBy * yDir));
            	    if(x+40+width>=screenSize.getWidth() || x==0) xDir*=-1;
            	    if(y+80+height>=screenSize.getHeight() || y==0) yDir*=-1;
            	    System.out.println(x+" "+y+" "+screenSize.getWidth()+" "+screenSize.getHeight());
                }
            }
        });
    }

    private Mahem(int x, int y) {
        //System.out.println("Created GUI on EDT? "+
        //SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("lel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JPanel());
        f.pack();
        f.setSize(width, height);
        f.setLocation(x, y);
        f.setVisible(true);
    }
}
