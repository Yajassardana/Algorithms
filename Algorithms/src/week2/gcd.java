package week2;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a>b)
		System.out.println(gcd(a,b));
		else
			System.out.println(gcd(b,a));
		}
	public static long gcd(long a, long b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}

}
