package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String stringPlus = "";
		for(int i =0; i< strArr.length; i++) {
			stringPlus += strArr[i];
		}
		return stringPlus;
	}
}
