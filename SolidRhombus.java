package com.PatternsProblems;

public class SolidRhombus {

	public static void main(String[] args) {
		int row=5;
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=row;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
 