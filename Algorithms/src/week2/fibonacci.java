package week2;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	     double[] arr = new double[n+1];
		System.out.println(fib(n,arr));

	}
	
	public static double fib(int n,  double arr[]) {
		if(n<=1) {
			return n;
		}
		if(arr[n]!=0) {
			return arr[n];
		}
		arr[n] = fib(n-1,arr)+fib(n-2,arr);
		
		return arr[n];
	}

}
