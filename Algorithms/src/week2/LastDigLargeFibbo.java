package week2;

import java.util.*;

public class LastDigLargeFibbo {
    private static int getFibonacciLastDigitNaive(int n) {
    int a=0,b=1,c=0;
    int pasino = n%60;
    	for (int i = 1; i <=pasino; i++) {
		c=(a+b)%10;
		a=b%10;
		b=c%10;
	}
    	return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}


