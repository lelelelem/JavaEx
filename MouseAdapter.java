import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseAdapter implements MouseListener {

	DrawingPanel dp;
	int PrevX, PrevY, x, y;
	
	Chapter14Class c14 = new Chapter14Class(); 
	
	MouseAdapter(DrawingPanel dp){
		this.dp = dp;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		PrevX = arg0.getX();
		PrevY = arg0.getY();
		
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		x = arg0.getX();
		y = arg0.getY();
		
		dp.c14.addhead(PrevX, PrevY, x, y);
		
		dp.repaint();
	}

}
