package week3;

import java.util.Arrays;
import java.util.Scanner;

public class carRefuel {

	static int computeMinRefills(int dist, int tank, int[] stops) {
		int refills = 0, prevRefill = 0;
		int[] newStops = new int[stops.length + 2];
		int i = 0;
		for (i = 1; i <= stops.length; i++) {
			newStops[i] = stops[i-1];
		}
		newStops[i] = dist;
//		System.out.println(Arrays.toString(newStops));
		i = 0;
		while (i<newStops.length-1) {
			prevRefill=i;
		    while(i<newStops.length-1&&newStops[i+1]-newStops[prevRefill]<=tank)
		    	i+=1;
		if(i==prevRefill) {
			return -1;
		}
		  if(i<newStops.length-1)
			 refills+=1; 
		}
		return refills;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dist = scanner.nextInt();
		int tank = scanner.nextInt();
		int n = scanner.nextInt();
		int stops[] = new int[n];
		for (int i = 0; i < n; i++) {
			stops[i] = scanner.nextInt();
		}

		System.out.println(computeMinRefills(dist, tank, stops));
	}
}
