package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		/* 코드 작성 */
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		
			int num2 = 0;
			if (num % 2 == 0)
			{
				for (int i =0; i<=num; i++)
				{
				if(i%2 == 0)
				{
					
					num2 = i + num2;
				}
				
				}
				System.out.println(num2);
			}
			
			else
			{
				for (int i =0; i<=num; i++)
				{
				if(i%2 == 1)
				{
					
					num2 = i + num2;
				}
				
				}
				System.out.println(num2);
				
			}
			
		
		scanner.close();
	}
}
