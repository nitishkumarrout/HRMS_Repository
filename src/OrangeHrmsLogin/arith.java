package OrangeHrmsLogin;

public class arith {
	public static void main(String[] args) {
		int a=10;
		int b;
		try {
		b=a%0;
		System.out.println("b"+b);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
