package com.learnings.algorithm.recursive;

public class App {
	
	public static void main(String[] args) {
		
		//Recursive Linear Search
		System.out.println("Index: " + new LinearSearch().searchUsingRecursion(new Object[]{"First", "Second", "Third"}, "First"));
		
		//Recursive Binary Search
		System.out.println("Index: " + new BinarySearch().searchUsingRecursion(new int[] {1, 3, 5, 7, 18, 22, 234, 567, 677, 766, 877, 898, 999, 1000}, 0));
	}
}