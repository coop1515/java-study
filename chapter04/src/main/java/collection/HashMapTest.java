package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		
		String k1 = "one";
		m.put(k1,1); // auto boxing
		m.put("two", 2); // 앞이 key 뒤가 값.
		m.put("three", 3);
		
		System.out.println(m.get("one")); // 꺼낼때는 get을 사용. auto unboxing
		
		int i = m.get("one");
		int j = m.get(new String("one"));
		
		System.out.println(i + ":" + j);
		
//		System.out.println(m.get("three"));
		m.put("three", 333333);
		System.out.println(m.get("three"));
		
		// 순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
//			System.out.println(key);
		}
	}
}
