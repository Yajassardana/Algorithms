package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class ImprovedQuicksort {

	public static void main(String[] args) {
		FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        quickSort(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	}
	public static void quickSort(int []a,int l,int r) {
		if(l>=r)
			return;
		Random rand = new Random();
		int k = l+ rand.nextInt(r-l);
		int temp = a[k];
		a[k] = a[l];
		a[l]=temp;
		int []m = partition(a,l,r);
		quickSort(a,m[1]+1,r);
		quickSort(a,l,m[0]-1);
	}

	public static int [] partition(int[]a,int l,int r) {
		int j = l;
		int k = 0;
		int pivot =a[l];
		int temp;
		for(int i=j+1;i<=r;i++) {
			if(a[i]<pivot) {
				j++;
				 temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				if(a[i]==pivot) {
					k++;
					temp = a[i];
					a[i] = a[k+j];
					a[k+j] = temp;
				}
			}
			else if(a[i]==pivot) {
				k++;
				temp = a[i];
				a[i] = a[j+k];
				a[j+k] = temp;
				
			}
		}
		temp = a[l];
		a[l] = a[j];
		a[j] = temp;
		int [] pivots = {j,j+k};
		return pivots;
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
