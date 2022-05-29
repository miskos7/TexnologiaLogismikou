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

public class Epityxhmenh_Plirwmh extends JFrame {

	private JPanel contentPane;


	public Epityxhmenh_Plirwmh(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 668);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Η πληρωμή έγινε επιτυχώς!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(371, 245, 360, 127);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Επιστροφή στην αρχική οθόνη!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arxikh_Trapeziou AX = new Arxikh_Trapeziou(username);
				AX.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(353, 441, 231, 63);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel(username);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(422, 11, 501, 45);
		contentPane.add(lblNewLabel_1);
	}

}
