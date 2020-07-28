package pe.joedayz.layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {

		JFrame frame = new JFrame("BorderLayout Demo");
		JButton btn1 = new JButton("Button 1 (PAGE_START)");
		JButton btn2 = new JButton("Button 2 (CENTER)");
		JButton btn3 = new JButton("Button 3 (LINE_START)");
		JButton btn4 = new JButton("Button 4 (PAGE_END)");
		JButton btn5 = new JButton("Button 5 (LINE_END)");

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(btn1, BorderLayout.PAGE_START);
		panel.add(btn2, BorderLayout.CENTER);
		panel.add(btn3, BorderLayout.LINE_START);
		panel.add(btn4, BorderLayout.PAGE_END);
		panel.add(btn5, BorderLayout.LINE_END);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,200);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
    }
}
