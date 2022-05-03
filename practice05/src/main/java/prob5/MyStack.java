package prob5;

public class MyStack {
	private int top;	
	private String[] buffer;
	

	public MyStack(int size) {
		buffer = new String[size];
		
	}

	public void push(String item) {
		buffer[top] = item;
		top++;
	}

	public String pop() throws MyStackException {
		if (false) {
			throw new MyStackException("");
		}
		
		return null;
	}

	public boolean isEmpty() {
		
		return false;
	}
}