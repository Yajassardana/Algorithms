//package week1;

import java.io.*;
import java.util.*;

public class pairWiseProduct {

	public static void main(String[] args) {
		FastScanner s = new FastScanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i<n;i++) {
			arr[i] = s.nextInt();
		}
		long max,smax;
		if(arr[0]>arr[1]) {
			max = arr[0];
			smax =arr[1];
		}
		else {
			max=arr[1];
		    smax=arr[0];
		}
	  for(int i=2;i<n;i++) {
		  if(arr[i]>max) {
			  smax=max;
			  max=arr[i];
		  }
		  else if(arr[i]>smax) {
			  smax=arr[i];
		  }
	  }
	  long prod = max*smax;
	  System.out.println(prod);
	}

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
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
