package prob6;

public class RectTriangle extends Shape {
	
	
	public RectTriangle() {
		
	}
	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = this.width * this.height * 0.5 ;
		return area;
	}
	
	public double getPerimeter() {
		double width = Math.pow(this.width,2.0);
		double height = Math.pow(this.height, 2);
		double perimeter = this.width+ this.height + Math.sqrt(width +height);
		return perimeter;
	}
	
}
