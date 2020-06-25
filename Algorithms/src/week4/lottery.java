package week4;

import java.util.Arrays;
import java.util.Scanner;

public class lottery {
	public static int occurences(int start,int end,int[] points) {
		int mid = 
		while()
		int count =  0;
		return count;
	}

	  private static int[] fastCountSegments(int[] starts, int[] ends,int l,int r, int[] points) {
	        int[] cnt = new int[points.length]; 
	        Arrays.sort(points);
	        for (int i = 0; i < points.length; i++) {
	            for (int j = 0; j < starts.length; j++) {
	                if (starts[j] <= points[i] && points[i] <= ends[j]) {
	                    cnt[i]++;
	                }
	            }
	        }
	        return cnt;
	    }

	    public static int[] naiveCountSegments(int[] starts, int[] ends, int[] points) {
	        int[] cnt = new int[points.length];
	        for (int i = 0; i < points.length; i++) {
	            for (int j = 0; j < starts.length; j++) {
	                if (starts[j] <= points[i] && points[i] <= ends[j]) {
	                    cnt[i]++;
	                }
	            }
	        }
	        return cnt;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n, m;
	        n = scanner.nextInt();
	        m = scanner.nextInt();
	        int[] starts = new int[n];
	        int[] ends = new int[n];
	        int[] points = new int[m];
	        for (int i = 0; i < n; i++) {
	            starts[i] = scanner.nextInt();
	            ends[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < m; i++) {
	            points[i] = scanner.nextInt();
	        }
	        //use fastCountSegments
	        int [] cnt = fastCountSegments(starts,ends,0,n-1,points);
	        for (int x : cnt) {
	            System.out.print(x + " ");
	        }
	    }


}
