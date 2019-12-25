package com.demo.practice.ds.arrays;

import java.util.Scanner;

/**
 * Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
 * 
 * @author faizan.ahmed
 */
class SubArrayWithGivenSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int arraySize = scan.nextInt();
			int key = scan.nextInt();
			int[] arrayInput = new int[arraySize];
			for (int j = 0; j < arraySize; j++) {
				arrayInput[j] = scan.nextInt();
			}

			if (!findIndex(arrayInput, key)) {
				System.out.println(-1);
			}
		}

		scan.close();

	}

	private static boolean findIndex(int[] inputArr, int key) {

		int startPos = 0;
		for (int i = 0; i < inputArr.length; i++) {
			int sum = 0;
			startPos = i;

			while (sum < key && startPos < inputArr.length) {
				sum += inputArr[startPos];
				startPos++;
				if (sum == key) {
					System.out.println((i + 1) + " " + startPos);
					return true;
				}
			}
		}
		return false;
	}
}
