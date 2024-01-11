package javaPos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class javaEclipse {

	private JFrame frame;
	private JTable table;
	private JTextField jtxtBarCode;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtChange;
	private JTextField jtxtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaEclipse window = new javaEclipse();
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
	public javaEclipse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//-----------------------------------------------functions------------------------------------
	
	public void ItemCost() {

	    double sum = 0;
	    double tax = 3.9;

	    for (int i = 0; i < table.getRowCount(); i++) {
	        sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
	    }
	    
	    jtxtSubTotal.setText(Double.toString(sum));

	    double cTotal = Double.parseDouble(jtxtSubTotal.getText());

	    double cTax = (cTotal * tax) / 100;
	    String iTaxTotal = String.format("₹ %.2f", cTax);
	    jtxtTax.setText(iTaxTotal);

	   
	    String iSubTotal = String.format("₹ %.2f", cTotal);
	    jtxtSubTotal.setText(iSubTotal);

	    String iTotal = String.format("₹ %.2f", cTotal + cTax);
	    jtxtTotal.setText(iTotal);

	    String BarCode = String.format("Total is %.2f", cTotal + cTax);
	    jtxtBarCode.setText(BarCode);
	}

//----------------------------------------------------------------function------------------------------
	
	public void Change(){
		
	double sum = 0;
	double tax = 3.9;
	
	double cash = Double.parseDouble(jtxtDisplay.getText());
	for(int i=0;i<table.getRowCount(); i++) {
		sum = sum+ Double.parseDouble(table.getValueAt(i, 2).toString());
	}
	double cTax = (sum * tax)/100;
	double cChange = (cash - (sum + cTax));
	String changeGiven = String.format("₹%.2f", cChange);
	jtxtChange.setText(changeGiven);
	}
	
//----------------------------------------------------------function-------------------------------------
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(649, 11, 772, 404);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_5_4_8 = new JButton("");
		btnNewButton_5_4_8.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (2).jpg"));
		btnNewButton_5_4_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 350.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 1","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8.setBounds(12, 13, 140, 123);
		panel_1.add(btnNewButton_5_4_8);
		
		JButton btnNewButton_5_4_8_1 = new JButton("");
		btnNewButton_5_4_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 400.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 6","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_1.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (3).jpg"));
		btnNewButton_5_4_8_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_1.setBounds(12, 140, 140, 123);
		panel_1.add(btnNewButton_5_4_8_1);
		
		JButton btnNewButton_5_4_8_2 = new JButton("");
		btnNewButton_5_4_8_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 600.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 11","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_2.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\th.jpg"));
		btnNewButton_5_4_8_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_2.setBounds(12, 268, 140, 123);
		panel_1.add(btnNewButton_5_4_8_2);
		
		JButton btnNewButton_5_4_8_2_1 = new JButton("");
		btnNewButton_5_4_8_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 390.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 12","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_2_1.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (10).jpg"));
		btnNewButton_5_4_8_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_2_1.setBounds(164, 268, 140, 123);
		panel_1.add(btnNewButton_5_4_8_2_1);
		
		JButton btnNewButton_5_4_8_1_1 = new JButton("");
		btnNewButton_5_4_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 520.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 7","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_1_1.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP.jpg"));
		btnNewButton_5_4_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_1_1.setBounds(164, 140, 140, 123);
		panel_1.add(btnNewButton_5_4_8_1_1);
		
		JButton btnNewButton_5_4_8_3 = new JButton("");
		btnNewButton_5_4_8_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 410.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 2","1",PriceOfItem});
				 ItemCost();
			}
		});
		btnNewButton_5_4_8_3.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (5).jpg"));
		btnNewButton_5_4_8_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_3.setBounds(164, 13, 140, 123);
		panel_1.add(btnNewButton_5_4_8_3);
		
		JButton btnNewButton_5_4_8_2_2 = new JButton("");
		btnNewButton_5_4_8_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 600.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 13","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_2_2.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (14).jpg"));
		btnNewButton_5_4_8_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_2_2.setBounds(316, 268, 140, 123);
		panel_1.add(btnNewButton_5_4_8_2_2);
		
		JButton btnNewButton_5_4_8_1_2 = new JButton("");
		btnNewButton_5_4_8_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 480.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 8","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_1_2.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (6).jpg"));
		btnNewButton_5_4_8_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_1_2.setBounds(316, 140, 140, 123);
		panel_1.add(btnNewButton_5_4_8_1_2);
		
		JButton btnNewButton_5_4_8_4 = new JButton("");
		btnNewButton_5_4_8_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 450.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 3","1",PriceOfItem});
				ItemCost();
			}
			
		});
		btnNewButton_5_4_8_4.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (1).jpg"));
		btnNewButton_5_4_8_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_4.setBounds(316, 13, 140, 123);
		panel_1.add(btnNewButton_5_4_8_4);
		
		JButton btnNewButton_5_4_8_2_3 = new JButton("");
		btnNewButton_5_4_8_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 300.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 14","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_2_3.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (13).jpg"));
		btnNewButton_5_4_8_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_2_3.setBounds(466, 268, 140, 123);
		panel_1.add(btnNewButton_5_4_8_2_3);
		
		JButton btnNewButton_5_4_8_1_3 = new JButton("");
		btnNewButton_5_4_8_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 350.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 9","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_1_3.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (4).jpg"));
		btnNewButton_5_4_8_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_1_3.setBounds(466, 140, 140, 123);
		panel_1.add(btnNewButton_5_4_8_1_3);
		
		JButton btnNewButton_5_4_8_5 = new JButton("");
		btnNewButton_5_4_8_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 380.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 4","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_5.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (16).jpg"));
		btnNewButton_5_4_8_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_5.setBounds(466, 13, 140, 123);
		panel_1.add(btnNewButton_5_4_8_5);
		
		JButton btnNewButton_5_4_8_2_4 = new JButton("");
		btnNewButton_5_4_8_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 500.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 15","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_2_4.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (12).jpg"));
		btnNewButton_5_4_8_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_2_4.setBounds(618, 268, 140, 123);
		panel_1.add(btnNewButton_5_4_8_2_4);
		
		JButton btnNewButton_5_4_8_1_4 = new JButton("");
		btnNewButton_5_4_8_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 450.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 10","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_1_4.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (7).jpg"));
		btnNewButton_5_4_8_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_1_4.setBounds(618, 140, 140, 123);
		panel_1.add(btnNewButton_5_4_8_1_4);
		
		JButton btnNewButton_5_4_8_6 = new JButton("");
		btnNewButton_5_4_8_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 500.00;
				DefaultTableModel model =(DefaultTableModel) table.getModel();
				model.addRow(new Object[] {"cake 5","1",PriceOfItem});
				ItemCost();
			}
		});
		btnNewButton_5_4_8_6.setIcon(new ImageIcon("C:\\Users\\Ayan\\Downloads\\OIP (8).jpg"));
		btnNewButton_5_4_8_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5_4_8_6.setBounds(618, 13, 140, 123);
		panel_1.add(btnNewButton_5_4_8_6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(31, 11, 267, 404);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn0.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn0.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn0.setBounds(12, 303, 78, 88);
		panel.add(jbtn0);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn1.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn1.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn1.setBounds(12, 204, 78, 88);
		panel.add(jbtn1);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn4.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn4.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
				
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn4.setBounds(12, 106, 78, 88);
		panel.add(jbtn4);
		
		JButton jbtn7 = new JButton("7\r\n");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn7.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn7.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn7.setBounds(12, 13, 78, 88);
		panel.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn8.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn8.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
			
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn8.setBounds(97, 13, 78, 88);
		panel.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn9.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn9.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn9.setBounds(177, 13, 78, 88);
		panel.add(jbtn9);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn5.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn5.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn5.setBounds(97, 106, 78, 88);
		panel.add(jbtn5);
		
		JButton jbtn6 = new JButton("6\r\n");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn6.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn6.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn6.setBounds(177, 106, 78, 88);
		panel.add(jbtn6);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn2.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn2.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn2.setBounds(97, 202, 78, 88);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				String Enternumber = jtxtDisplay.getText();
				
				if(Enternumber == "") {
					jtxtDisplay.setText(jbtn3.getText());
				}
				else {
					Enternumber = jtxtDisplay.getText()+ jbtn3.getText();
					jtxtDisplay.setText(Enternumber);
				}
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtn3.setBounds(177, 202, 78, 88);
		panel.add(jbtn3);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (!jtxtDisplay.getText().contains(".")) {
					jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());
				}
				
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnDot.setBounds(97, 303, 78, 88);
		panel.add(jbtnDot);
		
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
			
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnC.setBounds(177, 303, 78, 88);
		panel.add(jbtnC);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(31, 426, 1390, 250);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(12, 13, 440, 220);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblNewLabel.setBounds(12, 13, 100, 55);
		panel_3.add(lblNewLabel);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Dialog", Font.BOLD, 22));
		jtxtTax.setBounds(200, 13, 230, 55);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Dialog", Font.BOLD, 22));
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(200, 81, 230, 55);
		panel_3.add(jtxtSubTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Dialog", Font.BOLD, 22));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(200, 149, 230, 55);
		panel_3.add(jtxtTotal);
		
		JLabel lblSubtotal = new JLabel("SubTotal\r\n");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblSubtotal.setBounds(12, 81, 150, 55);
		panel_3.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblTotal.setBounds(12, 149, 100, 55);
		panel_3.add(lblTotal);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(464, 13, 460, 220);
		panel_2.add(panel_3_1);
		
		JLabel lblPaymentMethod = new JLabel("Pay Method");
		lblPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPaymentMethod.setBounds(30, 13, 170, 55);
		panel_3_1.add(lblPaymentMethod);
		
		JLabel lblNewLabel_1_1 = new JLabel("Display Cash");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_1.setBounds(30, 81, 170, 55);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Change");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_2_1.setBounds(30, 149, 100, 55);
		panel_3_1.add(lblNewLabel_2_1);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Dialog", Font.BOLD, 22));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(218, 149, 230, 55);
		panel_3_1.add(jtxtChange);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Dialog", Font.BOLD, 22));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(218, 81, 230, 55);
		panel_3_1.add(jtxtDisplay);
		
		JComboBox jcboPayment = new JComboBox();
		jcboPayment.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Visa Card", "Master Card"}));
		jcboPayment.setFont(new Font("Tahoma", Font.BOLD, 24));
		jcboPayment.setBounds(218, 15, 230, 55);
		panel_3_1.add(jcboPayment);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_2.setBounds(938, 13, 440, 220);
		panel_2.add(panel_3_2);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jcboPayment.getSelectedItem().equals("Cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(12, 13, 130, 90);
		panel_3_2.add(btnNewButton);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header = new MessageFormat("Printing in Progress");
				MessageFormat footer = new MessageFormat("Page {0, number, integer}");
				
				try {
					table.print(JTable.PrintMode.NORMAL,header, footer);
				}
				catch(java.awt.print.PrinterException ex) {
					System.err.format("No Printer Found",ex.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnPrint.setBounds(154, 13, 130, 90);
		panel_3_2.add(btnPrint);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtTotal.setText(null);
				//jtxtSubTotal.setText(null);
				jtxtBarCode.setText(null);
				
				DefaultTableModel RecordTable = (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);

           }
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnReset.setBounds(298, 13, 130, 90);
		panel_3_2.add(btnReset);
		
		JButton btnRemoveItem = new JButton("Remove Item");
		btnRemoveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int RemoveItem = table.getSelectedRow();
				if(RemoveItem >= 0) {
					model.removeRow(RemoveItem);
				}
				ItemCost();
				if(jcboPayment.getSelectedItem().equals("cash")) {
					Change();
				}
				else {
					jtxtChange.setText("");
					jtxtDisplay.setText("");
				}
			}
		});
		btnRemoveItem.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnRemoveItem.setBounds(12, 117, 200, 90);
		panel_3_2.add(btnRemoveItem);
		
		JButton btnNewButton_3_1 = new JButton("Exit");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Exit Page",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton_3_1.setBounds(224, 117, 200, 90);
		panel_3_2.add(btnNewButton_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(310, 11, 327, 350);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"Item", "Qnty", "Amount"
			}
		));
		scrollPane.setViewportView(table);
		
		jtxtBarCode = new JTextField();
		jtxtBarCode.setFont(new Font("Libre Barcode 39", Font.PLAIN, 36));
		jtxtBarCode.setBounds(310, 370, 327, 50);
		frame.getContentPane().add(jtxtBarCode);
		jtxtBarCode.setColumns(10);
	}
}
