package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// == operator method : 동일성 비교
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		
		// equals method : 두 객체의 동질성을 비교 (내용 비교)
		// 부모 클래스 Object의 기본 equals비교는 동일성 비교(==)와 같음 (주소값을 불러오기 때문)
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		

	}

}
