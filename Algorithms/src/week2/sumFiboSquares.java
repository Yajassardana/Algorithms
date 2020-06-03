package week2;

import java.util.Scanner;

public class sumFiboSquares {

	 private static int getFibonacciSumLastDigitSquare(long n) {
		    int a=0,b=1,c=0,sum=0,leftDig=0;
		    long pasino =n%60;
		    	for (int i = 1; i <=60; i++) {
				c=(a+b)%10;
				sum = (sum+(b*b))%10;
				if(i==pasino) {
					leftDig=sum;
				}
				a=b;
				b=c;
			}
		    	return (sum+leftDig)%10;
		    }
	 
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        long n = scanner.nextLong();
		        int c = getFibonacciSumLastDigitSquare(n);
		        System.out.println(c);
		    }

}
