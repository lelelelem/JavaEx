
class Chapter7Class extends TwoDShape{

	final double Pi = 3.14;
	
	
	Chapter7Class(double radius) {
		super(radius);		
	}

	double area(){
		return Pi*(radius*radius);		 
	}
	
}

class TwoDShape{
	
	double radius;
	
	TwoDShape(double radius){
		this.radius = radius;
	}
	
}