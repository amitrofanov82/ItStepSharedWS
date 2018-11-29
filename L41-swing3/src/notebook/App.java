package notebook;

import javax.swing.JFrame;

import notebook.ui.console.NotebookCommunicator;
import notebook.ui.desktop.MainWindow;

public class App {

	public static void main(String[] args) {
		if (args.length > 0 && args[0].equals("console")) {
			NotebookCommunicator com = new NotebookCommunicator();
			com.start();
		} else {
			JFrame window = new MainWindow();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setResizable(false);
			window.setVisible(true);
		} 
		

	}

}
