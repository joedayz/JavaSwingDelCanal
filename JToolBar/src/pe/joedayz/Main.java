package pe.joedayz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Main {

	public static void main(String[] args) {

		final JFrame frame = new JFrame("JToolBar Demo");
		JToolBar toolbar = new JToolBar("Applications");

		JButton btnCalendar = new JButton(new ImageIcon("images/Calendar.png"));
		btnCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Calendar clicked");
			}
		});

		JButton btnClock = new JButton(new ImageIcon("images/Clock.png"));
		btnClock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Clock clicked");
			}
		});

		JButton btnContacts = new JButton(new ImageIcon("images/Contacts.png"));
		btnContacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Contact clicked");
			}
		});

		JButton btnMail = new JButton(new ImageIcon("images/Mail.png"));
		btnMail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Mail clicked");
			}
		});

		JButton btnMessages = new JButton(new ImageIcon("images/Messages.png"));
		btnMessages.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Messages clicked");
			}
		});

		JButton btnPhone = new JButton(new ImageIcon("images/Phone.png"));
		btnPhone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Phone clicked");
			}
		});

		toolbar.add(btnCalendar);
		toolbar.add(btnClock);
		toolbar.add(btnContacts);
		toolbar.add(btnMail);
		toolbar.add(btnMessages);
		toolbar.add(btnPhone);

		frame.setLayout(new BorderLayout());
		frame.getContentPane().add(toolbar, BorderLayout.PAGE_START);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(500, 200);
		frame.setVisible(true);

	}
}
