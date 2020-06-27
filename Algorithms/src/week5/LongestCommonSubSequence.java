package week5;

import java.util.Scanner;

public class LongestCommonSubSequence {


    private static int lcs2(int[] s, int[] t) {
        //Write your code here
        
        int [][]dpTable = new int [s.length+1][t.length+1];
	    int match=0,misMatch=0,ins=0,del=0;
	    for(int i = 1;i<=s.length;i++) {
	    	for(int j=1;j<=t.length;j++) {
	    		ins = dpTable[i][j-1];
	    		del = dpTable[i-1][j];
	    		match = dpTable[i-1][j-1]+1;
	    		misMatch = dpTable[i-1][j-1];
	    		if(s[i-1]==t[j-1]) {
	    			dpTable[i][j]=Math.max(ins, Math.max(match, del));
	    		}
	    		else {
	    			dpTable[i][j] = Math.max(ins,Math.max(misMatch, del));
	    		}
	    	}
	    }
	    return dpTable[s.length][t.length];
        
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println(lcs2(a, b));
    }
}
