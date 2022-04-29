package chapter04;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Rect> set = new HashSet<>();
		//HashSet method는 Hash값을 먼저 비교하고 그 뒤에 equals를 함.
		//그래서 equals와 hashcode는 같이 override를 해주고, 하지않으면 출력이 다르게 됨.
		
		Rect r1 = new Rect(10,20);
		Rect r2 = new Rect(10,20);
		
		set.add(r1);
		set.add(r2);
		
		for(Rect r : set) {
			System.out.println(r); 
		}
	}

}
