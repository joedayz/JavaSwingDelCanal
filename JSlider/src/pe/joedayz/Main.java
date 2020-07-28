package pe.joedayz;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Main {

    public static void main(String[] args) {

		final JFrame frame = new JFrame("JSlider Demo");

		// create a slider
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 40, 10);
		slider.setMinorTickSpacing(5);
		slider.setMajorTickSpacing(20);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels(10));

		//
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.getContentPane().add(slider);
		frame.setVisible(true);
    }
}
