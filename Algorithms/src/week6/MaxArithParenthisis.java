package week6;

import java.util.Scanner;

public class MaxArithParenthisis {

	private static long getMaximValue(String exp) {
		long[][] dpTableMin = new long[(exp.length() + 3) / 2][(exp.length() + 3) / 2];
		long[][] dpTableMax = new long[(exp.length() + 3) / 2][(exp.length() + 3) / 2];
		for (int i = 1; i < (exp.length() + 3) / 2; i++) {
			dpTableMin[i][i] = Long.parseLong(exp.substring(2 * (i - 1), 2 * (i - 1) + 1));
			dpTableMax[i][i] = Long.parseLong(exp.substring(2 * (i - 1), 2 * (i - 1) + 1));
		}
		for (int s = 1; s < (exp.length() + 3) / 2; s++) {
			for (int i = 1; i < ((exp.length() + 3) / 2) - s; i++) {
				long MinMax[] = minMax(i, i + s, dpTableMin, dpTableMax, exp);
				dpTableMin[i][i + s] = MinMax[0];
				dpTableMax[i][i + s] = MinMax[1];

			}
		}
		return dpTableMax[1][(exp.length() + 1) / 2];
	}

	private static long[] minMax(int i, int j, long[][] dpTableMin, long dpTableMax[][], String exp) {
		long MinMax[] = new long[2];
		long max = Long.MIN_VALUE;
		long min = Long.MAX_VALUE;
		for (int k = i; k <= j - 1; k++) {
			long a = eval(dpTableMax[i][k], dpTableMax[k + 1][j], exp.charAt(2 * k - 1));
			long b = eval(dpTableMax[i][k], dpTableMin[k + 1][j], exp.charAt(2 * k - 1));
			long c = eval(dpTableMin[i][k], dpTableMax[k + 1][j], exp.charAt(2 * k - 1));
			long d = eval(dpTableMin[i][k], dpTableMin[k + 1][j], exp.charAt(2 * k - 1));
			min = Math.min(Math.min(min, Math.min(a, b)), Math.min(c, d));
			max = Math.max(Math.max(max, Math.max(a, b)), Math.max(c, d));
		}
		MinMax[0] = min;
		MinMax[1] = max;
		return MinMax;

	}

	private static long eval(long a, long b, char op) {
		if (op == '+') {
			return a + b;
		} else if (op == '-') {
			return a - b;
		} else if (op == '*') {
			return a * b;
		} else {
			assert false;
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.next();
		System.out.println(getMaximValue(exp));
	}

}
