package week3;

import java.util.Arrays;
import java.util.Scanner;

public class MaxLootKnapSack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        float [] ratios = new float[values.length];
        for(int i=0;i<values.length;i++) {
        	ratios[i] = (float) values[i]/weights[i]; 
        }
        Arrays.parallelSort(ratios);
        for(int i=0;i<values.length;i++) {
        	if(capacity==0)
        		{break;}
        	int a = Math.min(weights[i], capacity);
        	value += a*values[i];
        	capacity-=a;
        }

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }

}
