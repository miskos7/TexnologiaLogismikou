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

public class Boh8eia_Parathiro extends JFrame {

	private JPanel contentPane;


	public Boh8eia_Parathiro(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(username);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(360, 26, 501, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ένας σερβιτόρος θα είναι σύντομα κοντά σας για να σας εξυπηρετήσει!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(143, 271, 541, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(272, 333, 250, 73);
		contentPane.add(btnNewButton);
	}

}
