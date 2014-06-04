
abstract class Chapter12Class {

	enum Phones{
		
		Nokia(6000),
		Samsung(10000),
		HTC(7000),
		Sony(7500);
		
		private int price;
		
		Phones(int price){this.price = price;}
		
		int getPrice(){return price;}
		
	}
	
	
}
