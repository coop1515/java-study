package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) /*throws Exception -> 예외를 밖으로 던지는 코드로 좋지않음*/
	{
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("hello.txt");
			int data = fis.read();
			System.out.println((char)data);
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e);
		}  catch (IOException e) {
			System.out.println("error: " + e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
