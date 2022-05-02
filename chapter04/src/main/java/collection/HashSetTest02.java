package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest02 {

	public static void main(String[] args) {
		Set<Gugudan> s = new HashSet<>();
		
		s.add(new Gugudan(2,3));
		s.add(new Gugudan(9,9));
		s.add(new Gugudan(2,3)); // 중복체크
		s.add(new Gugudan(3,2)); // 2,3과 3,2를 곱하면 똑같이 6이니 중복 체크.
		
		for(Gugudan g : s) {
			System.out.println(g);
		}

	}

}
