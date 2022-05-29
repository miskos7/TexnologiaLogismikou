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
import javax.swing.JToggleButton;

public class Egkyro_Pistopoihtiko extends JFrame {

	private JPanel contentPane;


	public Egkyro_Pistopoihtiko(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setBounds(343, 11, 501, 45);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Το πιστοποιητικό έγινε αποδεκτό!");
		lblNewLabel_1.setBounds(276, 168, 264, 83);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton_1.setBounds(147, 354, 181, 74);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Σκανάρετε άλλο πιστοποιητικό");
		btnNewButton_1_1.setBounds(518, 354, 181, 74);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Skanarisma_Parathiro sp1 = new Skanarisma_Parathiro(username);
				sp1.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton_1_1);
	}
}
