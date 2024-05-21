package com.PatternsProblems;

public class Pyramid {

	public static void main(String[] args) {

		int row=5;
		for(int i=1;i<=row;i++) {
			
			//spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			
			//numbers
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
