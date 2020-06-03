package week2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextInt();
		long b = s.nextInt();
		long lcm = 0;
		if (a > b) {
			lcm = a * b / gcd(a, b);
		} else {
			lcm = a * b / gcd(b, a);
		}
		System.out.println(lcm);
	}

	public static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

}
