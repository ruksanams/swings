package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class application {

	private JFrame frame;
	private JTextField textField;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("Degree");
		lblUserName.setBounds(41, 90, 120, 20);
		frame.getContentPane().add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(209, 87, 142, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel label = new JLabel("");
		label.setBounds(220, 115, 131, 20);
		frame.getContentPane().add(label);
		
		JButton btnToCelcious = new JButton("To celcious");
		btnToCelcious.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e) 
			{
				
				float t=Float.parseFloat(textField.getText());
				float temp=(float)(t-273.15);
				String str=String.valueOf(temp);
				label.setText("Result="+str);
			}
		});
		btnToCelcious.setBounds(15, 178, 115, 29);
		frame.getContentPane().add(btnToCelcious);
		
		
		JButton btnToFahrenheit = new JButton("To Fahrenheit");
		btnToFahrenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float t=Float.parseFloat(textField.getText());
				float temp=(float)(t-273.15)*9/5+32;
				String str=String.valueOf(temp);
				label.setText("Result="+str);
			}
		});
		btnToFahrenheit.setBounds(214, 178, 137, 29);
		frame.getContentPane().add(btnToFahrenheit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(124, 129, 120, 33);
		frame.getContentPane().add(lblNewLabel);
		
		}
}
