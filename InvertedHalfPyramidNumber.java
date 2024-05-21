package com.PatternsProblems;

public class InvertedHalfPyramidNumber {

	public static void main(String[] args) {
		
		
		//j<=n-i+1
		int n=5;
		for(int i=1;i<=n;i++) {    //1 to n
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
