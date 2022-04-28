package chapter03;

public class ArrayUtil {

	public static double[] intToDouble(int[] a) {
		double[] result = new double[a.length];
		for(int i=0; i< a.length; i++)
		{
			result[i] = a[i];
		}
		return result;
	}

	public static int[] DoubleToint(double[] a) {
		int[] result = new int[a.length];
		for(int i=0; i< a.length; i++) {
			result[i] = (int)a[i];
		}
		return result;
	}

	public static int[] concat(int[] a, int[] b) {
		int leng = a.length + b.length;
		int[] result = new int[leng];
		for (int i=0; i < a.length; i++) {
			result[i] = a[i];
			result[i+a.length] = b[i];
		}
		
		return result;
	}

}
