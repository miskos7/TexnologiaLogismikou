import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Log extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;
	private JTextField username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		password = new JPasswordField();
		password.setBounds(274, 268, 154, 31);
		contentPane.add(password);
		
		username = new JTextField();
		username.setBounds(274, 166, 154, 31);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(305, 132, 101, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_coffee", "root", "Omgkai3lol!");  
					
					PreparedStatement myStmt = con.prepareStatement("Select * FROM user WHERE username='" + username.getText() + "' AND password='" + password.getText() +"'"); 
					
					String currentUsername = username.getText(); 
					
					ResultSet myRs = myStmt.executeQuery();
					
					System.out.println(username.getText() + "           " + password.getText());  
					
					while(myRs.next() ) { 
						if ( username.getText().equals("admin")) {
							Admin_Parathiro AP = new Admin_Parathiro();
							AP.setVisible(true);
							System.out.println("eimai admin");
						}
						
						else {
							Arxikh_Trapeziou AE = new Arxikh_Trapeziou(username.getText()); 
							AE.setVisible(true);
							System.out.println("eimai trapezi");
							}
						}
					
					dispose();
					
				}
				catch(Exception ex) { 
					System.out.println("Couldnt connect to database");
					
				}
				
			}
		});
		btnNewButton.setBounds(305, 322, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(305, 234, 247, 23);
		contentPane.add(lblPassword);
	}
}
