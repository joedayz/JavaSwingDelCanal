package pe.joedayz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class Main {

    public static void main(String[] args) {

		final int MAX = 10;
		// initialize list elements
		String[] listElems = new String[MAX];
		for (int i = 0; i < MAX; i++) {
			listElems[i] = "element " + i;
		}

		final JList list = new JList(listElems);
		final JScrollPane pane = new JScrollPane(list);
		final JFrame frame = new JFrame("JList Demo");

		// create a button and add action listener
		final JButton btnGet = new JButton("Get Selected");
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedElem = "";
				int selectedIndices[] = list.getSelectedIndices();
				for (int j = 0; j < selectedIndices.length; j++) {
					String elem =
							(String) list.getModel().getElementAt(selectedIndices[j]);
					selectedElem += "\n" + elem;

				}
				JOptionPane.showMessageDialog(frame,
						"You've selected:" + selectedElem);
			}// end actionPerformed
		});

		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pane, BorderLayout.CENTER);
		frame.getContentPane().add(btnGet, BorderLayout.SOUTH);
		frame.setSize(250, 200);
		frame.setVisible(true);
    }
}
