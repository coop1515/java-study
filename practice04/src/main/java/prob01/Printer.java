package prob01;

public class Printer {

//	public void println(int integer) {
//		System.out.println(integer);
//		
//	}
//	public void println(boolean trueFalse) {
//		System.out.println(trueFalse);
//		
//	}
//	public void println(double real) {
//		System.out.println(real);
//		
//	}
//	
//	public void println(String korean) {
//		System.out.println(korean);
//		
//	}
//	public <T, S> void println(T t, S s) { //여러개도 가능한데 너무 많으면 복잡해짐.
//		System.out.println(t);
//	}
	public <T> void println(T... ts) { //여러개도 가능한데 너무 많으면 복잡해짐.
		for(T t : ts) {
			System.out.println(t);
		}
	}
	
	public int sum(int... nums) { // int... 변수가 여러개라는 뜻. (가변)
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
}
