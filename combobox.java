package compobox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class combobox {

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
					combobox window = new combobox();
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
	public combobox() {
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
		
		JLabel l1 = new JLabel("Input");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBounds(65, 29, 68, 37);
		frame.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Amount");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l2.setBounds(65, 82, 69, 28);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("Output");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l3.setBounds(65, 126, 69, 31);
		frame.getContentPane().add(l3);
		tf1 = new JTextField();
		tf1.setBounds(235, 83, 126, 26);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(235, 174, 126, 26);
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"rupee", "dollar", "AED"}));
		cb1.setBounds(235, 34, 81, 26);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"rupee", "dollar", "AED"}));
		cb2.setBounds(235, 128, 81, 26);
		frame.getContentPane().add(cb2);
		
		
		
		JButton b1 = new JButton("Convert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String a=tf1.getText();
			float b=Float.parseFloat(a);
			if(cb1.getSelectedItem()=="rupee")
			{
				if(cb2.getSelectedItem()=="rupee")
				{
				  tf2.setText(a);	
				}
				else if(cb2.getSelectedItem()=="dollar")
				{
				float c=(float)(b*0.014);
				String out=String.valueOf(c);
				 tf2.setText(out);
			    }
				else if(cb2.getSelectedItem()=="AED")
				{
					float c=(float)(b*0.051);
					String out=String.valueOf(c);
					tf2.setText(out);	
				}
			}
			else if(cb1.getSelectedItem()=="dollar")
			{
				if(cb2.getSelectedItem()=="rupee")
				{
					float c=(float)(b*71.74);
					String out=String.valueOf(c);
							tf2.setText(out);
				}
				else if(cb2.getSelectedItem()=="dollar")
				{
					tf2.setText(a);
				}
				else if(cb2.getSelectedItem()=="AED")
				{
					float c=(float)(b*3.67);
					String out=String.valueOf(c);
							tf2.setText(out);
				}
			}
				else if(cb1.getSelectedItem()=="AED")
				{
				 if(cb2.getSelectedItem()=="rupee")
				 {
					 float c=(float)(b*19.53);
					 String out=String.valueOf(c);
							 tf2.setText(out);
				 }
				 else if(cb2.getSelectedItem()=="dollar")
				 {
					 float c=(float)(b*0.27);
					 String out=String.valueOf(c);
							 tf2.setText(out);
				 }
				 else if(cb2.getSelectedItem()=="AED")
				 {
					 tf2.setText(a);
				 }
			}
	     }
		});
		
		JButton b2 = new JButton("Exit");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		b2.setBounds(191, 216, 75, 29);
		frame.getContentPane().add(b2);
		b1.setBounds(59, 173, 115, 29);
		frame.getContentPane().add(b1);
		
		
	}
}
