import java.io.*;
import java.util.Scanner;


public class Chapter10Class extends Files {

	private FileInputStream FSOriginal;
	
	
	private FileOutputStream FSNew;
	
	
	Chapter10Class()throws IOException{
		
		FSOriginal = new FileInputStream(ReturnFileNameOriginal());
		
		
		FSNew = new FileOutputStream(ReturnFileNameNew());
	
	}
	
	void Read() throws IOException{
		
		//TODO: remove this
		char i='~';
		
		for(;i!=(char)(-1);i=(char)FSOriginal.read()){
			System.out.print(i);
			i = (char)i == ' '? '-':i;
			
			if(i!='~')
			FSNew.write(i);
			
		}
		
		FSNew.close();
		FSOriginal.close();
		
	}
	
}
