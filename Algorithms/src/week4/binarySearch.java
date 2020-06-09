package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binarySearch {

	  static int binarySearch(int[] a, int l,int r,int x) {
	        if(r<l)
	        	return -1;
	        int m = l+ (r-l)/2;
	        if(a[m]==x)
	        	return m;
	        else if(a[m]<x)
	        	return binarySearch(a,m+1,r,x);
	        else
	        	return binarySearch(a,l,m-1,x);
	       }

//	    static int linearSearch(int[] a, int x) {
//	        for (int i = 0; i < a.length; i++) {
//	            if (a[i] == x) return i;
//	        }
//	        return -1;
//	    }

	    public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
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
	        for (int i = 0; i < m; i++) {
	            System.out.print(binarySearch(a,0,n-1,b[i])+" ");
	            
	        }
	    }
	    static class FastScanner {
	        BufferedReader br;
	        StringTokenizer st;

	        FastScanner(InputStream stream) {
	            try {
	                br = new BufferedReader(new InputStreamReader(stream));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	    }

}
