package paint;

public class Main {

	public static void main(String[] args) {
//		Point point1 = new Point();
//		point1.setX(20);
//		point1.setY(10);
//		// point1.show();
		Point point1 = new Point(20,10);
		draw(point1);

		Point point2 = new Point(50, 100);
		draw(point2);
		// point2.show();
		point2.show(false);
//		ColorPoint cp = new ColorPoint(40,50,"red");
//		Point point3 = cp;
		Point point3 = new ColorPoint(40, 50, "red");//upcasting (Point)new ColorPoint(40, 50, "red");
		draw(point3);
//		point3.show(true);

		Triangle triangle = new Triangle();
		draw(triangle);
		
		Rectangle rectangle = new Rectangle();
		draw(rectangle);
		
		Circle circle = new Circle();
		draw(circle);
		
		GraphicText graphictext = new GraphicText("Hello World");
		draw(graphictext);
		
		// instanceof operator test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		
		//error : class는 Hierachy 상위와 하위만 instanceof 연산자를 사용 할 수 있음.
//		System.out.println(circle instanceof Rectangle);
		
		//interface는 hierachy와 상관없이 instanceof operator를 사용할 수 있다.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
//	public static void drawPoint(Point point) {
//		point.show();
//
//	}
//	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	
//	public static void drawColorPoint(ColorPoint point) {
//		point.show();
//	} //override를 사용하면 필요없는 부분.
	
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}

}