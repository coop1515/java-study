package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");

		// 순회 1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// delete
		list.remove(2);

		System.out.println("=========================");

		// 순회 2
		Iterator<String> it = list.iterator(); // 한번 돌고나면 다시 돌 수 없음.
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("=========================");

		for (String s : list) {
			System.out.println(s);
		}

	}

}
