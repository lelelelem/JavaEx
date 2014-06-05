import java.awt.*;
import java.awt.geom.Line2D;


public class Chapter14Class extends LinkedList {

	
	int len;
	
	Chapter14Class(){
		head = null;
		len=0;
	}
	
	void addhead(int PrevX, int PrevY,int x, int y){
		
		LinkedList NewNode = new LinkedList();
		NewNode.next = head;
		head = NewNode;
		
		head.x = x;
		head.y = y;
		head.PrevX = PrevX;
		head.PrevY = PrevY;
		
		len++;
		
	}
	
	Line2D[] traverse(){
		
		int ctr=0;
		
		Line2D.Double lines[] = new Line2D.Double[len];
		
		for(LinkedList temp = head; temp!=null;temp = temp.next){
			
			lines[ctr++] = new Line2D.Double(temp.PrevX, temp.PrevY, temp.x, temp.y);
			
		}		
		return lines;
	}
	
}



