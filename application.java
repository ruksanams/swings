import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class application {

	private JFrame frame;
	private JTextField t2;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					application window = new application();
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
	public application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("user name");
		l1.setBounds(29, 16, 95, 46);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("password");
		l2.setBounds(29, 107, 95, 20);
		frame.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setBounds(168, 26, 146, 26);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(168, 105, 146, 26);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		JLabel L3 = new JLabel("");
		JButton b1 = new JButton("SUBMIT");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
	{
			if(t1.getText().equals("ruksana")&& t2.getText().equals("123"))
			{	
				L3.setText("SUCCESS");
			}
				
			else
			{	
				L3.setText("UN SUCCESS");
			}
					
					
			}
		});
		b1.setBounds(118, 160, 115, 29);
		frame.getContentPane().add(b1);
		
		//JLabel L3 = new JLabel("");
		L3.setBounds(86, 205, 228, 20);
		frame.getContentPane().add(L3);
	}
}
