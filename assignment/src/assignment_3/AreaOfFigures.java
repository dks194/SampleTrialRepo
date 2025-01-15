package assignment_3;

public class AreaOfFigures {

	public void area(float r) {
		float areaCircle = 3.14f*r*r;
		System.out.println("The area of circle :" + areaCircle);
		
	}
	public float area(float l,float b) {
		float areaRect = l*b;
		return areaRect;
		
	}
	
	public double area(double a) {
		double areaSquare = a*a;
		return areaSquare;
	}
	public static void main(String[] args) {
		AreaOfFigures areaObj = new AreaOfFigures();
		areaObj.area(3.5f);
		
		System.out.println("The area of rectangle :" + areaObj.area(5, 6));
		System.out.println("The area of circle :" + areaObj.area(5.8));
	}

}
