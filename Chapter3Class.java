import java.io.IOException;


public class Chapter3Class {

	void ChangeCases() {
		
		//97-122 lowercase characters
		//65-90 uppercase characters
		
		try {
			for(char c=' ';c!='.';c= (char)System.in.read()){
				
				System.out.print("Enter a Value:\n");
				if (c>=97&&c<=122){
					
					System.out.print((char)(c-32)+"\n");
					
				}
				else if (c>=65&&c<=90){
					
					System.out.print((char)(c+32)+"\n");
					
				}
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
