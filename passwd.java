package password;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passwd {

	private JFrame frame;
	private JTextField tf1;
	private JPasswordField passwordField;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passwd window = new passwd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public passwd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("username");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l1.setBounds(60, 64, 92, 20);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Password");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l2.setBounds(60, 122, 92, 32);
		frame.getContentPane().add(l2);
		
		tf1 = new JTextField();
		tf1.setBounds(231, 61, 146, 26);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(359, 142, -131, 32);
		frame.getContentPane().add(passwordField);
		
		pf1 = new JPasswordField();
		pf1.setBounds(233, 122, 138, 32);
		frame.getContentPane().add(pf1);

		JLabel l5 = new JLabel("");
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user=tf1.getText();
				String paswd=pf1.getText();
				if(user.equals("Ruksana")&&paswd.equals("123"))
				{
					l5.setText("SUCCESS");
				}
				else
					{
					l5.setText("UN SUCCESS");
					}
			}
		});
		btnSubmit.setBounds(133, 200, 115, 29);
		frame.getContentPane().add(btnSubmit);
		
		
		l5.setBounds(148, 164, 146, 20);
		frame.getContentPane().add(l5);
	}
}
