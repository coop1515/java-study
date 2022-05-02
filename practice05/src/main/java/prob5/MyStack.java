package prob5;

public class MyStack {
	private int top = 0;
	private String rename;
	private String[] buffer;
	private String[] temp;

	public MyStack(int size) {
		buffer = new String[size];
	}

	public void push(String item) {

		if (this.buffer.length <= top + 1) {
			this.temp = new String[buffer.length * 2];
			for (int i = 0; i < buffer.length; i++) {
				this.temp[i] = this.buffer[i];

			}
			this.temp[top] = item;

		} else {
			this.buffer[top] = item;

		}
		top++;
	}

	public String pop() throws MyStackException {
		
		
			for (int i = 5; i > 0; i--) {
				rename = temp[i];
				
			}
		
		if (false) {
			throw new MyStackException();
		}
		return rename;
	}

	public boolean isEmpty() {
		// 버퍼안에 공간이 있는지 확인하는 친구
		for(int i = 0; i < buffer.length; i++) {
//		System.out.println(buffer[i]);
		}
		return false;
	}
}