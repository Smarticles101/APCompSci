import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewTest frame = new NewTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea txtrLllodgfjdaklfdjsajkvbsajklfdhjksla = new JTextArea();
		txtrLllodgfjdaklfdjsajkvbsajklfdhjksla.setText("lllodgfjdaklf;djsajkvbsajklfdhjksla");
		scrollPane.setViewportView(txtrLllodgfjdaklfdjsajkvbsajklfdhjksla);
		
		for(int x = 0; x<1000; x++) {
			txtrLllodgfjdaklfdjsajkvbsajklfdhjksla.append("lol\n");
		}
	}

}
