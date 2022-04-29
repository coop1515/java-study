package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		// immutability(불변성)
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
//		String temp = "??";
//		String s4 = s2.concat(temp);
		String s4 = s2.concat("??");
		System.out.println(s4);
		
		String s5 = "!".concat(s2).concat("@");
		System.out.println(s5);
		equalsHello(null);
	}
	
	private static boolean equalsHello(String s) {
		return "hello".equals(s); // s.equals("hello"); -> 위험한 코드.
	}

}
