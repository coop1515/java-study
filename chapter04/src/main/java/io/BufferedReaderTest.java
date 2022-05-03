package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		// 기반 스트림
		try {
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				index++;
				System.out.print(index); // 줄수 표시
				System.out.print(":");
				System.out.println(line); // 버퍼 라인읽어오기
				System.out.println("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't Open: " + e);
		} catch (IOException e) {
			System.out.println("Error: " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
