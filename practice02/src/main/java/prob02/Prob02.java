package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[5];

		double sum = 0;
		for (int i = 0; i < intArray.length; i++) {
			System.out.println( i+1 +"번째 숫자를 입력하세요.");
			intArray[i] = scanner.nextInt();
			sum = sum + intArray[i];
		}
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */

		/* 배열에 저장된 정수 값 더하기 */
		double avg = sum / intArray.length;
		System.out.println("평균값은 " + avg);
		/* 출력 */

		/* 자원정리 */
		scanner.close();
	}
}
