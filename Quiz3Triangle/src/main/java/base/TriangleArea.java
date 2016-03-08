package base;

public class TriangleArea {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public TriangleArea(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public TriangleArea(){
		
	}

	private double getSide1() {
		return side1;
	}

	private void setSide1(double side1) {
		this.side1 = side1;
	}

	private double getSide2() {
		return side2;
	}

	private void setSide2(double side2) {
		this.side2 = side2;
	}

	private double getSide3() {
		return side3;
	}

	private void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getPerimeter(){
		double a = getSide1();
		double b = getSide2();
		double c = getSide3();
		
		double Perimeter = a + b + c;
		return Perimeter;
	}
	
	public double getArea(){
		double a = getSide1();
		double b = getSide2();
		double c = getSide3();
		double hP = getPerimeter()/2;
		
		double Area = Math.sqrt(hP*(hP-a)*(hP-b)*(hP-c));
		return Area;
		
	}
	
	public String toString(){
		return "The sides of the Triangle are:" + getSide1() + getSide2() + getSide3() + "The Perimeter of the Triangle is:" + getPerimeter() + "The Area of the Triangle is:" + getArea();
	}
	
	
	
}
