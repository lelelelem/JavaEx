
import java.io.IOException;
import java.util.*;




class Exercise{	
	
	public static void main(String args[]) throws IOException{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input Stack Size:");
		int ChooseOption =0;
		
		Chapter6Class c6 = new Chapter6Class(in.nextInt());
		
		while(ChooseOption!=3){
			
			System.out.println("\nChoose action: \n1)push\n2)pop\n3)exit\n");
			ChooseOption = in.nextInt();
			
			System.out.println("\n");
			if (ChooseOption==1){
				c6.push();
			}
			else if (ChooseOption==2){
				c6.pop();
			}
			
		}
		
	}
	
}
