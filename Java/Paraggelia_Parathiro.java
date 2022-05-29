import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Paraggelia_Parathiro extends JFrame {

	private JPanel contentPane;
	private JTable Paraggelia;

	
	
	public Paraggelia_Parathiro(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(248, 159, 518, 230);
		contentPane.add(scrollPane);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select o_product , o_comments , o_quantity from orders where o_username ='" + username + "'"; 
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			
		
		Paraggelia = new JTable();
		Paraggelia.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(Paraggelia);
		Paraggelia.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch(Exception e) {
			System.out.println("Lathos");
		}
		JButton btnNewButton = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_Parathiro ap1 = new Admin_Parathiro();
				ap1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setBounds(408, 429, 231, 63);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(463, 33, 501, 45);
		contentPane.add(lblNewLabel);
	}
}
