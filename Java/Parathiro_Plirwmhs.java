import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Parathiro_Plirwmhs extends JFrame {

	private JPanel contentPane;

	public Parathiro_Plirwmhs(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Πληρωμή με κάρτα");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Plirwmh_Karta pk1 = new Plirwmh_Karta(username);
				pk1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(417, 180, 188, 105);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Πληρωμή με μετρητά");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					String query1 = " UPDATE admin SET boh8eia_serbitorou='TRUE' WHERE trapezi='" + username + "'";
					PreparedStatement myStmt = con.prepareStatement(query1);
				    myStmt.execute();
				}
				catch(Exception Ex1) {
					System.out.println("Lathos");
				}
				Boh8eia_Parathiro bp1 = new Boh8eia_Parathiro(username);
				bp1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(417, 407, 188, 105);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(781, 315, 231, 63);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(434, 11, 501, 45);
		contentPane.add(lblNewLabel);
	}

}
