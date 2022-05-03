package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		InputStream is = null;
		try {
			in = new FileReader("1234.txt");
			
			int count = 0;
			int data = -1;
			while ((data = in.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.print("\ncount: "+count); // 총 몇번 도는지 확인
			System.out.println();
			
			count = 0;
			data = -1;
			is = new FileInputStream("1234.txt");
			while ((data = is.read()) != -1) {
				System.out.print((char)data);
				count++;
			}
			System.out.println("\ncount: " + count); // 바이트로도 확인해보기 (1문자당 3바이트)
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found:" + e);

		} catch (IOException e) {
			System.out.println("File Not Found:" + e);

		}finally {

			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
