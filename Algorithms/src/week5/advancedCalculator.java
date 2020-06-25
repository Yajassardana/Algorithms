package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class advancedCalculator {

    private static List<Integer> optimal_sequence(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        int minMoves[] = new int [n+1]; 
        minMoves[1]=0;
        minMoves[0]=0;
        int moves [] = {1,2,3};
        for(int i=2;i<=n;i++) {
        	minMoves[i]= Integer.MAX_VALUE;
        	for(int j:moves) {
        		if(i>=j) {
        			if(j==1)
        			{
        				int minMov = minMoves[i-j]+1;
        				if(minMov<minMoves[i]) {
            				minMoves[i]=minMov;

            			}
        			}
        			else {
        				if(i%j==0) {
        					int minMov = minMoves[i/j]+1;
        					if(minMov<minMoves[i]) {
                				minMoves[i]=minMov;
                			}
        				}
        			}
        			
        		}
        	}
        }
        int count = minMoves[n]-1;
        sequence.add(n);
        int prevIndex = n;
       	for(int i=n;i>=0;i--) {
       		if(minMoves[i]==count) {
       			if((i==prevIndex-1||(i==prevIndex/2)&&prevIndex%2==0)||(i==prevIndex/3&&prevIndex%3==0)) {
           			sequence.add(i);
           			count=count-1;
           			prevIndex = i;
       			}

       		}
    	}

        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}
