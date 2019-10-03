package com.demo.practice.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size = scan.nextInt();
		System.out.println("Enter " + size + " numbers  in sorted order");
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			al.add(scan.nextInt());
		}
		System.out.println("Elements in List are:: " + al);
		System.out.println("Enter the Key to be searched");
		int key = scan.nextInt();

		// recursive
		binarySearch(al, key, 0, size - 1);
		scan.close();
	}

	/**
	 * Recursive Demo
	 * note:: list.subList - Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex Sample
	 * input:: 2,5,8,12,16,23,38,56,72,91
	 * 
	 * @param list
	 * @param key
	 * @param lowIndex
	 * @param highIndex,
	 */
	private static void binarySearch(List<Integer> al, int key, int lowIndex, int highIndex) {

		int midIndex = lowIndex + highIndex / 2;
		int mid = al.get(midIndex);

		System.out.println("--------------------");
		List<Integer> firstPart = al.subList(lowIndex, midIndex);
		List<Integer> secondPart = al.subList(midIndex + 1, al.size());
		System.out.println("First part:: " + firstPart);
		System.out.println("Second part:: " + secondPart);
		System.out.println("mid:: " + mid);
		System.out.println("key:: " + key);
		if (key == mid)
			System.out.println("Found");
		else if (key < mid && !firstPart.isEmpty()) {
			System.out.println("key < mid");
			binarySearch(firstPart, key, 0, midIndex);
		} else if (key > mid && !secondPart.isEmpty()) {
			System.out.println("key > mid");
			binarySearch(secondPart, key, 0, secondPart.size() - 1);
		} else
			System.out.println("Not Found");
	}
}
