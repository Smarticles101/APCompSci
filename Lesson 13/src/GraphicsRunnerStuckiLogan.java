//� A+ Computer Science  -  www.apluscompsci.com
//Name - Logan Stucki
//Date - 13/1/16
//Class - 6th period
//Lab  - Graphics Runner

import javax.swing.JFrame;

public class GraphicsRunnerStuckiLogan extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GraphicsRunnerStuckiLogan() {
        super("Graphics Runner");
        setSize(WIDTH, HEIGHT);

        //getContentPane().add(new ColoredBoxesStuckiLogan());

        getContentPane().add(new RandomColoredBoxesStuckiLogan());

        setVisible(true);
    }

    public static void main(String args[]) {
        GraphicsRunnerStuckiLogan run = new GraphicsRunnerStuckiLogan();
    }
}