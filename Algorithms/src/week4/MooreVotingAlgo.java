package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class MooreVotingAlgo {
	public static boolean checkMajority(int[] a,int l,int r,int num) {
		int count = 0;
		for(int i=l;i<=r;i++) {
			if(a[i]==num)
				count++;
		}
		return count>(r-l+1)/2;
		
	}

	 private static int getMajorityElementMoore(int[] a, int l, int r) {
	     int temp,tempCount=1;
	     temp=a[l];
		 for(int i=l+1;i<=r;i++) {
			 if(a[i] != temp ) {
				 tempCount--;
				 if(tempCount==0) {
					 temp = a[i];
					 tempCount++;
				 }
			 }
			 else {
				 tempCount++;
			 }
		 }
		 if(tempCount>0) {
			 return checkMajority(a,l,r,temp)?temp:-1;
		 }
		 return -1;
	       
	    }

	    public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        if(getMajorityElementMoore(a, 0, a.length-1)!=-1)
	        	System.out.println(1);
	        else
	        	System.out.println(0);
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
