package pe.joedayz;

public class Main {

    public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CelsusConverterGUI().setVisible(true);
			}
		});
    }
}
