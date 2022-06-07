package pkg;
import java.awt.*;
import java.geom.*;
import java.swing.*;


public class DrawingCanvas extends JComponent{
	private int width;
	private int height;
	
	public DrawingCanvas(int w, int h){
		width = w;
		height = h;
	}
	protected void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,width,height);
		g2d.setColor(new Color(0,153,0));
		g2d.fill(r);
	}
		
	

}

