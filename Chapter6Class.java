/*comments will only be used in not so obvious things*/


import java.io.IOException;
import java.util.*;

public class Chapter6Class {

		private int maxSize;
		private int currSize=0;
		
		private char charStack[];
		
		Scanner in = new Scanner(System.in);
		
		Chapter6Class(int size){
			
			maxSize = size;
			charStack = new char[size];
			
			System.out.println("Stack max size initialized to "+maxSize);
		}
		
		void push() throws IOException{

			try {
				System.out.println("Input Char to push:");
				charStack[currSize++] = (char)System.in.read();
				System.out.println("Current Stack size now "+currSize);
			} 
			catch (Exception e) {
				System.out.print("Cant Push Anymore");
				currSize=0;
			}
			finally{
				return;
			}
			
		}
		
		void pop(){
			try {
				System.out.println("Character popped is "+ charStack[--currSize]);
				System.out.println("Current Stack size now "+currSize);
			} catch (Exception e) {
				System.out.print("No values to pop anymore");
				currSize=0;
			}
			finally{
				return;
			}
		}
		
		void Menu(Chapter6Class c6) throws IOException{
			int ChooseOption =0;
			
			try {
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
			} catch (Exception e) {
				System.out.print("Some Error Happened Try Again");
				in.next(); //added to consume wrong input
				Menu(c6);				
			}
			
			
		}
		
}
