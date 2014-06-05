import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;

public class DrawingPanel extends JPanel {

	Chapter14Class c14;
	
	DrawingPanel(){
		
		 c14 = new Chapter14Class(); 
		
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D)g;
		
		super.paintComponent(g2d);
		g2d.setColor(Color.blue);
		g2d.fillRect(0, 400, 800, 400);
		
		g2d.setColor(Color.red);
		
		
		for(Line2D l:c14.traverse()){
			
			g2d.draw(l);
		}
		
		
	}
	
	public void assa(){
		
		
	}
	
}

class setGUI{
	
	DrawingPanel dp = new DrawingPanel();
	MouseAdapter Ma = new MouseAdapter(dp);
	JLabel jl;
	
	
	setGUI(){
		
		dp.addMouseListener(Ma);
		
		JFrame jf = new JFrame("mehehe");
		jl = new JLabel("Yoh");
		jl.setSize(100, 100);
		
		
		jf.setSize(800, 800);
		jf.add(jl);
		jf.add(dp);
		
		
		jf.setVisible(true);
		
	}
	
	
}