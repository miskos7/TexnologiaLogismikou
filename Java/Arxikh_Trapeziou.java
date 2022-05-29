import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Arxikh_Trapeziou extends JFrame {

	private JPanel contentPane;
	


	public Arxikh_Trapeziou(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 722);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(373, 11, 501, 45);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u03A0\u03BB\u03B7\u03C1\u03C9\u03BC\u03AE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Parathiro_Plirwmhs p1 = new Parathiro_Plirwmhs(username);
				p1.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(93, 397, 199, 117);
		contentPane.add(btnNewButton);
		
		JButton btnMenu = new JButton("\u039C\u03B5\u03BD\u03BF\u03CD");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m1 = new Menu(username); 
				m1.setVisible(true);
				dispose();
				
			}
		});
		btnMenu.setBounds(93, 141, 199, 117);
		contentPane.add(btnMenu);
		
		JButton btnNewButton_1_1 = new JButton("\u03A3\u03BA\u03B1\u03BD\u03AC\u03C1\u03B9\u03C3\u03BC\u03B1 \u03A0\u03B9\u03C3\u03C4\u03BF\u03C0\u03BF\u03B9\u03B7\u03C4\u03B9\u03BA\u03BF\u03CD");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skanarisma_Parathiro sp1 = new Skanarisma_Parathiro(username);
				sp1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(544, 141, 199, 117);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1 \u0391\u03C0\u03CC \u03C3\u03B5\u03C1\u03B2\u03B9\u03C4\u03CC\u03C1\u03BF");
		btnNewButton_1_2.addActionListener(new ActionListener() {
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
		btnNewButton_1_2.setBounds(544, 397, 199, 117);
		contentPane.add(btnNewButton_1_2);
	}

}
