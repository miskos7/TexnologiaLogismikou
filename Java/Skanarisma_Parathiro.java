import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class Skanarisma_Parathiro extends JFrame {

	private JPanel contentPane;


	public Skanarisma_Parathiro(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(324, 11, 501, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(251, 352, 250, 73);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Παρακαλώ σκανάρετε το πιστοποιητικό σας εδώ!");
		lblNewLabel_1.setBounds(251, 109, 283, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Έγκυρο πιστοποιητικό");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!"); 
					
					CallableStatement myStmt1 = con.prepareCall("call numofpistopoihtika(?)");
					
					myStmt1.setString(1, username);
					
					System.out.println("Calling procedure...");
					myStmt1.execute();
					System.out.println("Called procedure...");
					
				}
				catch(Exception Ex1) {
					System.out.println("Lathos");
				}
				
				Egkyro_Pistopoihtiko ep1 = new Egkyro_Pistopoihtiko(username);
				ep1.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(138, 244, 171, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Άκυρο πιστοποιητικό");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Akyro_Pistopoihtiko Ak = new Akyro_Pistopoihtiko(username);
				Ak.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(445, 244, 188, 23);
		contentPane.add(btnNewButton_1_1);
	}
}
