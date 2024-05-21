package com.PatternsProblems;

public class HalfPyramidNumber {

	public static void main(String[] args) {
		
		//when row is 1 then number 1
		//when row is 2 then numbers 2
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
