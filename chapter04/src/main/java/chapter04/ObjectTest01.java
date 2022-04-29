package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10,10);
		
		Class klass = p.getClass();
		System.out.println(klass.getName());
		
		System.out.println(p.getClass().getName()); // reflection
		//모두 같은 거임.
		
		System.out.println(p.hashCode()); // address 기반의 해싱값 : 10진수
										  // address X, reference X
		System.out.println(p.toString()); // p.getName() + @ + hashcode() : 16진수
		System.out.println(p); //
	}



}
