package prob04;
import java.util.Arrays;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] a = str.toCharArray();
		char[] b = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			b[i] = a[str.length()-i-1];
		}
		System.out.println(Arrays.toString(b));
		return b;
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
			System.out.println(array);
	}
}