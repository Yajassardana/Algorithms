package week3;
//
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSalary_maxNumber {

	private static String largestNumber(String[] a) {
		String result = "";
		ArrayList<String> compare = new ArrayList<String>();
		for(String temp:a) {
			compare.add(temp);
		}
		while(compare.size()>0) {
			String max = compare.get(0);
			for(String temp:compare) {
				if(max.compareTo(temp)!=0&&Compare(temp,max))
					{
					max=temp;
					}
			}
			
			result+=max;
			compare.remove(compare.indexOf(max));
		}
		int j;
		for( j=0;j<result.length()-1;j++) {
			if(result.charAt(j)!='0'){
				break;
			}
		}
        
        return result.substring(j);
    }
	private static boolean Compare(String s1, String s2) {
		String s1Temp = s1+s2;
		String s2Temp = s2+s1;
		int s1T = Integer.parseInt(s1Temp);
		int s2T = Integer.parseInt(s2Temp);
		return s1T>s2T;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
        System.out.println(largestNumber(a));
    }
}
