


public class Chapter2Class {

	void FindPrimeNumbers(){
		
		for(int x=2; x<=100; x++){
			if (x!=3&&x!=5&&x!=2&&x!=7){
				if (x%2==0||x%3==0||x%5==0||x%7==0){
					System.out.println(x+ " is a Prime Number...");
				}	
			}
		}
	}
	
}
