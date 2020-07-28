package pe.joedayz;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
		final JFrame frame = new JFrame("JComboBox Demo");

		String[] colorList = {"RED",
				"GREEN",
				"BLUE",
				"CYAN",
				"DARK GRAY",
				"MAGENTA",
				"ORANGE",
				"PINK"};
		final JComboBox cbColor = new JComboBox(colorList);
		cbColor.addActionListener(
				new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,
								"Color Selected: " +
										cbColor.getSelectedItem().toString());
					}
				});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(cbColor);
		frame.setVisible(true);
    }
}
