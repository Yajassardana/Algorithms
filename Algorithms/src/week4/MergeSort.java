package week4;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] c = {5,4,2,1,3,6,7,8};
		System.out.println(Arrays.toString(mergeSort(c,0,7)));
	}
//
	public static int[] mergeSort(int[] a,int low,int high) {
		if(high<=low) {
			int[]bc = new int[1];
			bc[0] = a[low];
			return bc;	
		}
		    
			
		int b[] = mergeSort(a,low,(low+high)/2);
		int c[] = mergeSort(a,((low+high)/2)+1,high);
		int[]merged = merge(b,c);
		return merged;
		

	}
 
	public static int []merge(int[]b,int[]c) {
		int [] merged = new int[b.length+c.length];
		int i,j,k=0;
		for( i=0,j=0;i<b.length&&j<c.length;) {
			if(b[i]<=c[j])
				{merged[k]=b[i];
				  i++;
				}
			else
				{merged[k]=c[j];
				  j++;
				}
			k++;
		}

//		if(i==b.length) {
//			for(;j<c.length;j++) {
//				merged[k]=c[j];
//				k++;
//			}
//				
//		}
//		else if(j==c.length) {
//			for(;i<b.length;i++) {
//				merged[k]=b[i];
//				k++;
//			}
//				
//		}
		  while (i < b.length) 
	        { 
	            merged[k] = b[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < c.length) 
	        { 
	            merged[k] = c[j]; 
	            j++; 
	            k++; 
	        
		
	}
	        return merged;
}
}
