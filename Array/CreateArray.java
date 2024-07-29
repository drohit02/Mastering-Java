package com.Array;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		// way 1 : Assigning Values
		
		int arr [] = {1,3,4,5,6};
		System.out.print("First Array Elements : ");
		for(int element : arr) {
			System.out.print(element+" ");
		}
		
		// way 2 : using loop
		
		System.out.print("\nEnter the size of Array : ");
		int size ;
		Scanner sc = new Scanner(System.in);
		size =sc.nextInt();
		
		int array [] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element "+(i+1)+" : ");
			array[i] = sc.nextInt();
		}
		
		for(int element : array) {
			System.out.print(element+" ");
		}
	}

}
