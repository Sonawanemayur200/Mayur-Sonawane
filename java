package com.arrays.demo;

import java.util.Scanner;

public class MyFirst
 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		System.out.println("Enter " + nums.length + " numbers: ");
		for(int i=0; i<nums.length; i++)
			nums[i] = scan.nextInt();
		
		System.out.println("Enter a number to find:");
		int f = scan.nextInt();
		
		boolean isFound = false;
		
		for(int i=0; i<nums.length; i++) {
			if(f == nums[i]) {
				System.out.println("Found.");
				isFound = true;
				break;
			}
		}
		
		//if(isFound == false)
		if(!isFound)
			System.out.println("Not Found.");
		
		scan.close();

	}

}
