package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class majorityElement {

	public static int count(int[]a,int l,int r,int num) {
		int count=0;
		for(int i = l;i<=r;i++) {
			if(a[i]==num)
				count++;
		}
		return count;
		
	}
	 private static int getMajorityElement(int[] a, int l, int r) {
	        if (r<l) {
	            return -1;
	        }
	        if(r==l)
	        	return a[l];
	        int mid = l + (r-l)/2;
	        int left = getMajorityElement(a,l,mid);
	        int right = getMajorityElement(a,mid+1,r);
	        if(left==right)
	        	return left;
	        
	        int leftCount = count(a,l,r,left);
	        int rightCount = count(a,l,r,right);
	        return leftCount>rightCount&&leftCount>(r-l+1)/2?left:(rightCount>(r-l+1)/2?right:-1);
	        //write your code here
	    }

	    public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        if (getMajorityElement(a, 0, a.length-1) != -1) {
	            System.out.println(1);
	        } else {
	            System.out.println(0);
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
