package pe.joedayz;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {

	public static void main(String[] args) {
		final JFrame frame = new JFrame("JTable Demo");

		String[] columns = {"Code", "Name", "High", "Low",
				"Close", "Volume", "Change","Change %"};

		Object[][] data = {
				{"MBF", "CITYGROUP", 10.16, 10.16, 10.16, 200, 0.08,0.79},
				{"MBL", "BANK OF AMERICA", 12.66, 12.66, 12.66, 6600, 0.13,1.04},
				{"MJP", "Morgan Stanley Dean Witter & Co.", 24.97, 24.97, 24.97, 1000, -0.04,-0.16}
		};

		JTable table = new JTable(data, columns);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);

		JLabel lblHeading = new JLabel("Stock Quotes");
		lblHeading.setFont(new Font("Arial",Font.TRUETYPE_FONT,24));

		frame.getContentPane().setLayout(new BorderLayout());

		frame.getContentPane().add(lblHeading,BorderLayout.PAGE_START);
		frame.getContentPane().add(scrollPane,BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(550, 200);
		frame.setVisible(true);
	}
}
