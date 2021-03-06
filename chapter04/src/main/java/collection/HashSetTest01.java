package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest01 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("도우너");
		String s2 = new String("도우너");
		
		s.add("둘리");
		s.add("마이콜");
		s.add("도우너");
		s.add(s1);
		
		System.out.println(s.size());
		System.out.println(s.contains(s2)); // s안에 s2 문자열 포함되어있는지 확인하는 bool 함수
		
		// 순회
		for(String str : s ) {
			System.out.println(str);
		}
	}

}
