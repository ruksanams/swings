package marksheet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class marksheet {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf11;
	private JTextField tf12;
	private JTextField tf13;
	private JTextField tf14;
	private JTextField tf15;
	private JTextField tf16;
	private JTextField tf17;
	private JTextField tf18;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					marksheet window = new marksheet();
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
	public marksheet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.getContentPane().setForeground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 894, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel.setBounds(15, 16, 387, 282);
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setForeground(new Color(192, 192, 192));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("Student_ID");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l1.setBounds(15, 16, 95, 30);
		panel.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(114, 26, 88, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel l2 = new JLabel("Firstname");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l2.setBounds(15, 62, 79, 20);
		panel.add(l2);
		
		tf2 = new JTextField();
		tf2.setBounds(114, 65, 88, 20);
		panel.add(tf2);
		tf2.setColumns(10);
		
		JLabel l3 = new JLabel("Surname");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l3.setBounds(15, 98, 69, 20);
		panel.add(l3);
		
		tf3 = new JTextField();
		tf3.setBounds(114, 98, 88, 20);
		panel.add(tf3);
		tf3.setColumns(10);
		
		JLabel l4 = new JLabel("Coursecode");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l4.setBounds(15, 134, 95, 20);
		panel.add(l4);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"14CS30", "14CS31", "14CS32"}));
		cb1.setBounds(114, 134, 88, 20);
		panel.add(cb1);
		
		tf4 = new JTextField();
		tf4.setBounds(114, 186, 88, 20);
		panel.add(tf4);
		tf4.setColumns(10);
		
		JLabel l5 = new JLabel("Total score");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l5.setBounds(15, 186, 88, 20);
		panel.add(l5);
		
		JLabel l6 = new JLabel("Average");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l6.setBounds(15, 219, 69, 20);
		panel.add(l6);
		
		tf5 = new JTextField();
		tf5.setBounds(114, 219, 88, 20);
		panel.add(tf5);
		tf5.setColumns(10);
		
		JLabel l7 = new JLabel("Ranking");
		l7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l7.setBounds(15, 248, 69, 20);
		panel.add(l7);
		
		tf6 = new JTextField();
		tf6.setBounds(114, 251, 88, 17);
		panel.add(tf6);
		tf6.setColumns(10);
		
		JLabel l11 = new JLabel("Maths");
		l11.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l11.setBounds(217, 21, 69, 20);
		panel.add(l11);
		
		tf11 = new JTextField();
		tf11.setBounds(293, 24, 79, 22);
		panel.add(tf11);
		tf11.setColumns(10);
		
		JLabel l12 = new JLabel("English");
		l12.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l12.setBounds(217, 62, 69, 20);
		panel.add(l12);
		
		JLabel l13 = new JLabel("Biology");
		l13.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l13.setBounds(217, 98, 69, 20);
		panel.add(l13);
		
		JLabel l14 = new JLabel("Computer");
		l14.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l14.setBounds(217, 134, 88, 20);
		panel.add(l14);
		
		JLabel l15 = new JLabel("Chemistry");
		l15.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l15.setBounds(210, 160, 95, 20);
		panel.add(l15);
		
		JLabel l16 = new JLabel("Physics");
		l16.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l16.setBounds(217, 186, 69, 20);
		panel.add(l16);
		
		JLabel l17 = new JLabel("Tamil");
		l17.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l17.setBounds(217, 219, 69, 20);
		panel.add(l17);
		
		JLabel l18 = new JLabel("Malayalam");
		l18.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l18.setBounds(210, 248, 88, 20);
		panel.add(l18);
		
		tf12 = new JTextField();
		tf12.setBounds(293, 62, 79, 23);
		panel.add(tf12);
		tf12.setColumns(10);
		
		tf13 = new JTextField();
		tf13.setBounds(293, 101, 79, 20);
		panel.add(tf13);
		tf13.setColumns(10);
		
		tf14 = new JTextField();
		tf14.setBounds(293, 137, 79, 20);
		panel.add(tf14);
		tf14.setColumns(10);
		
		tf15 = new JTextField();
		tf15.setBounds(293, 163, 79, 20);
		panel.add(tf15);
		tf15.setColumns(10);
		
		tf16 = new JTextField();
		tf16.setBounds(293, 192, 79, 20);
		panel.add(tf16);
		tf16.setColumns(10);
		
		tf17 = new JTextField();
		tf17.setBounds(293, 225, 79, 17);
		panel.add(tf17);
		tf17.setColumns(10);
		
		tf18 = new JTextField();
		tf18.setBounds(293, 251, 79, 20);
		panel.add(tf18);
		tf18.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Student Report", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(417, 16, 440, 323);
		panel_1.setBackground(new Color(100, 149, 237));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(15, 16, 410, 266);
		panel_1.add(textArea);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnClear.setForeground(new Color(0, 0, 128));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnClear.setBounds(173, 285, 115, 29);
		panel_1.add(btnClear);
		
		
		JButton badd = new JButton("Add Report");
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String d1=tf1.getText();
				String d2=tf2.getText();
				String d3=tf3.getText();
				String d11=tf11.getText();
				String d12=tf12.getText();
				String d13=tf13.getText();
				String d14=tf14.getText();
				String d15=tf15.getText();
				String d16=tf16.getText();
				String d17=tf17.getText();
				String d18=tf18.getText();
				String d30=(String)cb1.getSelectedItem();
				float a=Float.parseFloat(d11);
				float b=Float.parseFloat(d12);
				float c=Float.parseFloat(d13);
				float d=Float.parseFloat(d14);
				float j=Float.parseFloat(d15);
				float f=Float.parseFloat(d16);
				float g=Float.parseFloat(d17);
				float h=Float.parseFloat(d18);
				float total=(float)(a+b+c+d+j+f+g+h);
				float ave=(float)(total/8);
				String d19="";
				if(total>700)
				{
					d19="1";
					
				}
				else if(total>=600&&total<=700)
				{
					d19="2";
				}
				else if(total<600&&total>=500)
				{
					d19="3";
				}
				else if(total<500&&total>=400)
				{
					d19="4";
				}
				else if(total<400)
				{
					d19="Failed";
				}
				String d20=String.valueOf(total);
				String d21=String.valueOf(ave);
				String[]row= {d1,d30,d11,d12,d13,d14,d15,d16,d17,d18,d20,d21,d19};
				DefaultTableModel model1=(DefaultTableModel)table.getModel();
				model1.addRow(row);
				tf4.setText(d20);
				tf5.setText(d21);
				tf6.setText(d19);
				
			}
		});
		badd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		badd.setForeground(new Color(50, 205, 50));
		badd.setBounds(59, 501, 117, 29);
		frame.getContentPane().add(badd);
		
		JButton bdt = new JButton("Delete");
		bdt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int row=table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		bdt.setForeground(new Color(255, 0, 0));
		bdt.setFont(new Font("Times New Roman", Font.BOLD, 17));
		bdt.setBounds(213, 501, 86, 29);
		frame.getContentPane().add(bdt);
		
		JButton bsh = new JButton("Show Report");
		bsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("Studentrecord\n"
						+"Student Name :\t\t"+tf2.getText()+""+tf3.getText()+"\n"
						+"==================================================\n"
						+"Maths:\t\t" + tf11.getText()
						+ "\nEnglish:\t\t" + tf12.getText()
						+ "\nBiology:\t\t" + tf13.getText()
						+ "\nComputer:\t\t" +tf14.getText()
						+ "\nChemistry:\t\t" + tf15.getText()
						+ "\nPysics:\t\t" + tf16.getText()
						+ "\nTamil:\t\t" + tf17.getText()
						+ "\nMalayalam:\t\t" + tf18.getText()
						+"\n======================================"
						+ "\nTotal SCore:\t\t" + tf4.getText()
						+ "\nAverage:\t\t" + tf5.getText()
						+ "\nRanking:\t\t" +tf6.getText() + "\n"
						);


						
			}
		});
		bsh.setFont(new Font("Times New Roman", Font.BOLD, 17));
		bsh.setForeground(new Color(138, 43, 226));
		bsh.setBounds(314, 501, 129, 29);
		frame.getContentPane().add(bsh);
		
		JButton bExit = new JButton("Exit");
		bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bExit.setForeground(new Color(220, 20, 60));
		bExit.setFont(new Font("Times New Roman", Font.BOLD, 17));
		bExit.setBounds(475, 501, 115, 29);
		frame.getContentPane().add(bExit);
		
		JButton bre=new JButton("Reset");
		bre.setForeground(new Color(0, 100, 0));
		bre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		bre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf11.setText("");
				tf12.setText("");
				tf13.setText("");
				tf14.setText("");
				tf15.setText("");
				tf16.setText("");
				tf17.setText("");
				tf18.setText("");
				//cb1.setText("");
			}
		});
		bre.setBounds(629, 501, 115, 29);
		frame.getContentPane().add(bre);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.BOLD, 17));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student ID", "Course Name", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Tamil", "Malayalam", "TotalScore", "Average", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(104);
		table.getColumnModel().getColumn(2).setPreferredWidth(111);
		table.getColumnModel().getColumn(3).setPreferredWidth(89);
		table.getColumnModel().getColumn(5).setPreferredWidth(86);
		table.getColumnModel().getColumn(6).setPreferredWidth(86);
		table.getColumnModel().getColumn(9).setPreferredWidth(101);
		table.getColumnModel().getColumn(10).setPreferredWidth(88);
		table.setBackground(new Color(255, 255, 255));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(0, 398, 872, 87);
		frame.getContentPane().add(table);
	}
}
