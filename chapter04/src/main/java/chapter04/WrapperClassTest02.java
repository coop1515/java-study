package chapter04;

public class WrapperClassTest02 {

	public static void main(String[] args) {
		String s1 = "123456";
		int i = Integer.parseInt(s1); // 값을 int값으로 바꿈.
		int j = 10;
		System.out.println(i + j);
		
		String s2 = String.valueOf(i); // 값을 String으로 바꿈.
//		String s2 = "" + i;
		System.out.println(s2);
		
		char c = 'A';
		int a = Character.getNumericValue(c);
		System.out.println(a);
		
		
		String s4 = Integer.toBinaryString(15); // (n) 2진수로 n값을 나타내줌
		System.out.println(s4);
		
		String s5 = Integer.toHexString(15); // (n) 16진수로 n값을 나타내줌.
		System.out.println(s5);
	}

}
