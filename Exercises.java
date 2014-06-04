
import java.io.IOException;
import java.util.*;

class Exercise{	
	
	public static void main(String args[]) throws IOException{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input Stack Size:");
		
		while(true){
		
			try{
				Chapter6Class c6 = new Chapter6Class(in.nextInt());
				c6.Menu(c6);
				break;
			}
			catch (Exception e) {
					System.out.println("Some Error Happened Try again");
					in.next();//added to consume wrong input
			}
			
		}
		System.out.println("Bye");
		
	}
	
	
}
