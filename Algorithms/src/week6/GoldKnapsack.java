//package week6;

import java.util.Scanner;

public class GoldKnapsack {

	   static int optimalWeight(int W, int[] w) {
	        int result = 0;
	        int dpTable[][] = new int [w.length+1][W+1];
	        for(int i = 1;i<=w.length;i++) {
	        	for(int j = 1; j<=W;j++) {
	        		int max = dpTable[i-1][j];
	        		int elementWt = w[i-1];
	        		if(elementWt<=j) {
	        			max = Math.max(max,(w[i-1]+dpTable[i-1][j-elementWt])); 
	        		}
	        		dpTable[i][j]=max;
	        	}
	        }
	        return dpTable[w.length][W];
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int W, n;
	        W = scanner.nextInt();
	        n = scanner.nextInt();
	        int[] w = new int[n];
	        for (int i = 0; i < n; i++) {
	            w[i] = scanner.nextInt();
	        }
	        System.out.println(optimalWeight(W, w));
	    }
}
