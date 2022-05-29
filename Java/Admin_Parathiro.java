import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Admin_Parathiro extends JFrame {

	private JPanel contentPane;
	private JTable Trapezi1;
	private JTable Trapezi2;
	private JTable Trapezi3;
	private JTable Trapezi4;
	private JTable Trapezi5;
	private JTable Trapezi6;

	void ResetPistopoihtika(String username) {
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query10 = "UPDATE admin SET num_pistopoihtikwn = 0 WHERE trapezi = '" + username + "'" ;
			PreparedStatement myStmt = con.prepareStatement(query10);
		    myStmt.execute();
		}
		catch(Exception Ex1) {
			System.out.println("Lathos");
		}
	}
	
	void ResetEkremeiParaggelia(String username) {
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query10 = " UPDATE admin SET paragelia='FALSE' WHERE trapezi='" + username + "'";
			PreparedStatement myStmt = con.prepareStatement(query10);
		    myStmt.execute();
		    String query11 = "DELETE from orders WHERE o_username='" + username + "'";
		    PreparedStatement myStmt2 = con.prepareStatement(query11);
		    myStmt2.execute();
		
		}
		catch(Exception Ex2) {
			System.out.println("Lathos");
		}
	}

	void SetPlhrwmh(String username) {
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query10 = " UPDATE admin SET plhrwmh='TRUE' WHERE trapezi='" + username + "'";
			PreparedStatement myStmt = con.prepareStatement(query10);
		    myStmt.execute();
		    String query11 = "UPDATE amount SET a_price = 0 WHERE a_username = '" + username + "'";
		    PreparedStatement myStmt2 = con.prepareStatement(query11);
		    myStmt2.execute();
		}
		catch(Exception Ex3) {
			System.out.println("Lathos");
		}
	}
	
	void ResetPlhrwmh(String username) {
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query10 = " UPDATE admin SET plhrwmh='FALSE' WHERE trapezi='" + username + "'";
			PreparedStatement myStmt = con.prepareStatement(query10);
		    myStmt.execute();
		    String query11 = "UPDATE amount SET a_price = 0 WHERE a_username = '" + username + "'";
		    PreparedStatement myStmt2 = con.prepareStatement(query11);
		    myStmt2.execute();
		}
		catch(Exception Ex3) {
			System.out.println("Lathos");
		}
	}
	
	void ResetBoh8eia(String username){
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query10 = " UPDATE admin SET boh8eia_serbitorou='FALSE' WHERE trapezi='" + username + "'";
			PreparedStatement myStmt = con.prepareStatement(query10);
		    myStmt.execute();
		}
		catch(Exception Ex4) {
			System.out.println("Lathos");
		}
	}
	
	public Admin_Parathiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1064, 817);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(113, 68, 728, 43);
		contentPane.add(scrollPane);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 1' "; 
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			
		Trapezi1 = new JTable();
		Trapezi1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(Trapezi1);
		Trapezi1.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex1){
			System.out.println("LATHOS");
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(113, 189, 728, 43);
		contentPane.add(scrollPane_1);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query2 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 2' "; 
			PreparedStatement myStmt = con.prepareStatement(query2);
			ResultSet rs = myStmt.executeQuery();
		
		Trapezi2 = new JTable();
		Trapezi2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(Trapezi2);
		Trapezi2.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex2){
			System.out.println("LATHOS");
		}
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(113, 307, 728, 43);
		contentPane.add(scrollPane_2);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query3 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 3' "; 
			PreparedStatement myStmt = con.prepareStatement(query3);
			ResultSet rs = myStmt.executeQuery();
		
		Trapezi3 = new JTable();
		Trapezi3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_2.setViewportView(Trapezi3);
		Trapezi3.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex3){
			System.out.println("LATHOS");
		}
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(113, 428, 728, 43);
		contentPane.add(scrollPane_3);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query4 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 4' "; 
			PreparedStatement myStmt = con.prepareStatement(query4);
			ResultSet rs = myStmt.executeQuery();
		
		Trapezi4 = new JTable();
		Trapezi4.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_3.setViewportView(Trapezi4);
		Trapezi4.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex4){
			System.out.println("LATHOS");
		}
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(113, 546, 728, 43);
		contentPane.add(scrollPane_4);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query5 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 5' "; 
			PreparedStatement myStmt = con.prepareStatement(query5);
			ResultSet rs = myStmt.executeQuery();
			
		Trapezi5 = new JTable();
		Trapezi5.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_4.setViewportView(Trapezi5);
		Trapezi5.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex5){
			System.out.println("LATHOS");
		}
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(113, 667, 728, 43);
		contentPane.add(scrollPane_5);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query6 = "Select num_pistopoihtikwn,paragelia ,plhrwmh,boh8eia_serbitorou from admin where trapezi='trapezi 6' "; 
			PreparedStatement myStmt = con.prepareStatement(query6);
			ResultSet rs = myStmt.executeQuery();
		
		Trapezi6 = new JTable();
		Trapezi6.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_5.setViewportView(Trapezi6);
		Trapezi6.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception Ex6){
			System.out.println("LATHOS");
		}
		
		JLabel lblNewLabel = new JLabel("Αριθμός Πιστοποιητικών");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(113, 43, 170, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Εκρεμεί Παραγγελία");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(297, 43, 170, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Πληρωμή");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(477, 43, 170, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Βοήθεια Σερβιτόρου");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(660, 43, 170, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("ΤΡΑΠΕΖΙ 1");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 44, 79, 72);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ΤΡΑΠΕΖΙ 2");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 165, 79, 72);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("ΤΡΑΠΕΖΙ 3");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(10, 283, 79, 72);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ΤΡΑΠΕΖΙ 4");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(10, 404, 79, 72);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("ΤΡΑΠΕΖΙ 5");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(10, 522, 79, 72);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("ΤΡΑΠΕΖΙ 6");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(10, 643, 79, 72);
		contentPane.add(lblNewLabel_3_1_2);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 1";
				ResetPistopoihtika(tr1);
			}
		});
		b1.setBounds(189, 122, 13, 12);
		contentPane.add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 1";
				ResetEkremeiParaggelia(tr1);
			}
		});
		b2.setBounds(381, 122, 13, 12);
		contentPane.add(b2);
		
		JButton b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 1";
				ResetPlhrwmh(tr1);
			}
		});
		b3.setBounds(558, 122, 13, 12);
		contentPane.add(b3);
		
		JButton b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 1";
				ResetBoh8eia(tr1);
			}
		});
		b4.setBounds(745, 122, 13, 12);
		contentPane.add(b4);
		
		JButton b5 = new JButton("Δες την Παραγγελία");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 1");
				pp1.setVisible(true);
				dispose();
			}
		});
		b5.setBounds(317, 145, 147, 23);
		contentPane.add(b5);
		
		JButton b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 2";
				ResetPistopoihtika(tr1);
			}
		});
		b6.setBounds(189, 243, 13, 12);
		contentPane.add(b6);
		
		JButton b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 2";
				ResetEkremeiParaggelia(tr1);
			}
		});
		b7.setBounds(381, 243, 13, 12);
		contentPane.add(b7);
		
		JButton b10 = new JButton("Δες την Παραγγελία");
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 2");
				pp1.setVisible(true);
				dispose();
			}
		});
		b10.setBounds(317, 266, 147, 23);
		contentPane.add(b10);
		
		JButton b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 2";
				ResetPlhrwmh(tr1);
			}
		});
		b8.setBounds(558, 243, 13, 12);
		contentPane.add(b8);
		
		JButton b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 2";
				ResetBoh8eia(tr1);
			}
		});
		b9.setBounds(745, 243, 13, 12);
		contentPane.add(b9);
		
		JButton b11 = new JButton("");
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 3";
				ResetPistopoihtika(tr1);
			}
		});
		b11.setBounds(189, 361, 13, 12);
		contentPane.add(b11);
		
		JButton b12 = new JButton("");
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 3";
				ResetEkremeiParaggelia(tr1);
			}
		});
		b12.setBounds(381, 361, 13, 12);
		contentPane.add(b12);
		
		JButton b16 = new JButton("Δες την Παραγγελία");
		b16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 3");
				pp1.setVisible(true);
				dispose();
			}
		});
		b16.setBounds(317, 384, 147, 23);
		contentPane.add(b16);
		
		JButton b13 = new JButton("");
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 3";
				ResetPlhrwmh(tr1);
			}
		});
		b13.setBounds(558, 361, 13, 12);
		contentPane.add(b13);
		
		JButton b14 = new JButton("");
		b14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 3";
				ResetBoh8eia(tr1);
			}
		});
		b14.setBounds(745, 361, 13, 12);
		contentPane.add(b14);
		
		JButton b17 = new JButton("");
		b17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 4";
				ResetPistopoihtika(tr1);
			}
		});
		b17.setBounds(189, 482, 13, 12);
		contentPane.add(b17);
		
		JButton b18 = new JButton("");
		b18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 4";
				ResetEkremeiParaggelia(tr1);
			}
		});
		b18.setBounds(381, 482, 13, 12);
		contentPane.add(b18);
		
		JButton b21 = new JButton("Δες την Παραγγελία");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 4");
				pp1.setVisible(true);
				dispose();
			}
		});
		b21.setBounds(317, 505, 147, 23);
		contentPane.add(b21);
		
		JButton b19 = new JButton("");
		b19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 4";
				ResetPlhrwmh(tr1);
			}
		});
		b19.setBounds(558, 482, 13, 12);
		contentPane.add(b19);
		
		JButton b20 = new JButton("");
		b20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 4";
				ResetBoh8eia(tr1);
			}
		});
		b20.setBounds(745, 482, 13, 12);
		contentPane.add(b20);
		
		JButton b22 = new JButton("");
		b22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 5";
				ResetPistopoihtika(tr1);
			}
		});
		b22.setBounds(189, 600, 13, 12);
		contentPane.add(b22);
		
		JButton b23 = new JButton("");
		b23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String tr1 = "trapezi 5";
					ResetEkremeiParaggelia(tr1);
			}
		});
		b23.setBounds(381, 600, 13, 12);
		contentPane.add(b23);
		
		JButton b26 = new JButton("Δες την Παραγγελία");
		b26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 5");
				pp1.setVisible(true);
				dispose();
			}
		});
		b26.setBounds(317, 623, 147, 23);
		contentPane.add(b26);
		
		JButton b24 = new JButton("");
		b24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 5";
				ResetPlhrwmh(tr1);
			}
		});
		b24.setBounds(558, 600, 13, 12);
		contentPane.add(b24);
		
		JButton b25 = new JButton("");
		b25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 5";
				ResetBoh8eia(tr1);
			}
		});
		b25.setBounds(745, 600, 13, 12);
		contentPane.add(b25);
		
		JButton b27 = new JButton("");
		b27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 6";
				ResetPistopoihtika(tr1);
			}
		});
		b27.setBounds(189, 721, 13, 12);
		contentPane.add(b27);
		
		JButton b28 = new JButton("");
		b28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 6";
				ResetEkremeiParaggelia(tr1);
			}
		});
		b28.setBounds(381, 721, 13, 12);
		contentPane.add(b28);
		
		JButton b31 = new JButton("Δες την Παραγγελία");
		b31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Paraggelia_Parathiro pp1 = new Paraggelia_Parathiro("trapezi 6");
			pp1.setVisible(true);
			dispose();
			}
		});
		b31.setBounds(317, 744, 147, 23);
		contentPane.add(b31);
		
		JButton b29 = new JButton("");
		b29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 6";
				ResetPlhrwmh(tr1);
			}
		});
		b29.setBounds(558, 721, 13, 12);
		contentPane.add(b29);
		
		JButton b30 = new JButton("");
		b30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 6";
				ResetBoh8eia(tr1);
			}
		});
		b30.setBounds(745, 721, 13, 12);
		contentPane.add(b30);
		
		JLabel lblReset = new JLabel("RESET");
		lblReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblReset.setBounds(905, 43, 69, 14);
		contentPane.add(lblReset);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(893, 88, 69, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(893, 209, 69, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("OK");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(893, 327, 69, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("OK");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_1.setBounds(893, 448, 69, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("OK");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_2.setBounds(893, 566, 69, 23);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_2_1 = new JButton("OK");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_2_1.setBounds(893, 687, 69, 23);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton b5_1 = new JButton("Έγινε πληρωμή!");
		b5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 1";
				SetPlhrwmh(tr1);
				
			}
		});
		b5_1.setBounds(500, 145, 147, 23);
		contentPane.add(b5_1);
		
		JButton b5_2 = new JButton("Έγινε πληρωμή!");
		b5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 2";
				SetPlhrwmh(tr1);
			}
		});
		b5_2.setBounds(500, 266, 147, 23);
		contentPane.add(b5_2);
		
		JButton b5_3 = new JButton("Έγινε πληρωμή!");
		b5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 3";
				SetPlhrwmh(tr1);
			}
		});
		b5_3.setBounds(500, 384, 147, 23);
		contentPane.add(b5_3);
		
		JButton b5_4 = new JButton("Έγινε πληρωμή!");
		b5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 4";
				SetPlhrwmh(tr1);
			}
		});
		b5_4.setBounds(500, 505, 147, 23);
		contentPane.add(b5_4);
		
		JButton b5_5 = new JButton("Έγινε πληρωμή!");
		b5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 5";
				SetPlhrwmh(tr1);
			}
		});
		b5_5.setBounds(500, 623, 147, 23);
		contentPane.add(b5_5);
		
		JButton b5_6 = new JButton("Έγινε πληρωμή!");
		b5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tr1 = "trapezi 6";
				SetPlhrwmh(tr1);
			}
		});
		b5_6.setBounds(500, 744, 147, 23);
		contentPane.add(b5_6);
		
		JButton btnNewButton_2_2_1_1 = new JButton("Refresh");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro AP = new Admin_Parathiro();
				AP.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2_2_1_1.setBounds(867, 744, 120, 23);
		contentPane.add(btnNewButton_2_2_1_1);
	}
}
