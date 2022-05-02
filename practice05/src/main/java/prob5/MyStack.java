package prob5;

public class MyStack {
	private int top = 0;
	private String rename ;
	private String[] buffer;

	public MyStack(int size) {
		buffer = new String[size];
	}

	public void push(String item) {
		
		this.buffer[top] = item;
		top++;
	}

	public String pop() throws MyStackException {
		
//		for (int i = buffer.length; i > 0; i--) {
//			rename = buffer[i];
//		}
//		if (false) {
//			throw new MyStackException();
//		}
		return rename;
	}

	public boolean isEmpty() {
		//버퍼안에 공간이 있는지 확인하는 친구
		System.out.println(buffer);
		return false;
	}
}