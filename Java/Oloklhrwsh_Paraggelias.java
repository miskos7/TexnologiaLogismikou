import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Oloklhrwsh_Paraggelias extends JFrame {

	private JPanel contentPane;
	private JTable SynopsiTable;

	
	public Oloklhrwsh_Paraggelias(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 997, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(425, 11, 501, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0397 \u03A0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1 \u03C3\u03B1\u03C2 \u03BF\u03BB\u03BF\u03BA\u03BB\u03B7\u03C1\u03CE\u03B8\u03B7\u03BA\u03B5 \u03BC\u03B5 \u03B5\u03C0\u03B9\u03C4\u03C5\u03C7\u03AF\u03B1! \u0398\u03B1 \u03B5\u03AF\u03BD\u03B1\u03B9 \u03AD\u03C4\u03BF\u03B9\u03BC\u03B7 \u03C0\u03BF\u03BB\u03CD \u03C3\u03CD\u03BD\u03C4\u03BF\u03BC\u03B1!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(209, 67, 591, 166);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03C8\u03B7 \u03C4\u03B7\u03C2 \u03C0\u03B1\u03C1\u03B1\u03B3\u03B3\u03B5\u03BB\u03AF\u03B1\u03C2 \u03C3\u03B1\u03C2");
		lblNewLabel_2.setBounds(408, 257, 260, 14);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(302, 304, 366, 119);
		contentPane.add(scrollPane);
		try {
			Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
			String query1 = "Select o_product , o_comments , o_quantity from orders where o_username ='" + username + "'"; 
			PreparedStatement myStmt = con.prepareStatement(query1);
			ResultSet rs = myStmt.executeQuery();
			
		SynopsiTable = new JTable();
		SynopsiTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(SynopsiTable);
		SynopsiTable.setModel(DbUtils.resultSetToTableModel(rs));
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03B7\u03BD \u03B1\u03C1\u03C7\u03B9\u03BA\u03AE \u03BF\u03B8\u03CC\u03BD\u03B7!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(369, 476, 231, 63);
		contentPane.add(btnNewButton);
		}
		catch(Exception ex) {
			System.out.println("Lathos");
		}
	}
}
