
import java.util.*;


public class Chapter5Class {

	private Scanner in = new Scanner(System.in);
	
	void getInputs(){
		
		int numArray[] = new int[10];
		//this is fine if no initialisation since this will soon be replaced
		int min=0, max=0;
		
		//iterator is set in for loop for uhhhh shorter code block
		for(int x=0; x<10;numArray[x++]=in.nextInt()){
			
			System.out.println("\nInput a Number:");
			
			if (x==1){		
				//needed or else min will always be zero
				//but why numArray[0]? because getting input is late by one 
				//since iterator field in for doesnt run the first time
				min = max = numArray[0];				
			}
			
			else if(x!=0){
				//why numArray[x-1]? because getting input is late by one 
				//since iterator field in for doesnt run the first time
				min = numArray[x-1]<min ? numArray[x-1]:min;//if New input is lower than min its new min else min remain
				max = numArray[x-1]>max ? numArray[x-1]:max;//if New input is bigger than max its new max else max remain
			}	
		}
		System.out.print("Min is "+min+" while Max is "+max);
		
	}
	
	
}
