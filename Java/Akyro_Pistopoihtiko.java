import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Akyro_Pistopoihtiko extends JFrame {

	private JPanel contentPane;


	public Akyro_Pistopoihtiko(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(326, 11, 501, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Το πιστοποιητικό δεν έγινε αποδεκτό!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(248, 186, 286, 83);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Προσπαθήστε ξανά!");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skanarisma_Parathiro S1 = new Skanarisma_Parathiro(username);
				S1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(280, 331, 181, 74);
		contentPane.add(btnNewButton_1);
	}

}
