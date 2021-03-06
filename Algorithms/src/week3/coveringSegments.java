package week3;

import java.util.Arrays;
import java.util.Scanner;

public class coveringSegments {

	 private static int[] optimalPoints(Segment[] segments) {
	      
		   Arrays.sort(segments);
//		   System.out.println(Arrays.toString(segments));
	        int[] points = new int[segments.length];
	        int point = segments[0].end;
	        points[0]=point;
	        for (int i = 1,j=1; i < segments.length; i++) {
	            if(point>segments[i].end||point<segments[i].start) {
	            	point=segments[i].end;
	            points[j]=point;
	            j++;
	            	
	            }
	        }
	        return points;
	    }

	  public static class Segment implements Comparable<Segment> {
	        int start, end;

	        Segment(int start, int end) {
	            this.start = start;
	            this.end = end;
	        }

			@Override
			public int compareTo(Segment o) {
				return this.end-o.end;
			}
//			public String toString() {
//			    return String.format("(%d, %d)", start, end);
//			}
			
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        Segment[] segments = new Segment[n];
	        for (int i = 0; i < n; i++) {
	            int start, end;
	            start = scanner.nextInt();
	            end = scanner.nextInt();
	            segments[i] = new Segment(start, end);
	        }
	        int[] points = optimalPoints(segments);
	        int totalPoints = 0;
	        for (int point : points) {
	        	if(point!=0) {
	        		   
	        		   totalPoints++;
	        	}
	         
	        }
	        System.out.println(totalPoints);
	        for (int point : points) {
	        	if(point!=0) {
	        		   System.out.print(point+" ");
	        	}
	         
	        }
	    }

}
