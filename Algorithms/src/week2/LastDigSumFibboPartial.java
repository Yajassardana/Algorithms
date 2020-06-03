package week2;

import java.util.Scanner;

public class LastDigSumFibboPartial {
	 private static int getFibonacciSumLastDigitPartial(long m,long n) {
		    int a=0,b=1,c=0,sum=0;
		    	for (int i = 1; i <=n; i++) {
		    		if(i>=m) {
						sum = (sum+b)%10;
					}
				c=(a+b)%10;
				a=b;
				b=c;
			}
		    	return sum;
		    }
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        long m = scanner.nextLong();
		        long n = scanner.nextLong();
		        int c = getFibonacciSumLastDigitPartial(m,n);
		        System.out.println(c);
		    }
	
}
