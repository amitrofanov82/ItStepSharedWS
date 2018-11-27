package notebook.ui.desktop;

import java.awt.Graphics;

import javax.swing.JFrame;

import notebook.model.Notebook;

@SuppressWarnings("serial")
public class MainWindow extends JFrame {
	
	Notebook noteModel = new Notebook();
	
	public MainWindow(){
		super();
		this.setTitle("Notebook");
		this.setSize(800, 600);
		this.setLocation(300, 200);
		
		this.setLayout(null);
		Workspace ws = new Workspace();
		ws.setLocation(10, 10);
		Knopka button = new Knopka("ДОБАВИТЬ ЗАПИСЬ");
		button.setLocation(600, 10);
		Knopka button2 = new Knopka("ПОКАЗАТЬ ЗАПИСЬ");
		button2.setLocation(600, 50);
		Knopka button3 = new Knopka("ПОКАЗАТЬ ВСЕ ЗАПИСИ");
		button3.setLocation(600, 90);
		Knopka button4 = new Knopka("УДАЛИТЬ ЗАПИСЬ");
		button4.setLocation(600, 130);
		Knopka button5 = new Knopka("УДАЛИТЬ ВСЕ ЗАПИСИ");
		button5.setLocation(600, 170);
		Knopka button6 = new Knopka("СОХРАНИТЬ ЗАПИСИ");
		button6.setLocation(600, 210);
		Knopka button7 = new Knopka("ВОССТАНОВИТЬ ЗАПИСИ");
		button7.setLocation(600, 250);
		this.add(button);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(ws);
	}
	
    @Override
    public void paint(Graphics g) {
    	super.paint(g);
    }
	
}
