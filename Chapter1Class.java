
public class Chapter1Class {
	
	//converts ft to inches per inch and outputs them
	void Converter_ft_to_inch(){
		
		for(float meter=1.0f; meter<=(12*12);meter++){
			
		System.out.println(meter+" meter is "+(meter*39.37)+" inches");	
			
		if ((meter%12)==0){
			System.out.println();
		}
		
		}
				
	}
	
}
