import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Error extends JFrame {

	private JPanel contentPane;

	
	public Error(String username) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Δεν έχετε προσθέσει κάποιο αντικείμενο!");
		lblNewLabel.setBounds(298, 228, 281, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Επιστροφή στο μενού!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu m1 = new Menu(username);
				m1.setVisible(true);
				dispose();
			}
			
		});
		btnNewButton.setBounds(313, 298, 164, 74);
		contentPane.add(btnNewButton);
	}

}
