import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class Plirwmh_Karta extends JFrame {

	private JPanel contentPane;
	private JTable SynolikoPoso;
	private JTextField Tip;

	public Plirwmh_Karta(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(381, 11, 501, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Το συνολικό ποσό είναι :");
		lblNewLabel_1.setBounds(213, 167, 151, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(361, 158, 93, 45);
		contentPane.add(scrollPane);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select amount.a_price from amount WHERE a_username = '" + username + "'"; 
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			
		
		SynolikoPoso = new JTable();
		SynolikoPoso.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"New column"
			}
		));
		scrollPane.setViewportView(SynolikoPoso);
		SynolikoPoso.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e) {
			System.out.println("Lathos");
		}
		JLabel lblNewLabel_1_1 = new JLabel("Προσθέστε tip ( Προεραιτικό) : ");
		lblNewLabel_1_1.setBounds(213, 257, 151, 14);
		contentPane.add(lblNewLabel_1_1);
		
		Tip = new JTextField();
		Tip.setBounds(381, 254, 73, 20);
		contentPane.add(Tip);
		Tip.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	try {
				Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
				String query1 = " UPDATE amount SET a_price=a_price + '" + Tip.getText() + "' WHERE a_username='" + username + "'";
				PreparedStatement myStmt = con.prepareStatement(query1);
			    myStmt.execute();
			}
			catch(Exception Ex1) {
				System.out.println("Lathos");
			}
			Plirwmh_Karta pk1 = new Plirwmh_Karta(username);
			pk1.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(515, 253, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Επιτυχημένη πληρωμή!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					String query1 = " UPDATE admin SET plhrwmh='TRUE' WHERE trapezi='" + username + "'";
					PreparedStatement myStmt = con.prepareStatement(query1);
				    myStmt.execute();
				    String query2 = " UPDATE amount SET a_price='0' WHERE a_username='" + username + "'";
					PreparedStatement myStmt1 = con.prepareStatement(query2);
				    myStmt1.execute();
				}
				catch(Exception Ex1) {
					System.out.println("Lathos");
				}
				Epityxhmenh_Plirwmh ep1 = new Epityxhmenh_Plirwmh(username);
				ep1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(171, 396, 193, 94);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Αποτυχημένη πληρωμή!");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Apotyxhmenh_Plirwmh ap1 = new Apotyxhmenh_Plirwmh(username);
				ap1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(495, 396, 193, 94);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Πλησιάστε την κάρτα σας στην οθόνη για να πραγματοποιήσετε την πληρωμή ανέπαφα");
		lblNewLabel_2.setBounds(248, 343, 419, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(324, 539, 231, 63);
		contentPane.add(btnNewButton_2);
	}
}
