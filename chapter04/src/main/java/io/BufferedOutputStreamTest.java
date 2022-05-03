package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림
			FileOutputStream fos = new FileOutputStream("test.txt");
			// 보조 스트림
			bos = new BufferedOutputStream(fos);

//		for (int i= 'a'; i <= 'z'; i++){
//			System.out.println(i);
//		}
//		아스키코드로 출력하니 밑에 식과 같음.
			for (int i = 97; i <= 122; i++) {
				bos.write(i);
//				bos.flush(); //입력되있는 버퍼를 비우는 처리 
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't Open" + e);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} // bos.write(i)의 오류처리
		finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
