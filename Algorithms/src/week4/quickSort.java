package week4;

import java.util.Arrays;
import java.util.Random;

public class quickSort {

	public static void main(String[] args) {
		int[] c = { 5, 4, 2, 1, 8, 6, 7, 8 };
		quickSort(c, 0, 7);
		System.out.println(Arrays.toString(c));
	}

//
	public static void quickSort(int[] a, int l, int r) {
		if (l >= r)
			return;
		Random rand = new Random();
		int k = l+rand.nextInt(r-l);//selecting random pivot index
		int temp = a[l];
		a[l]=a[k];
		a[k]=temp;// swapping to make random opivot index element the current pivot
		int m = partition(a, l, r);
		quickSort(a, l, m - 1);
		quickSort(a, m + 1, r);
	}

	public static int partition(int[] a, int l, int r) {
		int j=l;
		int pivot=a[l];
		for(int i=l+1;i<=r;i++) {
			if(a[i]<=pivot) {
				j+=1;
				int temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}	
		}
		int temp = a[j];
		a[j]=a[l];
		a[l]=temp;
		return j;
	}
	
}