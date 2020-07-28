package pe.joedayz;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class IconMain {


	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon("images/java-hulk.jpg");
		JLabel label = new JLabel(icon);

		JFrame frame = new JFrame("JLabel with Image Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,900);
		frame.getContentPane().add(label);
		frame.setVisible(true);
	}
}
