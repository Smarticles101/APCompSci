/**
 * Variables lab
 * Logan Stucki
 * 6th period
 * 6/9/16
 * 
 * I got help from my brain...
 */

package swingtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VariablesStuckiLogan extends JFrame {

	private JPanel contentPane;
	private JTextArea text;
	private JTextField txtEnterAnInt;
	private JTextField txtEnterAByte;
	private JTextField txtEnterAShort;
	private JTextField txtEnterALong;
	private JTextField txtEnterAFloat;
	private JTextField txtEnterADouble;
	private JTextField txtEnterAChar;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
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
	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		txtEnterAByte = new JTextField();
		txtEnterAByte.setText("Enter a byte");
		panel.add(txtEnterAByte);
		txtEnterAByte.setColumns(10);
		
		txtEnterAShort = new JTextField();
		txtEnterAShort.setText("Enter a short");
		panel.add(txtEnterAShort);
		txtEnterAShort.setColumns(10);
		
		txtEnterAnInt = new JTextField();
		txtEnterAnInt.setText("Enter an int");
		panel.add(txtEnterAnInt);
		txtEnterAnInt.setColumns(10);
		
		txtEnterALong = new JTextField();
		txtEnterALong.setText("Enter a long");
		panel.add(txtEnterALong);
		txtEnterALong.setColumns(10);
		
		txtEnterAFloat = new JTextField();
		txtEnterAFloat.setText("Enter a float");
		panel.add(txtEnterAFloat);
		txtEnterAFloat.setColumns(10);
		
		txtEnterADouble = new JTextField();
		txtEnterADouble.setText("Enter a double");
		panel.add(txtEnterADouble);
		txtEnterADouble.setColumns(10);
		
		txtEnterAChar = new JTextField();
		txtEnterAChar.setText("Enter a unicode char value");
		panel.add(txtEnterAChar);
		txtEnterAChar.setColumns(10);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					byte usrByte = Byte.parseByte(txtEnterAByte.getText());
					short usrShort = Short.parseShort(txtEnterAShort.getText());
					int usrInt = Integer.parseInt(txtEnterAnInt.getText());
					long usrLong = Long.parseLong(txtEnterALong.getText());
					float usrFloat = Float.parseFloat(txtEnterAFloat.getText());
					double usrDouble = Double.parseDouble(txtEnterADouble.getText());
					char usrChar = (char)Short.parseShort(txtEnterAChar.getText());

					text.setText("");
					text.append("Byte: " + usrByte + "\n");
					text.append("Short: " + usrShort + "\n");
					text.append("Integer: " + usrInt + "\n");
					text.append("Long: " + usrLong + "\n");
					text.append("Float: " + usrFloat + "\n");
					text.append("Double: " + usrDouble + "\n");
					text.append("Char: " + usrChar + "\n");
				} catch(Exception ex) {
					text.setText("You just broke it...  Good job!  :D");
				}
			}
		});
		panel.add(btnSubmit);
		
		text = new JTextArea();
		text.setText("Finished product: ");
		contentPane.add(text, BorderLayout.SOUTH);
	}

}
