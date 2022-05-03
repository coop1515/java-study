package prob5;

public class MainApp3 {

	public static void main(String[] args) {
		try {
			MyStack3<> stack = new MyStack3<>(3); // <> generic을 쓰면 타입변경이 용이해짐.
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");
			stack.push(".");

			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println( s );
			}

			System.out.println("======================================");

			stack = new MyStack3<>(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());
			
		}
		catch (MyStackException ex) {
			System.out.println( ex );
		}

	}

}
