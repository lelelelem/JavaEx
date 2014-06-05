
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.applet.*;

import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;

public class Exercises extends Applet implements MouseInputListener{	
	
	private int x=0,y=0, PrevX=0, PrevY=0;
	Chapter14Class c14= new Chapter14Class();
	
	public void init(){
		
		addMouseListener(this);
		addMouseMotionListener(this);
	
	}
	
	public void start(){
	
		
		
	}
	
	
	public void paint(Graphics g){
		
		Line2D lines[] = c14.traverse(); 
		
		Graphics2D g2d = (Graphics2D)g;
		
		super.paintComponents(g2d);
		
		//Line2D.Double line = new Line2D.Double(PrevX, PrevY, x, y);
		
		for(Line2D DrawLines:lines){
			
			g2d.draw(DrawLines);
		}
		
		
	}
	
	public void stop(){
		
		
	}
	
	public void destroy(){
		
		
	}


	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		PrevX = e.getX();
		PrevY=e.getY();		
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		c14.addhead(PrevX, PrevY,x, y);
		
		repaint();
	}

	@Override
	public void mouseDragged(java.awt.event.MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
