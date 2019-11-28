package tketbokig;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class hotelmanagement {
	public String Str1,Str2,Str3;
	public int f=0;
     int df=0;
     public float price,qty;
	private JFrame frame;
	private JTextField tcal;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t11;
	private JTextField t21;
	private JTextField t22;
	private JTextField t23;
	private JTextField t31;
	private JTextField t32;
	private JTextField t33;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelmanagement window = new hotelmanagement();
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
	public hotelmanagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 939, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Hotel Management System");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		l1.setBounds(179, 16, 380, 50);
		frame.getContentPane().add(l1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(15, 91, 350, 249);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(175, 7, 0, 0);
		panel.add(label);
		
		JLabel lb1 = new JLabel("Chiken Burger");
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lb1.setBounds(15, 16, 120, 38);
		panel.add(lb1);
		
		t1 = new JTextField();
		t1.setBounds(202, 22, 99, 26);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel l2 = new JLabel("Chicken Burger Meal");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		l2.setBounds(15, 70, 160, 20);
		panel.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(202, 64, 99, 26);
		panel.add(t2);
		t2.setColumns(10);
		
		JLabel lb3 = new JLabel("Cheese Burger");
		lb3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lb3.setBounds(15, 106, 140, 20);
		panel.add(lb3);
		
		t3 = new JTextField();
		t3.setBounds(204, 106, 99, 26);
		panel.add(t3);
		t3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(15, 142, 309, 8);
		panel.add(separator);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblQty.setBounds(206, 158, 69, 20);
		panel.add(lblQty);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Tea", "coffee", "Pepsi"}));
		cb1.setBounds(15, 183, 108, 20);
		panel.add(cb1);
		
		JLabel lb4 = new JLabel("Drink");
		lb4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lb4.setBounds(25, 158, 69, 20);
		panel.add(lb4);
		
		t4 = new JTextField();
		t4.setBounds(178, 181, 125, 23);
		panel.add(t4);
		t4.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Home Delivery");
		rb1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		rb1.setBounds(15, 215, 155, 26);
		panel.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Tax");
		rb2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		rb2.setBounds(172, 214, 140, 29);
		panel.add(rb2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(380, 91, 204, 249);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setBounds(15, 16, 174, 20);
		lblCurrencyConverter.setFont(new Font("Times New Roman", Font.BOLD, 19));
		panel_1.add(lblCurrencyConverter);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBounds(27, 71, 148, 20);
		cb2.setModel(new DefaultComboBoxModel(new String[] {"Select", "India", "USA", "UAE"}));
		panel_1.add(cb2);
		
		t11 = new JTextField();
		t11.setBounds(45, 136, 116, 20);
		panel_1.add(t11);
		t11.setColumns(10);
		
		
		//b11.setFont(new Font("Times New Roman", Font.BOLD, 16));
		//b11.setBounds(15, 204, 93, 29);
		//panel_1.add(b11);
		
		JButton b12 = new JButton("Close");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t11.setText("");
			}
		});
		b12.setBounds(117, 204, 72, 29);
		b12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_1.add(b12);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String max=t33.getText();
				float m1=Float.parseFloat(max);
				  if(cb2.getSelectedItem()=="India")
					{
				      t11.setText(max);
					}
				 else if(cb2.getSelectedItem()=="USA")
					{
					  float u=(float)(m1*0.014);
					  String out=String.valueOf(u);
					  t11.setText(out);
				    }
				 else if(cb2.getSelectedItem()=="UAE")
					{
					  float u=(float)(m1*0.051);
					  String out=String.valueOf(u);
					  t11.setText(out);	
					}
			
			}
		});
		btnConvert.setBounds(15, 204, 87, 29);
		panel_1.add(btnConvert);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(15, 346, 350, 130);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCostOfDrink = new JLabel("Cost of Drink");
		lblCostOfDrink.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCostOfDrink.setBounds(15, 16, 109, 20);
		panel_2.add(lblCostOfDrink);
		
		JLabel lblCostOfMeal = new JLabel("Cost of meal");
		lblCostOfMeal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCostOfMeal.setBounds(15, 43, 109, 20);
		panel_2.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of delivery");
		lblCostOfDelivery.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblCostOfDelivery.setBounds(15, 67, 138, 30);
		panel_2.add(lblCostOfDelivery);
		
		t21 = new JTextField();
		t21.setBounds(173, 16, 146, 20);
		panel_2.add(t21);
		t21.setColumns(10);
		
		t22 = new JTextField();
		t22.setBounds(173, 43, 146, 20);
		panel_2.add(t22);
		t22.setColumns(10);
		
		t23 = new JTextField();
		t23.setBounds(173, 75, 146, 20);
		panel_2.add(t23);
		t23.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(380, 346, 204, 130);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTax.setBounds(15, 16, 69, 20);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSubTotal.setBounds(15, 52, 69, 20);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTotal.setBounds(15, 88, 69, 20);
		panel_3.add(lblTotal);
		
		t31 = new JTextField();
		t31.setBounds(120, 13, 69, 23);
		panel_3.add(t31);
		t31.setColumns(10);
		
		t32 = new JTextField();
		t32.setBounds(118, 49, 71, 20);
		panel_3.add(t32);
		t32.setColumns(10);
		
		t33 = new JTextField();
		t33.setBounds(120, 85, 69, 20);
		panel_3.add(t33);
		t33.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(15, 492, 887, 62);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 268, 318);
		//panel_6.add(textArea);
		JButton brpt = new JButton("Receipt");
		brpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Item\t"+"Qty\t"+"Unit price\t"+"Price\t"+"\n"
						+"==================================================\n"
						+"Chicken Burger\t"+t1.getText()+"\t"+"50\t"+(Float.parseFloat(t1.getText())*50)
						+ "\nChicken meal\t"+t2.getText()+"\t"+"100\t"+(Float.parseFloat(t2.getText())*100)
						+ "\nCheese Burger\t"+t3.getText()+"\t"+"150\t"+(Float.parseFloat(t3.getText())*150)
						+ "\n"+cb1.getSelectedItem()+"\t"+t4.getText()+price+"\t"+(Float.parseFloat(t3.getText())*qty)
						+"\n======================================"
						+ "\nTax\t"+t31.getText()
						+ "\nSub Total\t"+t32.getText()
						+ "\nTotal\t"+t11.getText() + "\n"
						);


			}
		});
		brpt.setFont(new Font("Times New Roman", Font.BOLD, 16));
		brpt.setBounds(281, 16, 115, 29);
		panel_5.add(brpt);
		
		JButton brst = new JButton("Reset");
		brst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t11.setText("");
				t31.setText("");
				t32.setText("");
				t33.setText("");
				tcal.setText("");
				t21.setText("");
				t22.setText("");
				t23.setText("");
				textArea.setText("");
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
				rb1.setSelected(false);
				rb2.setSelected(false);
			}
		});
		brst.setFont(new Font("Times New Roman", Font.BOLD, 16));
		brst.setBounds(449, 16, 115, 29);
		panel_5.add(brst);
		
		JButton bxt = new JButton("Exit");
		bxt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		bxt.setFont(new Font("Times New Roman", Font.BOLD, 21));
		bxt.setBounds(616, 14, 115, 29);
		panel_5.add(bxt);
		
		JButton bt = new JButton("Total");
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a=t1.getText();
				String b=t2.getText();
				String c=t3.getText();
				float a1=Float.parseFloat(a);
				float b1=Float.parseFloat(b);
				float c1=Float.parseFloat(c);
				String q=t4.getText();
				float qty=Float.parseFloat(q);
				String data1=(String)cb1.getSelectedItem();
				float price=0;
				if(data1.equals("Tea"))
				{
					price=10*qty;
				}
			  else if(data1.equals("Coffe"))
				{
					price=20*qty;
				}
			  else if(data1.equals("Pepsi"))
				{
					price=30*qty;
				}
			String dp=String.valueOf(price);
			 t21.setText(dp);
			 float del;
		     if(rb1.isSelected())
				{ 
					del=30;
				}
		     else
		      {
		    	 del=0;
		      }
		    String dchr=String.valueOf(del);
		    t23.setText(dchr);
		    float crbr=(float)((50*a1)+(100*b1)+(150*c1));
		    String meal=String.valueOf(crbr);
		    t22.setText(meal);
		    float tax;
		    if(rb2.isSelected())
		     {
		    	tax=(float)((del*0.1)+(price*0.2)+(crbr*0.3));
		     }
		    else
		    {
		    	tax=0;
		    }
		   String tx=String.valueOf(tax);
		   t31.setText(tx);
		   float sub=(float)(del+price+crbr);
		   String sb=String.valueOf(sub);
		   t32.setText(sb);
		   float total=(float)(sub+tax);
		   String tl=String.valueOf(total);
		   t33.setText(tl);
		  
		  
		 }
		});
		
		
		bt.setFont(new Font("Times New Roman", Font.BOLD, 21));
		bt.setBounds(103, 14, 115, 29);
		panel_5.add(bt);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(599, 91, 303, 384);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(15, 16, 273, 352);
		panel_4.add(tabbedPane);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		tcal = new JTextField();
		tcal.setBounds(15, 16, 238, 38);
		panel_7.add(tcal);
		tcal.setColumns(10);
		
		JButton bB = new JButton("B");
		bB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Str1=tcal.getText();
				int l=Str1.length();
				String Str2=Str1.substring(0,l-1);
				tcal.setText(Str2);
			}
		});
		bB.setFont(new Font("Tahoma", Font.BOLD, 18));
		bB.setBounds(15, 70, 55, 29);
		panel_7.add(bB);
		
		JButton bC = new JButton("C");
		bC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tcal.setText("");
			}
		});
		bC.setFont(new Font("Tahoma", Font.BOLD, 18));
		bC.setBounds(76, 71, 55, 29);
		panel_7.add(bC);
		
		JButton bd1 = new JButton("...");
		bd1.setFont(new Font("Tahoma", Font.BOLD, 18));
		bd1.setBounds(138, 71, 47, 29);
		panel_7.add(bd1);
		
		JButton bp = new JButton("+");
		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Str1=tcal.getText();
				tcal.setText("");
				Str2=bp.getText();
				df=0;
			}
		});
		bp.setFont(new Font("Tahoma", Font.BOLD, 18));
		bp.setBounds(193, 71, 60, 29);
		panel_7.add(bp);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b7.getText()));
				
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 18));
		b7.setBounds(15, 123, 55, 29);
		panel_7.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b8.getText()));
				
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 18));
		b8.setBounds(76, 123, 55, 29);
		panel_7.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b9.getText()));
				
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 18));
		b9.setBounds(138, 123, 47, 29);
		panel_7.add(b9);
		
		JButton bm = new JButton("-");
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Str1=tcal.getText();
				tcal.setText("");
				Str2=bm.getText();
				df=0;
			}
		});
		bm.setFont(new Font("Tahoma", Font.BOLD, 18));
		bm.setBounds(193, 123, 60, 29);
		panel_7.add(bm);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}

				tcal.setText(tcal.getText().concat(b4.getText()));
				}
			
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 18));
		b4.setBounds(15, 168, 55, 29);
		panel_7.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b5.getText()));
				}
			
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 18));
		b5.setBounds(76, 168, 55, 29);
		panel_7.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b6.getText()));
				
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 18));
		b6.setBounds(138, 168, 47, 29);
		panel_7.add(b6);
		
		JButton bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Str1=tcal.getText();
				tcal.setText("");
				Str2=bmul.getText();
				df=0;
			}
		});
		bmul.setFont(new Font("Tahoma", Font.BOLD, 18));
		bmul.setBounds(193, 168, 60, 29);
		panel_7.add(bmul);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}

				tcal.setText(tcal.getText().concat(b1.getText()));

				}
			
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(15, 213, 55, 29);
		panel_7.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}

				tcal.setText(tcal.getText().concat(b2.getText()));
				}
			
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBounds(76, 213, 55, 29);
		panel_7.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				}
				tcal.setText(tcal.getText().concat(b3.getText()));
				}
			
			
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBounds(138, 213, 47, 29);
		panel_7.add(b3);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Str1=tcal.getText();
				tcal.setText("");
				Str2=bdiv.getText();
				df=0;
			}
		});
		bdiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		bdiv.setBounds(193, 213, 60, 29);
		panel_7.add(bdiv);
		
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Tahoma", Font.BOLD, 18));
		b0.setBounds(15, 261, 55, 29);
		panel_7.add(b0);
		
		JButton bpt = new JButton(".");
		bpt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(f==1)
				{
				tcal.setText("");
				f=0;
				df=0;
				}
				if(df==0)
				{
				tcal.setText(tcal.getText().concat(bpt.getText()));
				df=1;
				}
			}
		});
		bpt.setFont(new Font("Tahoma", Font.BOLD, 18));
		bpt.setBounds(76, 261, 55, 29);
		panel_7.add(bpt);
		
		JButton bd2 = new JButton("...");
		bd2.setFont(new Font("Tahoma", Font.BOLD, 18));
		bd2.setBounds(138, 261, 47, 29);
		panel_7.add(bd2);
		
		JButton beq = new JButton("=");
		beq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f++;
				float res1,res;
				float res2=Float.parseFloat(tcal.getText());
				f=1;
				if(Str2.equals("+"))
				{
				res1=Float.parseFloat(Str1);
				res=res1+res2;
				String str=String.valueOf(res);
				tcal.setText(str);

				}
				else if(Str2.equals("-"))
				{
				res1=Float.parseFloat(Str1);
				res=res1-res2;
				String str=String.valueOf(res);
				tcal.setText(str);

				}
				else if(Str2.equals("*"))
				{
				res1=Float.parseFloat(Str1);
				res=res1*res2;
				String str=String.valueOf(res);
				tcal.setText(str);

				}
				else if(Str2.equals("/"))
				{
				res1=Float.parseFloat(Str1);
				res=res1/res2;
				String str=String.valueOf(res);
				tcal.setText(str);

				}
		    	}
				});
				
		beq.setFont(new Font("Tahoma", Font.BOLD, 18));
		beq.setBounds(192, 261, 61, 29);
		panel_7.add(beq);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		//JTextArea textArea = new JTextArea();
		//textArea.setBounds(0, 0, 268, 318);
		panel_6.add(textArea);
	}
}
