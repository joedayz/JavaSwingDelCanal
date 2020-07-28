package pe.joedayz.layouts;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame {
	private JPanel panelMain;

	private JButton btnOk;

	private JButton btnCancel;

	public MainView(){
		panelMain.add(btnOk, BorderLayout.LINE_START);
		panelMain.add(btnCancel,BorderLayout.LINE_END);

		setTitle("Component Orientation Demo");
		getContentPane().add(panelMain);
		setSize(400, 300);
	}

	public static void main(String[] args) {
		MainView mainView = new MainView();
		mainView.setVisible(true);
	}
}
