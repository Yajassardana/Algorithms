//package week4;

import java.util.Scanner;

public class InversionsFinal {
	public static int[] subArray(int[]arr,int l,int r) {
		int[]subArr = new int[r-l+1];
//		System.out.println("length is"+ subArr.length);
		for(int i=0;i<r-l+1;i++) {
			subArr[i]=arr[l+i];
		}
		return subArr;
	}
	 public static long mergeAndCount(int a[],int left,int right,int mid) {
			int i,j,k=left,swaps=0;
//			System.out.println("k is "+k);
			int [] b =subArray(a,left,mid);
			int [] c =subArray(a,mid+1,right);
			for( i=0,j=0;i<b.length&&j<c.length;) {
				if(b[i]<=c[j])
				{a[k]=b[i];
				  i++;
				}
			else
				{a[k]=c[j];
				  j++;
				  swaps+=b.length-i;
				}
			k++;
//			System.out.print(k+" ");
			}
			  while (i < b.length) 
		        {  
				  a[k]=b[i];
		            i++; 
		            k++;
		           
		        } 
		  
		        /* Copy remaining elements of R[] if any */
		        while (j < c.length) 
		        {
		        	a[k]=c[j];
		        	k++;
		            j++;		
		}
		        return swaps;
	}
	 private static long getNumberOfInversions(int[] a, int left, int right) {
	        long numberOfInversions = 0;
	        if (right <=left ) {
	            return numberOfInversions;
	        }
	        int ave = (right+left)/2;
	        numberOfInversions += getNumberOfInversions(a,left, ave);
	        numberOfInversions += getNumberOfInversions(a,ave+1, right);
	        numberOfInversions +=mergeAndCount(a,left,right,ave);
	        return numberOfInversions;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = scanner.nextInt();
	        }
	        int[] b = new int[n];
	        System.out.println(getNumberOfInversions(a, 0, n-1));
	    }
}
