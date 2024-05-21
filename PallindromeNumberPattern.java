package com.PatternsProblems;

public class PallindromeNumberPattern {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+ " ");
			}
			
			for(int j=2;j<=i;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
