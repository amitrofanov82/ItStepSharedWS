package lesson39.swing;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class App1 {
    public static void main(String[] args) throws InterruptedException {
        /*JFrame fr0 = new JFrame();
        fr0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr0.setSize(100, 100);
        fr0.setLocation(300, 200);
        fr0.setVisible(true);
        
        int i =0;
        while (true) {
        	//System.out.println(i++);
        	Thread.sleep(2);
        	fr0.setLocation(300+ (int)(Math.random()*100-50), 200);
        }*/
    	
        JFrame fr = new FrameDemo2();
        fr.setBackground(Color.WHITE);
        fr.setSize(new Dimension(250, 300));
        fr.setTitle("Windows-Application");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        fr.repaint();
    }
    
}
