import java.awt.BorderLayout;
import net.proteanit.sql.*;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Menu extends JFrame {

	private JPanel contentPane;
	private JTable KafedesTable;
	private JTable FaghtaMenu;
	private JTable LoipaMenu;
	private JTextField Posothta1;
	private JTextField Posothta2;
	private JTextField Posothta3;
	private JTextField Posothta4;
	private JTextField Posothta7;
	private JTextField Posothta6;
	private JTextField Posothta5;
	private JTextField Sxolia1;
	private JTextField Sxolia2;
	private JTextField Sxolia3;
	private JTextField Sxolia4;
	private JTextField Sxolia5;
	private JTextField Sxolia6;
	private JTextField Sxolia7;
	private JTextField Posothta8;
	private JTextField Posothta9;
	private JTextField Posothta10;
	private JTextField Sxolia10;
	private JTextField Sxolia9;
	private JTextField Sxolia8;
	private JTextField Posothta17;
	private JTextField Sxolia17;
	private JTextField Sxolia16;
	private JTextField Posothta16;
	private JTextField Posothta15;
	private JTextField Posothta14;
	private JTextField Posothta13;
	private JTextField Posothta12;
	private JTextField Posothta11;
	private JTextField Sxolia11;
	private JTextField Sxolia12;
	private JTextField Sxolia13;
	private JTextField Sxolia14;
	private JTextField Sxolia15;
	private JTextField Posothta19;
	private JTextField Posothta18;
	private JTextField Sxolia18;
	private JTextField Sxolia19;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b7;
	private JButton b6;
	private JButton b5;
	private JButton b10;
	private JButton b9;
	private JButton b8;
	private JButton b17;
	private JButton b16;
	private JButton b15;
	private JButton b14;
	private JButton b13;
	private JButton b12;
	private JButton b11;
	private JButton b19;
	private JButton b18;
	private JButton btnNewButton_19;
	private JButton btnNewButton_20;

	int NumOfItems(String username) {
		int number = 0;
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = " SELECT COUNT(*) FROM orders WHERE o_username='" + username + "'";
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
			number = rs.getInt(1);
				}
			
			}
			
		catch(Exception e) {
			System.out.println("Lathos st resultset");
		}
		return number;
	}
	
	public Menu(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 799);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 139, 391, 188);
		contentPane.add(scrollPane);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select * from menu_kafes";  
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			
			
			
		KafedesTable = new JTable();
		KafedesTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Product", "Price"
			}
		));
		scrollPane.setViewportView(KafedesTable);
		KafedesTable.setModel(DbUtils.resultSetToTableModel(rs));
		
		}
		catch(Exception Ex1) {  
			System.out.println("LATHOS");
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 350, 391, 188);
		contentPane.add(scrollPane_1);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select * from menu_faghta"; 
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
		FaghtaMenu = new JTable();
		FaghtaMenu.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_1.setViewportView(FaghtaMenu);
		FaghtaMenu.setModel(DbUtils.resultSetToTableModel(rs));
		}
		
		catch(Exception Ex2) {
			System.out.println("LATHOS");
		}
	
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 561, 391, 188);
		contentPane.add(scrollPane_2);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select * from menu_loipa";
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
		
		
		LoipaMenu = new JTable();
		LoipaMenu.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		scrollPane_2.setViewportView(LoipaMenu);
		LoipaMenu.setModel(DbUtils.resultSetToTableModel(rs));
		
		Posothta1 = new JTextField();
		Posothta1.setBounds(411, 160, 43, 15);
		contentPane.add(Posothta1);
		Posothta1.setColumns(10);
		
		Posothta2 = new JTextField();
		Posothta2.setColumns(10);
		Posothta2.setBounds(411, 177, 43, 15);
		contentPane.add(Posothta2);
		
		Posothta3 = new JTextField();
		Posothta3.setColumns(10);
		Posothta3.setBounds(411, 194, 43, 15);
		contentPane.add(Posothta3);
		
		Posothta4 = new JTextField();
		Posothta4.setColumns(10);
		Posothta4.setBounds(411, 211, 43, 15);
		contentPane.add(Posothta4);
		
		Posothta7 = new JTextField();
		Posothta7.setColumns(10);
		Posothta7.setBounds(411, 261, 43, 15);
		contentPane.add(Posothta7);
		
		Posothta6 = new JTextField();
		Posothta6.setColumns(10);
		Posothta6.setBounds(411, 244, 43, 15);
		contentPane.add(Posothta6);
		
		Posothta5 = new JTextField();
		Posothta5.setColumns(10);
		Posothta5.setBounds(411, 227, 43, 15);
		contentPane.add(Posothta5);
		
		Sxolia1 = new JTextField();
		Sxolia1.setColumns(10);
		Sxolia1.setBounds(476, 160, 168, 15);
		contentPane.add(Sxolia1);
		
		Sxolia2 = new JTextField();
		Sxolia2.setColumns(10);
		Sxolia2.setBounds(476, 177, 168, 15);
		contentPane.add(Sxolia2);
		
		Sxolia3 = new JTextField();
		Sxolia3.setColumns(10);
		Sxolia3.setBounds(476, 194, 168, 15);
		contentPane.add(Sxolia3);
		
		Sxolia4 = new JTextField();
		Sxolia4.setColumns(10);
		Sxolia4.setBounds(476, 211, 168, 15);
		contentPane.add(Sxolia4);
		
		Sxolia5 = new JTextField();
		Sxolia5.setColumns(10);
		Sxolia5.setBounds(476, 227, 168, 15);
		contentPane.add(Sxolia5);
		
		Sxolia6 = new JTextField();
		Sxolia6.setColumns(10);
		Sxolia6.setBounds(476, 244, 168, 15);
		contentPane.add(Sxolia6);
		
		Sxolia7 = new JTextField();
		Sxolia7.setColumns(10);
		Sxolia7.setBounds(476, 261, 168, 15);
		contentPane.add(Sxolia7);
		
		Posothta8 = new JTextField();
		Posothta8.setColumns(10);
		Posothta8.setBounds(407, 372, 43, 15);
		contentPane.add(Posothta8);
		
		Posothta9 = new JTextField();
		Posothta9.setColumns(10);
		Posothta9.setBounds(407, 389, 43, 15);
		contentPane.add(Posothta9);
		
		Posothta10 = new JTextField();
		Posothta10.setColumns(10);
		Posothta10.setBounds(407, 406, 43, 15);
		contentPane.add(Posothta10);
		
		Sxolia10 = new JTextField();
		Sxolia10.setColumns(10);
		Sxolia10.setBounds(472, 406, 168, 15);
		contentPane.add(Sxolia10);
		
		Sxolia9 = new JTextField();
		Sxolia9.setColumns(10);
		Sxolia9.setBounds(472, 389, 168, 15);
		contentPane.add(Sxolia9);
		
		Sxolia8 = new JTextField();
		Sxolia8.setColumns(10);
		Sxolia8.setBounds(472, 372, 168, 15);
		contentPane.add(Sxolia8);
		
		Posothta17 = new JTextField();
		Posothta17.setColumns(10);
		Posothta17.setBounds(407, 683, 43, 15);
		contentPane.add(Posothta17);
		
		Sxolia17 = new JTextField();
		Sxolia17.setColumns(10);
		Sxolia17.setBounds(472, 683, 168, 15);
		contentPane.add(Sxolia17);
		
		Sxolia16 = new JTextField();
		Sxolia16.setColumns(10);
		Sxolia16.setBounds(472, 666, 168, 15);
		contentPane.add(Sxolia16);
		
		Posothta16 = new JTextField();
		Posothta16.setColumns(10);
		Posothta16.setBounds(407, 666, 43, 15);
		contentPane.add(Posothta16);
		
		Posothta15 = new JTextField();
		Posothta15.setColumns(10);
		Posothta15.setBounds(407, 649, 43, 15);
		contentPane.add(Posothta15);
		
		Posothta14 = new JTextField();
		Posothta14.setColumns(10);
		Posothta14.setBounds(407, 633, 43, 15);
		contentPane.add(Posothta14);
		
		Posothta13 = new JTextField();
		Posothta13.setColumns(10);
		Posothta13.setBounds(407, 616, 43, 15);
		contentPane.add(Posothta13);
		
		Posothta12 = new JTextField();
		Posothta12.setColumns(10);
		Posothta12.setBounds(407, 599, 43, 15);
		contentPane.add(Posothta12);
		
		Posothta11 = new JTextField();
		Posothta11.setColumns(10);
		Posothta11.setBounds(407, 582, 43, 15);
		contentPane.add(Posothta11);
		
		Sxolia11 = new JTextField();
		Sxolia11.setColumns(10);
		Sxolia11.setBounds(472, 582, 168, 15);
		contentPane.add(Sxolia11);
		
		Sxolia12 = new JTextField();
		Sxolia12.setColumns(10);
		Sxolia12.setBounds(472, 599, 168, 15);
		contentPane.add(Sxolia12);
		
		Sxolia13 = new JTextField();
		Sxolia13.setColumns(10);
		Sxolia13.setBounds(472, 616, 168, 15);
		contentPane.add(Sxolia13);
		
		Sxolia14 = new JTextField();
		Sxolia14.setColumns(10);
		Sxolia14.setBounds(472, 633, 168, 15);
		contentPane.add(Sxolia14);
		
		Sxolia15 = new JTextField();
		Sxolia15.setColumns(10);
		Sxolia15.setBounds(472, 649, 168, 15);
		contentPane.add(Sxolia15);
		
		Posothta19 = new JTextField();
		Posothta19.setColumns(10);
		Posothta19.setBounds(407, 717, 43, 15);
		contentPane.add(Posothta19);
		
		Posothta18 = new JTextField();
		Posothta18.setColumns(10);
		Posothta18.setBounds(407, 700, 43, 15);
		contentPane.add(Posothta18);
		
		Sxolia18 = new JTextField();
		Sxolia18.setColumns(10);
		Sxolia18.setBounds(472, 700, 168, 15);
		contentPane.add(Sxolia18);
		
		Sxolia19 = new JTextField();
		Sxolia19.setColumns(10);
		Sxolia19.setBounds(472, 717, 168, 15);
		contentPane.add(Sxolia19);
		
		JLabel lblNewLabel = new JLabel("Posothta");
		lblNewLabel.setBounds(408, 118, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSxolia = new JLabel("Sxolia");
		lblSxolia.setBounds(526, 118, 46, 14);
		contentPane.add(lblSxolia);
		
		JLabel lblKafedes = new JLabel("Kafedes");
		lblKafedes.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKafedes.setBounds(185, 114, 104, 14);
		contentPane.add(lblKafedes);
		
		JLabel lblFaghta = new JLabel("Faghta");
		lblFaghta.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFaghta.setBounds(185, 325, 104, 25);
		contentPane.add(lblFaghta);
		
		JLabel lblKafedes_1_1 = new JLabel("Loipa");
		lblKafedes_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblKafedes_1_1.setBounds(185, 536, 104, 25);
		contentPane.add(lblKafedes_1_1);
		
		JLabel lblNewLabel_1 = new JLabel(username);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(367, 11, 501, 45);
		contentPane.add(lblNewLabel_1);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos1 = Posothta1.getText();
				String Sxol1 = Sxolia1.getText();
				String String1 = "Cappuccino";
				String pri= "3.5";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String1);
					myStmt1.setString(2, Sxol1);
					myStmt1.setString(3, Pos1);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b1.setBounds(654, 163, 13, 12);
		contentPane.add(b1);
		
		b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos2 = Posothta2.getText();
				String Sxol2 = Sxolia2.getText();
				String String2 = "Ellinikos Kafes";
				String pri= "2.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String2);
					myStmt1.setString(2, Sxol2);
					myStmt1.setString(3, Pos2);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
				
			
		});
		b2.setBounds(654, 180, 13, 12);
		contentPane.add(b2);
		
		b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos3 = Posothta3.getText();
				String Sxol3 = Sxolia3.getText();
				String String3 = "Espresso Diplos";
				String pri= "3.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String3);
					myStmt1.setString(2, Sxol3);
					myStmt1.setString(3, Pos3);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
				
			}
		});
		b3.setBounds(654, 197, 13, 12);
		contentPane.add(b3);
		
		b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos4 = Posothta4.getText();
				String Sxol4 = Sxolia4.getText();
				String String4 = "Espresso Monos";
				String pri= "2.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String4);
					myStmt1.setString(2, Sxol4);
					myStmt1.setString(3, Pos4);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b4.setBounds(654, 214, 13, 12);
		contentPane.add(b4);
		
		b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos7 = Posothta7.getText();
				String Sxol7 = Sxolia7.getText();
				String String7 = "Gallikos Kafes";
				String pri= "3.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String7);
					myStmt1.setString(2, Sxol7);
					myStmt1.setString(3, Pos7);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b7.setBounds(654, 264, 13, 12);
		contentPane.add(b7);
		
		b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos6 = Posothta6.getText();
				String Sxol6 = Sxolia6.getText();
				String String6 = "Freddo Espresso";
				String pri= "3.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String6);
					myStmt1.setString(2, Sxol6);
					myStmt1.setString(3, Pos6);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b6.setBounds(654, 247, 13, 12);
		contentPane.add(b6);
		
		b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos5 = Posothta5.getText();
				String Sxol5 = Sxolia5.getText();
				String String5 = "Freddo Cappuccino";
				String pri= "3.5";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String5);
					myStmt1.setString(2, Sxol5);
					myStmt1.setString(3, Pos5);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b5.setBounds(654, 230, 13, 12);
		contentPane.add(b5);
		
		b10 = new JButton("");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos10 = Posothta10.getText();
				String Sxol10 = Sxolia10.getText();
				String String10 = "Club Sandwich Fileto Kotopoulo";
				String pri= "6.5";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String10);
					myStmt1.setString(2, Sxol10);
					myStmt1.setString(3, Pos10);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b10.setBounds(654, 409, 13, 12);
		contentPane.add(b10);
		
		b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos9 = Posothta9.getText();
				String Sxol9 = Sxolia9.getText();
				String String9 = "Club Sandwich Aplo";
				String pri= "5.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String9);
					myStmt1.setString(2, Sxol9);
					myStmt1.setString(3, Pos9);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b9.setBounds(654, 392, 13, 12);
		contentPane.add(b9);
		
		b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos8 = Posothta8.getText();
				String Sxol8 = Sxolia8.getText();
				String String8 = "Bafla me 1 mpala pagwto";
				String pri= "5.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String8);
					myStmt1.setString(2, Sxol8);
					myStmt1.setString(3, Pos8);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b8.setBounds(654, 375, 13, 12);
		contentPane.add(b8);
		
		b17 = new JButton("");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos17 = Posothta17.getText();
				String Sxol17 = Sxolia17.getText();
				String String17 = "Fusikos Xumos Portokali ";
				String pri= "3.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String17);
					myStmt1.setString(2, Sxol17);
					myStmt1.setString(3, Pos17);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b17.setBounds(657, 686, 13, 12);
		contentPane.add(b17);
		
		b16 = new JButton("");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos16 = Posothta16.getText();
				String Sxol16 = Sxolia16.getText();
				String String16 = "Fanta Portokalada Xwris An8rakiko";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String16);
					myStmt1.setString(2, Sxol16);
					myStmt1.setString(3, Pos16);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b16.setBounds(657, 669, 13, 12);
		contentPane.add(b16);
		
		b15 = new JButton("");
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos15 = Posothta15.getText();
				String Sxol15 = Sxolia15.getText();
				String String15 = "Fanta Portokalada Me An8rakiko";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String15);
					myStmt1.setString(2, Sxol15);
					myStmt1.setString(3, Pos15);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b15.setBounds(657, 652, 13, 12);
		contentPane.add(b15);
		
		b14 = new JButton("");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos14 = Posothta14.getText();
				String Sxol14 = Sxolia14.getText();
				String String14 = "Fanta Lemonada";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String14);
					myStmt1.setString(2, Sxol14);
					myStmt1.setString(3, Pos14);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b14.setBounds(657, 636, 13, 12);
		contentPane.add(b14);
		
		b13 = new JButton("");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos13 = Posothta13.getText();
				String Sxol13 = Sxolia13.getText();
				String String13 = "Coca-Cola Zero";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String13);
					myStmt1.setString(2, Sxol13);
					myStmt1.setString(3, Pos13);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b13.setBounds(657, 619, 13, 12);
		contentPane.add(b13);
		
		b12 = new JButton("");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos12 = Posothta12.getText();
				String Sxol12 = Sxolia12.getText();
				String String12 = "Coca-Cola Light";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String12);
					myStmt1.setString(2, Sxol12);
					myStmt1.setString(3, Pos12);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b12.setBounds(657, 602, 13, 12);
		contentPane.add(b12);
		
		b11 = new JButton("");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos11 = Posothta11.getText();
				String Sxol11 = Sxolia11.getText();
				String String11 = "Coca-Cola";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String11);
					myStmt1.setString(2, Sxol11);
					myStmt1.setString(3, Pos11);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b11.setBounds(657, 585, 13, 12);
		contentPane.add(b11);
		
		b19 = new JButton("");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos19 = Posothta19.getText();
				String Sxol19 = Sxolia19.getText();
				String String19 = "Xumos Anameiktos";
				String pri= "3.0";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String19);
					myStmt1.setString(2, Sxol19);
					myStmt1.setString(3, Pos19);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b19.setBounds(657, 720, 13, 12);
		contentPane.add(b19);
		
		b18 = new JButton("");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Pos18 = Posothta18.getText();
				String Sxol18 = Sxolia18.getText();
				String String18 = "Sprite";
				String pri= "2.3";
				try {
					
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call insert_order(?,?,?,?,?)");
					
					myStmt1.setString(1, String18);
					myStmt1.setString(2, Sxol18);
					myStmt1.setString(3, Pos18);
					myStmt1.setString(4, pri);
					myStmt1.setString(5, username);
					
				
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
				}
				catch(Exception Ex5) {
					System.out.println("Lathos");
				}
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
			}
		});
		b18.setBounds(657, 704, 13, 12);
		contentPane.add(b18);
		
		btnNewButton_19 = new JButton("\u039F\u039B\u039F\u039A\u039B\u0397\u03A1\u03A9\u03A3\u0397 \u03A0\u0391\u03A1\u0391\u0393\u0393\u0395\u039B\u0399\u0391\u03A3");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(NumOfItems(username) > 0) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					String query1 = " UPDATE admin SET paragelia='TRUE' WHERE trapezi='" + username + "'";
					String query2 = "UPDATE admin SET plhrwmh = 'FALSE' WHERE trapezi='" + username + "'";
					PreparedStatement myStmt = con.prepareStatement(query1);
				    myStmt.execute();
				    PreparedStatement myStmt2 = con.prepareStatement(query2);
				    myStmt2.execute();
				}
				catch(Exception Ex1) {
					System.out.println("Lathos");
				}
				Oloklhrwsh_Paraggelias op1 = new Oloklhrwsh_Paraggelias(username); 
				op1.setVisible(true);
				dispose();
			}
			
			else {
				Error er1 = new Error(username);
				er1.setVisible(true);
				dispose();
			}
			}
		});
		btnNewButton_19.setBounds(718, 253, 175, 74);
		contentPane.add(btnNewButton_19);
		
		btnNewButton_20 = new JButton("\u0391\u03A1\u03A7\u0399\u039A\u0397 \u039F\u0398\u039F\u039D\u0397");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton_20.setBounds(718, 406, 175, 74);
		contentPane.add(btnNewButton_20);
		}
		catch(Exception ex3) {
			
		}
	}
}
