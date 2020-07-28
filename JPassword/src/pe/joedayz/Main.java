package pe.joedayz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Main {

    public static void main(String[] args) {

		final JFrame frame = new JFrame("JPasswordField Demo");

		JLabel lblUser = new JLabel("User Name:");
		JTextField tfUser = new JTextField(20);
		lblUser.setLabelFor(tfUser);

		JLabel lblPassword = new JLabel("Password:");
		final JPasswordField pfPassword = new JPasswordField(20);
		lblPassword.setLabelFor(pfPassword);

		JButton btnGet = new JButton("Display Password");
		btnGet.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						String password = new String(pfPassword.getPassword());
						JOptionPane.showMessageDialog(frame,
								"Password is " + password);
					}
				});

		JButton btnLogin = new JButton("Login");

		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		panel.add(lblUser);
		panel.add(tfUser);
		panel.add(lblPassword);
		panel.add(pfPassword);
		panel.add(btnLogin);
		panel.add(btnGet);

		SpringUtilities.makeCompactGrid(panel,
				3, 2, //rows, cols
				6, 6, //initX, initY
				6, 6); //xPad, yPad

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 120);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
    }
}
