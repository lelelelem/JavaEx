/*comments will only be used in not so obvious things*/


import java.io.IOException;

public class Chapter6Class {

		private int maxSize;
		private int currSize=0;
		
		private char charStack[];
		
		Chapter6Class(int size){
			
			maxSize = size;
			charStack = new char[size];
			
			System.out.println("Stack max size initialized to "+maxSize);
		}
		
		void push() throws IOException{

			if (currSize==maxSize){
				System.out.println("Cant push anymore pop values to be able to push again"); 
				//used so that an additional else wont be needed 
				return;	
			}
			
			System.out.println("Input Char to push:");
			charStack[currSize++] = (char)System.in.read();
			System.out.println("Current Stack size now "+currSize);
		}
		
		void pop(){
			if (currSize==-1){
				System.out.println("Cant pop anymore push values to be able to pop again"); 
				//used so that an additional else wont be needed 
				return;	
			}
			//used in order to prevent an outofboundsexception
			//since if currsize is 0-1 then it will be negative 1
			currSize = currSize==0 ? 0:currSize-1;
			
			System.out.println("Character popped is "+ charStack[currSize]);
			System.out.println("Current Stack size now "+currSize);
			
		}
		
}
