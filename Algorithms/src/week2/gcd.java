package week2;

public class gcd {

	public static void main(String[] args) {
		System.out.println(gcd(5000,4000));
	}
	public static double gcd(double a, double b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

}
