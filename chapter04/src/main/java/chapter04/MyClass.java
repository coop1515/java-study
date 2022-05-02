package chapter04;

public class MyClass {
	private static MyClass instance = null;
	
	private MyClass() {
	} // singleton pattern 이렇게 하면 외부에서 객체 생성 못하게됨.

	public static MyClass getInstance() {
		if(instance == null) {
			instance = new MyClass();
		}
		return instance;
	}
}
