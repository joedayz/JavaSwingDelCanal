package pe.joedayz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLFrameHyperlinkEvent;

public class Main {

    public static void main(String[] args) {

		final JFrame frame = new JFrame("JEditorPane Demo");
		String initialURL = "http://www.java.com/";
		final JEditorPane ed;

		JLabel lblURL = new JLabel("URL");
		final JTextField txtURL = new JTextField(initialURL, 30);
		JButton btnBrowse = new JButton("Browse");

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(lblURL);
		panel.add(txtURL);
		panel.add(btnBrowse);

		try {
			ed = new JEditorPane(initialURL);
			ed.setEditable(false);

			ed.addHyperlinkListener(new HyperlinkListener() {

				public void hyperlinkUpdate(HyperlinkEvent e) {
					if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
						JEditorPane pane = (JEditorPane) e.getSource();
						if (e instanceof HTMLFrameHyperlinkEvent) {
							HTMLFrameHyperlinkEvent evt = (HTMLFrameHyperlinkEvent) e;
							HTMLDocument doc = (HTMLDocument) pane.getDocument();
							doc.processHTMLFrameHyperlinkEvent(evt);
						} else {
							try {
								pane.setPage(e.getURL());
							} catch (Throwable t) {
								t.printStackTrace();
							}
						}
					}
				}
			});

			btnBrowse.addActionListener(
					new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							try {
								ed.setPage(txtURL.getText().trim());
							} catch (IOException ex) {
								ex.printStackTrace();
							}
						}
					});
			JScrollPane sp = new JScrollPane(ed);
			frame.setLayout(new BorderLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(panel, BorderLayout.NORTH);
			frame.getContentPane().add(sp, BorderLayout.CENTER);

			frame.setSize(500, 350);
			frame.setVisible(true);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
    }
}
