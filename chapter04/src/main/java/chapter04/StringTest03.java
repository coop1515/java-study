package chapter04;

public class StringTest03 {

	public static void main(String[] args) {
		
		//String method들..
		String s1 = "aBcABCabcAbc";
		System.out.println(s1.length());
		System.out.println(s1.charAt(2)); // chartAt 문자열에서 (n)위치에 있는 문자를 char로 반환.
		System.out.println(s1.indexOf("abc")); //s1안에서 abc를 찾고 위치를 반환하는 함수.
		System.out.println(s1.indexOf("abc", 7)); // 7번째부터 abc를 찾는다.
		System.out.println(s1.substring(3)); // (n) n번째부터 출력.
		System.out.println(s1.substring(3, 5)); //(n,m) n~m까지 출력.
		
		String s2 = " ab cd ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s2.concat(s3); // concat 이어붙이는 함수.
		System.out.println(s4);
		
		System.out.println("--"+s2.trim()+"--");
		// 양쪽끝에 공백을 지우는 함수 trim 아이디 패스워드 입력하는창에 많이 사용함.
		System.out.println("---"+ s2.replaceAll(" ", ""));
		// 모든 공백 대체 (n,m)이면 n문자를 m으로 모두 교체하라는 뜻.
		
		String[] tokens1 = s3.split(","); // ("n") n문자마다 분리함.
		for(String s : tokens1) {
			System.out.println(s);
		}
		
		String[] tokens2 = s3.split(" ");
		for(String s : tokens2) {
			System.out.println(s);
		}
		// +는 String concat(연결) 연산자
//		String s5 = "Hello" + "World" + "Java" + 1.8;
		String s5 = new StringBuffer("Hello").append("World")
					.append("Java").append(1.8).toString();
		System.out.println(s5);
		
		String s6 = "";
		for(int i = 0; i < 100; i++) {
//			s6 = s6 + i ;
			s6 = new StringBuffer(s6).append(i).toString();
			System.out.println(s6);
		}
		
		StringBuffer sb6 = new StringBuffer("");
		for(int i = 0; i <100; i++) {
			sb6.append(i);
		}
		
		String s7 = sb6.toString();
		System.out.println(s7.length());
		
		
	}

}
