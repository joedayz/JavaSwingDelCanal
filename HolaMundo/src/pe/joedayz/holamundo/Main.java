package pe.joedayz.holamundo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {



    public static void main(String[] args) {
		createAndShowGUI();
    }

	private static void createAndShowGUI() {

		//Create and set up the window.
		JFrame frame = new JFrame("HelloWorldSwing");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add the ubiquitous "Hello World" label.
		JLabel label = new JLabel("Hello World");
		frame.getContentPane().add(label);

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}
