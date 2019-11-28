package celciusnew;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class celciusnew {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					celciusnew window = new celciusnew();
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
	public celciusnew() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(15, 16, 398, 50);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("Input");
		l1.setBounds(113, 5, 55, 45);
		l1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		panel.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(198, 14, 146, 26);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel l2 = new JLabel("Input Scale");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l2.setBounds(25, 75, 96, 20);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Output Scale");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		l3.setBounds(282, 75, 131, 20);
		frame.getContentPane().add(l3);
		
		JRadioButton rb1 = new JRadioButton("Celcius");
		rb1.setBounds(25, 96, 155, 39);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Fahrenheit");
		rb2.setBounds(25, 133, 155, 39);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Kelvin");
		rb3.setBounds(25, 180, 165, 29);
		frame.getContentPane().add(rb3);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rb1);
		G1.add(rb2);
		G1.add(rb3);
		JRadioButton rb4 = new JRadioButton("Celcius");
		rb4.setBounds(282, 96, 120, 29);
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("Fahrenheit");
		rb5.setBounds(282, 133, 155, 39);
		frame.getContentPane().add(rb5);
		
		JRadioButton rb6 = new JRadioButton("Kelvin");
		rb6.setBounds(282, 170, 155, 39);
		frame.getContentPane().add(rb6);
		ButtonGroup G2=new ButtonGroup();
		G2.add(rb4);
		G2.add(rb5);
		G2.add(rb6);
		JLabel lout = new JLabel("output");
		lout.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lout.setBackground(Color.WHITE);
		lout.setBounds(92, 209, 88, 36);
		frame.getContentPane().add(lout);
		
		tf2 = new JTextField();
		tf2.setBounds(185, 217, 146, 20);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		rb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s=tf1.getText();
			float a=Float.valueOf(s);
			if(rb4.isSelected())
			{
				tf2.setText(s);
			}
			else if(rb5.isSelected())
			{
				float b=(float)(1.8*a)+32; 
				String r=String.valueOf(b);
				tf2.setText(r);
			}
			else
			{
				if(rb6.isSelected())
				{
					float b=(float)(a+273.15);
					String r=String.valueOf(b);
					tf2.setText(r);
					
				}
			}
			}
			});
		
		rb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s=tf1.getText();
			float a=Float.valueOf(s);
			if(rb4.isSelected())
			{
				float b=(float)(a-273.15);
				String r=String.valueOf(b);
				tf2.setText(r);
				
			}
			else if(rb5.isSelected())
			{
				float b=(float)((((a-273.15)*9)/5)+32);
		        String r=String.valueOf(b);
				tf2.setText(r);
			}
			else
			{
				if(rb6.isSelected())
				{
					
					tf2.setText(s);
					
				}
			}
			}
			});
		rb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s=tf1.getText();
			float a=Float.valueOf(s);
			if(rb4.isSelected())
			{
				float b=(float)((a-32)*5)/9;
				String r=String.valueOf(b);
				tf2.setText(r);
				
			}
			else if(rb5.isSelected())
			{
				
				tf2.setText(s);
			}
			else
			{
				if(rb6.isSelected())
				{
					float b=(float)((((a-32)*5)/9)+273.15);
					String r=String.valueOf(b);
					tf2.setText(r);
					
				}
			}
			}
			});
	


rb4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String s=tf1.getText();
	float a=Float.valueOf(s);
	if(rb1.isSelected())
	{
		tf2.setText(s);
	}
	else if(rb2.isSelected())
	{
		float b=(float)((a-32)*5)/9;
		String r=String.valueOf(b);
		tf2.setText(r);
	}
	else
	{
		if(rb3.isSelected())
		{
			float b=(float)(a-273.15);
			String r=String.valueOf(b);
			tf2.setText(r);
			
		}
	}
	}
	});

rb6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String s=tf1.getText();
	float a=Float.valueOf(s);
	if(rb1.isSelected())
	{
		float b=(float)(a+273.15);
		String r=String.valueOf(b);
		tf2.setText(r);
		
	}
	else if(rb2.isSelected())
	{
		float b=(float)((((a-32)*5)/9)+273.15);
		String r=String.valueOf(b);
		tf2.setText(r);
	}
	else
	{
		if(rb3.isSelected())
		{
			
			tf2.setText(s);
			
		}
	}
	}
	});
rb5.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String s=tf1.getText();
	float a=Float.valueOf(s);
	if(rb1.isSelected())
	{
		float b=(float)(1.8*a)+32; 
		String r=String.valueOf(b);
		tf2.setText(r);
		
	}
	else if(rb2.isSelected())
	{
		
		tf2.setText(s);
	}
	else
	{
		if(rb3.isSelected())
		{
			float b=(float)((((a-273.15)*9)/5)+32);
	        String r=String.valueOf(b);
			tf2.setText(r);
			
		}
	}
	}
	});
}
}
