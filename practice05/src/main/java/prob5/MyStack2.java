package prob5;

public class MyStack2 {
	private int top;	
	private Object[] buffer;
	

	public MyStack2(int size) {
		top = -1;
		buffer = new Object[size];
		
	}

	public void push(Object item) {
		if (top == buffer.length -1) {
			resize();
		}
		
		buffer[++top] = item;
	}

	private void resize() {
		Object[] temp = new Object[buffer.length * 2];
		for (int i = 0; i <= top; i++) {
			temp[i] = buffer[i];
		}

		buffer = temp;
		
	}

	public Object pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
		}

		Object result = buffer[top];
		buffer[top--] = null;

		return result;
	}

	public boolean isEmpty() {
		
		return top == -1;
	}
}