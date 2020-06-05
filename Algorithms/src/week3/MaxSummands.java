package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSummands {

	 private static List<Integer> optimalSummands(int n) {
	        List<Integer> summands = new ArrayList<Integer>();
	        int i=1,sum=0,sum1=0,sum2=0;
	        for(i=1;true;i++) {
	        	sum2=sum1;
	        	sum1=sum;
	        	sum+=i;
	        	if(sum>=n)
	        		break;
	        }
	        if(sum==n)
	        	for(int j=1;j<=i;j++){
	        	 summands.add(j);
	        	}
	        else {
		       for(int j=1;j<=i-2;j++)
		    	   summands.add(j);
		       summands.add(n-sum2);
			}
	        
	        
	        return summands;
	    }
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        List<Integer> summands = optimalSummands(n);
	        System.out.println(summands.size());
	        for (Integer summand : summands) {
	            System.out.print(summand + " ");
	        }
	    }

}
