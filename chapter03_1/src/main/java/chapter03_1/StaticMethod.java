package chapter03_1;

public class StaticMethod {
	int n;
	static int m;
	
	void f1() {
		System.out.println(n);
		// instance 메소드에서는 instance 변수에 접근 가능
	}
	
	void f2() {
		System.out.println(m);
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름이 생략 가능하다.
	}
	
	void f3() {
		f2();
	}
	
	void f4() {
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름이 생략 가능하다.
		s1();
	}
	
	static void s1() {
		//error : static method 에서는 인스턴스 변수 접근이 불가능 하다.
		//System.out.println(n); 
	}
	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스에서는 클래스(static) 변수 접근에서는 클래스 이름이 생략 가능하다.
		System.out.println(m);
	}
	
	static void s3() {
		//error : static method에서는 인스턴스 메소드에 접근 할 수 없다.
		//f1();
	}
	
	static void s4() {
		StaticMethod.s1();
		s1();
	}

}
