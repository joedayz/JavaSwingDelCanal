package pe.joedayz;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

    public static void main(String[] args) {

		final JFrame frame = new JFrame("JTextArea Demo");
		JTextArea ta = new JTextArea(10, 20);

		JScrollPane sp = new JScrollPane(ta);

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 220);
		frame.getContentPane().add(sp);

		frame.setVisible(true);
    }
}
