package lesson40.swing2.notebook;

import javax.swing.JFrame;

import lesson40.swing2.notebook.ui.console.NotebookCommunicator;
import lesson40.swing2.notebook.ui.desktop.MainWindow;

public class App {

	public static void main(String[] args) {
		System.out.println("start with option: " + args[0]);
		if (args.length > 0 && args[0].equals("console")) {
			NotebookCommunicator com = new NotebookCommunicator();
			com.start();
		} else if(args.length > 0 && args[0].equals("desktop")) {
			JFrame window = new MainWindow();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setVisible(true);
		} else {
			throw new RuntimeException("ui CLI parameter should specified");
		}
		

	}

}
