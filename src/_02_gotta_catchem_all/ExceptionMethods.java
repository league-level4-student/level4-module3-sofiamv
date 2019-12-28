package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static double Divide(double a, double b) throws IllegalArgumentException {
		double c = a/b;
		if(b == 0.0) {
			throw new IllegalArgumentException();
		}
		return c;
	}
	public static String ReverseString(String gahhh) throws IllegalStateException{
		String b = "";
		for(int i = gahhh.length()-1; i == 0; i--) {
			b = b + gahhh.charAt(i);
		}
		if(gahhh == "") {
			throw new IllegalStateException();
		}
		return b;
	}
}
