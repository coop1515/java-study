package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		// equals는 String의 길이 먼저 비교해보고 같으면 char[]와 같이 하나씩 비교해봄. 틀리면 false 출력.
		System.out.println(s1.hashCode() + ": " + s2.hashCode());
		//hashcode()는 내용기반으로 만들어져서 둘이 같음.
		System.out.println(System.identityHashCode(s1)+ ": " + System.identityHashCode(s2));
		//주소기반의 해쉬코드는 당연히 다름.
		
		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode() + ": " + s4.hashCode());
		System.out.println(System.identityHashCode(s3)+ ": " + System.identityHashCode(s4));
		//==> 출력값을 보았을 때 s3와 s4는 동일한 객체이다. new String이 되지않음.
		//String은 불변객체로 내용을 변경하는 method는 없다. -> replace같은건 삭제했다가 추가하는것.
		
//		int i = 10;
//		int j = 10;
//		System.out.println(i == j);
//		System.out.println(System.identityHashCode(i)+ ": " + System.identityHashCode(j));
		
	}

}