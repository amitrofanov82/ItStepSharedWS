package lesson40.swing2.notebook.ui.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;

import lesson40.swing2.notebook.model.Notebook;

public class MainWindow extends JFrame {
	
	Notebook noteModel = new Notebook();
	
	public MainWindow(){
		super();
		this.setTitle("Notebook");
		this.setSize(600, 500);
		this.setLocation(300, 200);
		//this.setBackground(Color.BLACK);
		//this.setShape(new Ellipse2D.Float(70, 75, 70, 50));
		
		this.setLayout(null);
		Knopka button = new Knopka("КНОПКА");
		button.setSize(new Dimension(230,240));
		button.setLocation(200, 10);
		this.add(button);
		
		noteModel.addNote("Запись номер 1");
	}
	
    @Override
    public void paint(Graphics g) {

    	System.out.println(g.getClass());
    	g.setColor(Color.BLACK);
    	g.drawString(noteModel.getAllNotes(), 100, 100);
    	System.out.println(this.getParent());
    	super.paint(g);
    }
	
}
