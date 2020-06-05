package week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MaxAddDotProduct {

    private static long maxDotProduct(Integer[] a, Integer[] b) {
    
    	Arrays.sort(a,Collections.reverseOrder());
    	Arrays.sort(b,Collections.reverseOrder());
        long result = 0;
        for (int i = 0; i < a.length; i++) {
        	if((a[i]>0&&b[i]>0)||(a[i]<0&&b[i]<0))
            result = (long)(result+((long)a[i] * b[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        System.out.println(maxDotProduct(a, b));
     
}
}
