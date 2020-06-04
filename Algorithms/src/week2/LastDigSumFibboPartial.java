package week2;

import java.util.Scanner;

public class LastDigSumFibboPartial {
	 private static int getFibonacciSumLastDigitPartial(long n) {
		    int a=0,b=1,c=0,sum=0,leftDig=0;
		    long pasino = n%60;
		    	for (int i = 1; i <=60; i++) {
						sum = (sum+b)%10;
		        if(i==pasino) {
		        	leftDig=sum;
		        }
				c=(a+b)%10;
				a=b;
				b=c;
			}
		    	return (sum+leftDig)%10;
		    }
		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        long m = scanner.nextLong();
		        long n = scanner.nextLong();
		        int sum1 = getFibonacciSumLastDigitPartial(m-1);
		        int sum2 = getFibonacciSumLastDigitPartial(n);
		        int result  = (10+sum2-sum1)%10;//adding 10 if value is negatice and modulo 10 for if value is positive
		        System.out.println(result);//sum upo n minus sum upto m-1 will give sum of interval m,n
		    }
	
}
