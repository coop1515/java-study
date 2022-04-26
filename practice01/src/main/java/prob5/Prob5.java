package prob5;

public class Prob5 {

	public static void main(String[] args) {

		for (int i = 1; i <= 99; i++) {
			String str = Integer.toString(i);
			String[] Array = str.split("");

			for (int j = 0; j < str.length(); j++) {

				int num = Integer.parseInt(Array[j]);
				if (num == 3 || num == 6 || num == 9) {
					System.out.println(i + "짝");
					break;
				}
			}

		}
	}
}