package prob6;

public class Rectangle extends Shape implements Resizable {
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	public void resize(double d) {
		this.width = width * d;
		this.height = this.height * d;
		
	}

	public double getArea() {
		double area = this.width * this.height;
		return area;
	}

	public double getPerimeter() {
		double perimeter = (this.width + this.height) *2;
		return perimeter;
	}

	

	

}