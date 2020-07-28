package pe.joedayz;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CelsusConverterGUI extends JFrame {

	private JTextField txtCelsius;

	private JButton btnFarenheith;

	private JLabel lblFarenheith;

	private JPanel panelMain;

	private JLabel lblCelsius;

	public CelsusConverterGUI() {


			super("Converter");


			this.setContentPane(this.panelMain);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();


			btnFarenheith.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Parse degrees Celsius as a double and convert to Fahrenheit.
				int tempFahr = (int)((Double.parseDouble(txtCelsius.getText()))
						* 1.8 + 32);
				lblFarenheith.setText(tempFahr + " Fahrenheit");
			}
		});
	}


}
