package week4;

import java.util.Arrays;
 class returnMultiple{
	   int []a;
	   int inv;
	   returnMultiple(int[] arr, int inver){
		   this.a=arr;
		   this.inv = inver;
	   }
}

public class Inversions {



	public static void main(String[] args) {
		int[] c = {1,2,3,5,4};
	mergeSort(c,0,4);
	}
//
	public static returnMultiple mergeSort(int[] a,int low,int high) {
		if(high<=low) {
			int[]bc = new int[1];
			bc[0] = a[low];
			return new returnMultiple(bc,0);	
		}
		    
			
		returnMultiple b = mergeSort(a,low,(low+high)/2);
		int [] bArr = b.a;
//		int bInv = b.inv;
		returnMultiple c = mergeSort(a,((low+high)/2)+1,high);
		int [] cArr = c.a;
//		int cInv = c.inv;
		returnMultiple merged = merge(bArr,cArr);
		
		return merged;
		

	}
 
	public static returnMultiple merge(int[]b,int[]c) {
		int [] merged = new int[b.length+c.length];
		int i,j,k=0,inv=0;
		for( i=0,j=0;i<b.length&&j<c.length;) {
			if(b[i]<=c[j])
				{merged[k]=b[i];
				  i++;
				}
			else
				{merged[k]=c[j];
				  j++;
				  inv++;
				}
			k++;
		}

		  while (i < b.length) 
	        { 
	            merged[k] = b[i]; 
	            i++; 
	            k++; 
	            inv++;
	        } 
	  
	        while (j < c.length) 
	        { 
	            merged[k] = c[j]; 
	            j++; 
	            k++; 
	        
		
	}
	        System.out.println(inv);
	        return new returnMultiple(merged,inv);
}
}
