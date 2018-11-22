package lesson40.swing2.notebook.ui.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

public class Knopka extends java.awt.Component {
	
	private String label;
	private int w;
	private int h;
	
	Knopka(String label){
		super();
		this.setSize(new Dimension(70, 28));
		this.setLocation(0, 0);
		this.label = label;
	}
	
	@Override
	public void paint(Graphics g) {
		h = this.getHeight();
		w = this.getWidth();
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, this.getWidth(), getHeight());
		g.setColor(Color.BLACK);
		//g.setFont();
		g.drawString(label, w/10, h/10);
		
	}
	
	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		w = width;
		h = height;
	}

}
