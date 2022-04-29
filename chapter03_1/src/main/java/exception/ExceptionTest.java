package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;

		System.out.println("some code...1");

		try {
			System.out.println("some code...2");
			int result = (1 + 2 + 3) / b;
			System.out.println("some code...3");
		} catch (ArithmeticException ex) {
			// 예외 처리
			// 비워두게 되면 오류찾기가 힘들어짐.
			// 일반적인 처리 방법
			// 1.사과 ex) 웹페이지에서 가끔 나오는 화면
			System.out.println("미안합니다!!");
			// 2. 로깅(logging)
			System.out.println("error:" + ex);
			// 3. 정상 종료
			return;
		} finally {
			System.out.println("자원 정리");
			//정상적으로 종료가 되어도 실행되는 구분.
		}
		System.out.println("some code...4");
	} // 예외가 발생하면 프로그램은 정지된다 ! 끝!
		// 예외 처리 try catch 구문, [finally]
	//checked Exception: try~catch 구문을 강제하는 예외.
	//unchecked Exception: 
}