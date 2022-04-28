package paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {
		
	} //부모 클래스에 Point()메소드가 없으면 안됨 없다면 내가 직접 인자값을 지정해줘야함 ex)super(20,10); 
	public ColorPoint(int x, int y, String color) {
//		setX(x);//		this.x = x;
//		setY(y);//		this.y = y; private이라 바로 접근 불가능 protected면 가능.
		super(x,y);
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("점[x= " + getX() + ", "
				+ "y= " + getY() + " color= " + color +" ]을 그렸습니다.");
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
