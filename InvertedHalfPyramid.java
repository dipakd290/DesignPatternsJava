package com.PatternsProblems;

public class InvertedHalfPyramid {

	public static void main(String[] args) {
		
		
		//invert the outer loop condition
		//start loop from num (m) to 1
		int m=5;
		for(int i=m;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
