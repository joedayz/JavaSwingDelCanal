package pe.joedayz;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Main {

    public static void main(String[] args) {

		final JFrame frame = new JFrame("JRadioButton Demo");

		// implement ItemListener interface
		class MyItemListener implements ItemListener {

			public void itemStateChanged(ItemEvent ev) {
				boolean selected = (ev.getStateChange() == ItemEvent.SELECTED);
				AbstractButton button = (AbstractButton) ev.getItemSelectable();
				String command = button.getActionCommand();
				// build message
				String state;
				if (selected) {
					state = "selected";
				} else {
					state = "unselected";
				}
				String message;
				if (command.equals("SWING")) {
					message = "The Swing option has been " + state;
				} else if (command.equals("AWT")) {
					message = "The AWT option has been " + state;
				} else {
					message = "The APPLET option has been " + state;
				}
				// show dialog
				JOptionPane.showMessageDialog(frame, message);
			}
		}

		// creates radio button and set corresponding action
		// commands
		JRadioButton rdbApplet = new JRadioButton("Java Applet");
		rdbApplet.setActionCommand("APPLET");

		JRadioButton rdbJavaAWT = new JRadioButton("Java AWT");
		rdbJavaAWT.setActionCommand("AWT");

		JRadioButton rdbJavaSwing = new JRadioButton("Java Swing");
		rdbJavaSwing.setActionCommand("SWING");

		// add event handler
		MyItemListener myItemListener = new MyItemListener();
		rdbApplet.addItemListener(myItemListener);
		rdbJavaAWT.addItemListener(myItemListener);
		rdbJavaSwing.addItemListener(myItemListener);

		// add radio buttons to a ButtonGroup
		final ButtonGroup group = new ButtonGroup();
		group.add(rdbApplet);
		group.add(rdbJavaAWT);
		group.add(rdbJavaSwing);

		// Frame setting
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		Container cont = frame.getContentPane();

		cont.setLayout(new GridLayout(0, 1));
		cont.add(new JLabel("Please choose your favorite Java stuff:"));
		cont.add(rdbApplet);
		cont.add(rdbJavaAWT);
		cont.add(rdbJavaSwing);

		frame.setVisible(true);
    }
}
