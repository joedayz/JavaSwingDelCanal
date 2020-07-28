package pe.joedayz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		final JFrame frame = new JFrame("JDialog Demo");
		final JButton btnLogin = new JButton("Click to login");

		btnLogin.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						LoginDialog loginDlg = new LoginDialog(frame);
						loginDlg.setVisible(true);
						// if logon successfully
						if(loginDlg.isSucceeded()){
							btnLogin.setText("Hi " + loginDlg.getUsername() + "!");
						}
					}
				});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().add(btnLogin);
		frame.setVisible(true);
	}
}
