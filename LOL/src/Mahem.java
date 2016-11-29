import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JTextField;

public class Mahem {
    
    public static void main(String[] args) {
    	int x =0;
    	int y=0;
        while(true) {
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(x++, y++); 
            }
        });
        }
    }

    private static void createAndShowGUI(int x, int y) {
        //System.out.println("Created GUI on EDT? "+
        //SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("REKT");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JPanel());
        f.pack();
        f.setSize(50, 50);
        f.setLocation(x, y);
        f.setVisible(true);
    }
}
