package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSummandsIdealSolution {
	private static List<Integer> optimalSummands(int n) {
        List<Integer> summands = new ArrayList<Integer>();
        for(int i=1;n>0;i++) {
        	if(n<=2*i)
        	{
        		summands.add(n);
        		n-=n;
        	}
        	else {
				summands.add(i);
				n-=i;
			}
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
