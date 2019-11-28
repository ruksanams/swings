package tketbokig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class tketbokig {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t11;
	private JTextField t12;
	private JTextField t13;
	private JTextField t14;
	private JTextField t15;
	private JTextField t21;
	private JTextField t22;
	private JTextField t23;
	private JTable table;
	static int v=5100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tketbokig window = new tketbokig();
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
	public tketbokig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 844, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		p1.setBounds(206, 16, 394, 45);
		frame.getContentPane().add(p1);
		
		JLabel lblTicketBooking = new JLabel("Ticket Booking");
		lblTicketBooking.setFont(new Font("Times New Roman", Font.BOLD, 26));
		p1.add(lblTicketBooking);
		
		JLabel l1 = new JLabel("Name");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l1.setBounds(11, 86, 69, 20);
		frame.getContentPane().add(l1);
		
		t1 = new JTextField();
		t1.setBounds(127, 85, 146, 26);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(11, 131, 320, 11);
		frame.getContentPane().add(separator);
		
		JRadioButton rb1 = new JRadioButton("Standard");
		rb1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb1.setBounds(11, 154, 93, 29);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Single ticket");
		rb2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb2.setBounds(127, 154, 124, 29);
		frame.getContentPane().add(rb2);
		
		JRadioButton rb3 = new JRadioButton("Adult");
		rb3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb3.setBounds(258, 154, 86, 29);
		frame.getContentPane().add(rb3);
		
		JRadioButton rb4 = new JRadioButton("First class");
		rb4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb4.setBounds(11, 191, 109, 29);
		frame.getContentPane().add(rb4);
		
		JRadioButton rb5 = new JRadioButton("Ac");
		rb5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb5.setBounds(127, 191, 51, 29);
		frame.getContentPane().add(rb5);
		
		JRadioButton rb6 = new JRadioButton("Sleeper");
		rb6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb6.setBounds(187, 191, 86, 29);
		frame.getContentPane().add(rb6);
		
		JRadioButton rb7 = new JRadioButton("Child");
		rb7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		rb7.setBounds(268, 191, 69, 29);
		frame.getContentPane().add(rb7);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"From", "Ernakulam", "chennai", "Mumbai"}));
		cb1.setBounds(11, 229, 98, 26);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"To", "Ernakulam", "Chennai", "Mumbai"}));
		cb2.setBounds(115, 229, 103, 26);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"No:of seats", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb3.setBounds(223, 229, 108, 26);
		frame.getContentPane().add(cb3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(11, 271, 320, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel l2 = new JLabel("Tax");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l2.setBounds(11, 289, 69, 20);
		frame.getContentPane().add(l2);
		
		t2 = new JTextField();
		t2.setBounds(143, 289, 93, 26);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel l3 = new JLabel("Sub total");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l3.setBounds(11, 334, 79, 20);
		frame.getContentPane().add(l3);
		
		t3 = new JTextField();
		t3.setBounds(143, 331, 93, 26);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel l4 = new JLabel("Total");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l4.setBounds(11, 370, 69, 20);
		frame.getContentPane().add(l4);
		
		t4 = new JTextField();
		t4.setBounds(143, 373, 93, 26);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(11, 406, 320, 2);
		frame.getContentPane().add(separator_2);
		ButtonGroup G1=new ButtonGroup();
		G1.add(rb4);
		G1.add(rb5);
		G1.add(rb6);
		ButtonGroup G2=new ButtonGroup();
		G1.add(rb1);
		G1.add(rb2);
		G1.add(rb3);
		JButton b1 = new JButton("Total");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=(String)cb1.getSelectedItem();
				String data2=(String)cb2.getSelectedItem();
				float price=0;
				if(data1.contentEquals("Ernakulam")&&data2.contentEquals("Chennai"))
				{
					price=100;
				}
			 else if(data1.contentEquals("Ernakulam")&&data2.contentEquals("Mumbai"))
				{
					price=200;
				}
			 else if(data1.contentEquals("Chennai")&&data2.contentEquals("Ernakulam"))
				{
					price=250;
				}
			 else if(data1.contentEquals("Chennai")&&data2.contentEquals("Mumbai"))
				{
					price=350;
				}
			 else if(data1.contentEquals("Mumbai")&&data2.contentEquals("Ernakulam"))
				{
					price=200;
				}
			 else if(data1.contentEquals("Mumbai")&&data2.contentEquals("Chennai"))
				{
					price=100;
				}
			 else
			 {
				 if(data1.contentEquals("Mumbai")&&data2.contentEquals("Mumbai"))
					{
						JOptionPane.showMessageDialog(null, "Invalid Entry","Ticket details",JOptionPane.OK_OPTION);
					}
				 else if(data1.contentEquals("Chennai")&&data2.contentEquals("Chennai"))
					{
					 JOptionPane.showMessageDialog(null, "Invalid Entry","Ticket details",JOptionPane.OK_OPTION);
					}
				 else if(data1.contentEquals("Ernakulam")&&data2.contentEquals("Ernakulam"))
					{
					 JOptionPane.showMessageDialog(null, "Invalid Entry","Ticket details",JOptionPane.OK_OPTION);
					}
			   }
				String a=t1.getText();
				t11.setText(a);
				String b=(String)cb3.getSelectedItem();
				float c=Float.parseFloat(b);
				float tax=0,st=0,total=0;
				float tr;
				float tx;
				if(rb4.isSelected())
				{ 
					tr=(float)(price+(price*0.3));
				    tx=(float)(tr*0.3); 
					tax=(float)(tr*c);
					st=(float)(tx*c);
				    total=tax+st;
				}
		      else if(rb5.isSelected())
				{ 
		    	  tr=(float)(price+(price*0.2));
				    tx=(float)(tr*0.2);
					 tax=(float)(tr*c);
					 st=(float)(tx*c);
					 total=tax+st;
				}
		     else if(rb6.isSelected())
				{
		    	 tr=(float)(price);
				    tx=(float)(tr*0.1);
					tax=(float)(tr*c);
					st=(float)(tx*c);
				    total=tax+st;
				}
			    String str1=String.valueOf(tax);
			    t2.setText(str1);
			    String str2=String.valueOf(st);
			    t3.setText(str2);
			    String str3=String.valueOf(total);
			    t4.setText(str3);
			    t22.setText(str3);
			    String d=(String)cb1.getSelectedItem();
			    t12.setText(d);    
			    String f=(String)cb2.getSelectedItem();
			    t13.setText(f);
			    LocalTime m=java.time.LocalTime.now(); 
			    String t=String.valueOf(m);
			    t15.setText(t);
			    LocalDate m1=java.time.LocalDate.now();
			    String q=String.valueOf(m1);
			    t14.setText(q);
			    v++;
			    String str4=String.valueOf(v);
			    t21.setText(str4);  
			    t23.setText("any");
			    
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1.setBounds(21, 427, 69, 29);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Reset");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t11.setText("");
				t12.setText("");
				t13.setText("");
				t14.setText("");
				t21.setText("");
				t22.setText("");
				t23.setText("");
				cb1.setSelectedIndex(0);
				cb3.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				G1.clearSelection();
				G2.clearSelection();
				
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b2.setBounds(127, 427, 91, 29);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b3.setBounds(258, 427, 86, 29);
		frame.getContentPane().add(b3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(358, 77, 464, 389);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l11 = new JLabel("Name");
		l11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l11.setBounds(15, 53, 69, 20);
		panel.add(l11);
		
		t11 = new JTextField();
		t11.setBounds(99, 51, 124, 26);
		panel.add(t11);
		t11.setColumns(10);
		
		JLabel l12 = new JLabel("From");
		l12.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l12.setBounds(15, 145, 69, 20);
		panel.add(l12);
		
		JLabel l13 = new JLabel("To");
		l13.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l13.setBounds(15, 181, 69, 20);
		panel.add(l13);
		
		JLabel l14 = new JLabel("Date");
		l14.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l14.setBounds(15, 217, 69, 20);
		panel.add(l14);
		
		JLabel l15 = new JLabel("Time");
		l15.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l15.setBounds(15, 258, 69, 20);
		panel.add(l15);
		
		t12 = new JTextField();
		t12.setBounds(99, 142, 124, 26);
		panel.add(t12);
		t12.setColumns(10);
		
		t13 = new JTextField();
		t13.setBounds(99, 178, 124, 26);
		panel.add(t13);
		t13.setColumns(10);
		
		t14 = new JTextField();
		t14.setBounds(99, 214, 124, 26);
		panel.add(t14);
		t14.setColumns(10);
		
		t15 = new JTextField();
		t15.setBounds(99, 255, 124, 26);
		panel.add(t15);
		t15.setColumns(10);
		
		JButton b4 = new JButton("Confirm");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String d1=t1.getText();
				String d2=t21.getText();
				String d3=t12.getText();
				String d4=t13.getText();
				String d5=(String)cb3.getSelectedItem();
				String d6=t15.getText();
				String d7=t14.getText();
				//String d1=t1.getText();
				String d9=t22.getText();
				String d8="";
				if(rb4.isSelected())
				{  
					d8="AC";
				}
			else if(rb5.isSelected())
				{  
					d8="AC";
				}
			else if(rb6.isSelected())
				{  
					d8="Non AC";
				}
				String[]row= {d1,d2,d3,d4,d5,d6,d7,d8,d9};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
			}
		});
		b4.setBounds(245, 322, 115, 29);
		panel.add(b4);
		
		JLabel l21 = new JLabel("Ticket No");
		l21.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l21.setBounds(327, 145, 85, 20);
		panel.add(l21);
		
		t21 = new JTextField();
		t21.setBounds(318, 169, 115, 20);
		panel.add(t21);
		t21.setColumns(10);
		
		JLabel l22 = new JLabel("Price");
		l22.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l22.setBounds(327, 196, 69, 20);
		panel.add(l22);
		
		t22 = new JTextField();
		t22.setBounds(318, 220, 115, 20);
		panel.add(t22);
		t22.setColumns(10);
		
		JLabel l23 = new JLabel("Route");
		l23.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l23.setBounds(327, 243, 69, 20);
		panel.add(l23);
		
		t23 = new JTextField();
		t23.setBounds(318, 266, 115, 20);
		panel.add(t23);
		t23.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLUE);
		panel_1.setBounds(21, 494, 786, 104);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No:of Seats", "Time", "Date", "Ac/Non Ac", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(101);
		table.getColumnModel().getColumn(3).setPreferredWidth(104);
		table.getColumnModel().getColumn(4).setPreferredWidth(112);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(104);
		table.getColumnModel().getColumn(7).setPreferredWidth(108);
		table.getColumnModel().getColumn(8).setPreferredWidth(105);
		table.setBounds(15, 16, 756, 72);
		panel_1.add(table);
	}
}
