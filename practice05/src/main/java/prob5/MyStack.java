package prob5;

public class MyStack {
	private int top;	
	private String[] buffer;
	

	public MyStack(int size) {
		top = 0;
		buffer = new String[size];
		
	}

	public void push(String item) {
		if(top == buffer.length)
		{
			resize();
		}
		buffer[top] = item;
		top++;
	}

	private void resize() {
		String[] temp = new String[buffer.length*2];
		for (int i = 0; i < top; i ++) {
			temp[i] = buffer[i];
		}
		
		buffer = temp;
	}

	public String pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}
		String temp = buffer[top-1];
		buffer[top--] = null;
		return temp;
	}

	public boolean isEmpty() {
		
		return top == 0;
	}
}