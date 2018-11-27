package notebook.ui.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Knopka extends java.awt.Component {
	
	private String label;
	
	Knopka(String label){
		super();
		this.setSize(new Dimension(185, 30));
		this.label = label;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 13));
		g.drawString(label, this.getHeight()/10+5, this.getWidth()/10+2);
		
	}

}
