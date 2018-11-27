package notebook.ui.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Workspace extends java.awt.Component {
	
	public Workspace() {
		super();
		this.setSize(new Dimension(580, 550));
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), getHeight());
	}
}
