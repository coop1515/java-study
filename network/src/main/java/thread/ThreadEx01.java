package thread;

public class ThreadEx01 {
	public static void main(String[] args) {
//		for(int i = 0; i <+ 10; i++) {
//			System.out.print(i);
//		}

		new DigitThread().start(); // 이렇게만 하면 실행순서가 무작위로 됨. 밑에 슬립을 추가하는 이유.

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
