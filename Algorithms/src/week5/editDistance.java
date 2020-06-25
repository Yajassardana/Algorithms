package week5;

import java.util.Scanner;

public class editDistance {
	  public static int EditDistance(String s, String t) {
		    int [][]dpTable = new int [s.length()+1][t.length()+1];
		    int match=0,misMatch=0,ins=0,del=0;
//		    int i=0,j=0;
		    for(int i=0;i<=s.length();i++) {
		    	dpTable[i][0]=i;
		    }
		    for(int j=0;j<=t.length();j++) {
		    	dpTable[0][j]=j;
		    }

		    for(int i = 1;i<=s.length();i++) {
		    	for(int j=1;j<=t.length();j++) {
		    		ins = dpTable[i][j-1]+1;
		    		del = dpTable[i-1][j]+1;
		    		match = dpTable[i-1][j-1];
		    		misMatch = dpTable[i-1][j-1]+1;
		    		if(s.charAt(i-1)==t.charAt(j-1)) {
		    			dpTable[i][j]=Math.min(ins, Math.min(match, del));
		    		}
		    		else {
		    			dpTable[i][j] = Math.min(ins,Math.min(misMatch, del));
		    		}
		    	}
		    }
		    return dpTable[s.length()][t.length()];
		  }
		  public static void main(String args[]) {
		    Scanner scan = new Scanner(System.in);
		    String s = scan.next();
		    String t = scan.next();
		    System.out.println(EditDistance(s, t));
		  }

}
