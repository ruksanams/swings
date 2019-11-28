package swingweight;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingwgt {

	private JFrame frame;
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingwgt window = new swingwgt();
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
	public swingwgt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(75, 34, 77, -30);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(15, 20, 398, 53);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBodyMassIndex = new JLabel("Body mass index");
		lblBodyMassIndex.setForeground(Color.GREEN);
		lblBodyMassIndex.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblBodyMassIndex.setBounds(105, 16, 250, 20);
		panel_1.add(lblBodyMassIndex);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setForeground(Color.DARK_GRAY);
		panel_2.setBounds(15, 77, 398, 214);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel l1 = new JLabel("Height(m)");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		l1.setBounds(28, 38, 103, 20);
		panel_2.add(l1);
		
		JLabel l2 = new JLabel("Weight(kg)");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		l2.setBounds(28, 94, 88, 20);
		panel_2.add(l2);
		
		tf = new JTextField();
		tf.setBounds(183, 35, 146, 26);
		panel_2.add(tf);
		tf.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBounds(183, 91, 146, 26);
		panel_2.add(tf1);
		tf1.setColumns(10);
		
		JLabel l3 = new JLabel("BMI");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l3.setBounds(38, 130, 69, 20);
		panel_2.add(l3);
		
		tf2 = new JTextField();
		tf2.setBounds(143, 126, 88, 26);
		panel_2.add(tf2);
		tf2.setColumns(10);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(249, 130, 134, 20);
		panel_2.add(l4);
		
		JButton b1 = new JButton("Calculate");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a=tf.getText();
				float height=Float.valueOf(a);
				String b=tf1.getText();
				float weight=Float.valueOf(b);
				float c=height*height;
				float d=weight/c;
				String e=String.valueOf(d);
				tf2.setText(e);
				if(d<18.5)
				{
					l4.setText("Under Weight");
				}
				else if(d>18.5&&d<24.5)
				{
					l4.setText("Normal Weight");
				}
				else if(d>25&&d<29.9)
				{
					l4.setText("Over Weight");
				}
				else
				{
					l4.setText("obese");
				}
				}
			
		});
		b1.setBounds(0, 169, 104, 29);
		panel_2.add(b1);
		
		JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tf.setText("");
				tf1.setText("");
				tf2.setText("");
			}
		});
		b2.setBounds(131, 168, 100, 29);
		panel_2.add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b3.setBounds(253, 169, 103, 29);
		panel_2.add(b3);
		
		
	}
}
