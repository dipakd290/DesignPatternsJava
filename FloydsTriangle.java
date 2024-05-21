package com.PatternsProblems;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		int row=4;
		int number=0;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+ " ");
				number++;
			}
			System.out.println();
		}

	}

}
