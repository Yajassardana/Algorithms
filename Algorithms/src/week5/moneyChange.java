package week5;

import java.util.Scanner;

public class moneyChange {

    private static int getChange(int m) {
        int minMoney[] = new int [m+1]; 
        minMoney[0]=0;
        int coins [] = {1,3,4};
        for(int i=1;i<=m;i++) {
        	minMoney[i]= Integer.MAX_VALUE;
        	for(int j:coins) {
        		if(i>=j) {
        			int minMon = minMoney[i-j]+1;
        			if(minMon<minMoney[i]) {
        				minMoney[i]=minMon;
        			}
        		}
        	}
        }
        return minMoney[m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }

}
