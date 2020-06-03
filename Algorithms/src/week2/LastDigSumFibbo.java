package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

//import fastScanner.FastScanner;

public class LastDigSumFibbo {
	private static int getFibonacciSumLastDigit(long n) {
		long pasinoN = n % 60;
		int leftDig = 0;
		int a = 0, b = 1, c = 0, sum = 0;
		for (int i = 1; i <= 60; i++) {

			c = (a + b) % 10;
			sum = (sum + b) % 10;
			if (i == pasinoN) {
				leftDig = sum;
			}
			a = b;
			b = c;
		}

		return (sum + leftDig) % 10;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		int c = getFibonacciSumLastDigit(n);
		System.out.println(c);
	}

}
