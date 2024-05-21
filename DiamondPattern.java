package com.PatternsProblems;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int row=5;
		
		//upper part
		for(int i=1;i<=row;i++) {
			
			//spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			
			//stars  
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//lower part
		for(int i=row-1;i>=1;i--) {
			for(int j=1;j<=row-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
