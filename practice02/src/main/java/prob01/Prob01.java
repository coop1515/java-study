package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요.");
		int num = scanner.nextInt();
		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		for (int i = 0; i < MONEYS.length; i++) {
			int num1 = num / MONEYS[i];
			num = num % MONEYS[i];
			System.out.println(num1);
		}
		/* 코드 작성 */

		scanner.close();
	}
}