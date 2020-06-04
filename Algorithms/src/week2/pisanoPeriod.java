package week2;

import java.util.Scanner;

public class pisanoPeriod {

	public static long PisanoPeriod(long n,int m) {
		if(n==0||n==1)
			return n%m;
		int a=1,b=1,c=0,period=1;
		for (int i = 1; i<=m*m; i++) {
			c=(a+b)%m;
			a=b;
			b=c;
			if(a==0&&b==1) {
				System.out.println("done");
				period = i;
				break;
			}
		}
		long pasino = n % period;
		a=0;
		b=1;
		c=1;
		for (int i = 1; i<pasino; i++) {
			c=(a+b)%m;
			a=b;
			b=c;
			
		}
		return b%m;
	}
	public static void main(String[] args) {
	     Scanner s = new Scanner(System.in);
	     long n = s.nextLong();
	     int m = s.nextInt();
	     System.out.println(PisanoPeriod(n,m));
	}
	

}
