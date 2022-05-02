package chapter04;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		Integer i = new Integer(10); //deprecated 곧 사라질 예정이니 쓰지말라는 말.
		Character c = new Character('C');
		Boolean b = new Boolean(true);
		
		//Auto Boxing
		Integer j1 = 10;
		Integer j2 = 20;
		
		System.out.println(j1 == j2);
		System.out.println(j1.equals(j2));
		
//		Auto Unboxing
//		int m = j1.intValue() + 10;
		int m = j1 + 10;
		
		
	}

}
