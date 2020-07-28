package pe.joedayz;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {

		JLabel label = new JLabel("Java Swing Label Demo",JLabel.CENTER);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.getContentPane().add(label);
		frame.setVisible(true);
    }
}
