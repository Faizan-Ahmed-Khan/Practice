package com.demo.practice.ds.arrays;

import java.util.Scanner;

public class DutchNationalFlagAlgorithm {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int arraySize = scan.nextInt();
			int[] arrayInput = new int[arraySize];
			for (int j = 0; j < arraySize; j++) {
				arrayInput[j] = scan.nextInt();
			}

			sortArray(arrayInput);
		}

		scan.close();
	}

	private static void sortArray(int[] arrayInput) {

		int low = 0;
		int mid = 0;
		int high = arrayInput.length - 1;
		int temp = 0;
		while (mid <= high) {

			switch (arrayInput[mid]) {
			case 0:
				// swap
				temp = arrayInput[mid];
				arrayInput[mid] = arrayInput[low];
				arrayInput[low] = temp;
				low++;
				mid++;
				break;
			case 1:
				// swap
				mid++;
				break;

			case 2:
				// swap
				temp = arrayInput[mid];
				arrayInput[mid] = arrayInput[high];
				arrayInput[high] = temp;
				high--;
				break;

			default:
				break;
			}
		}

		// Display sorted Array
		for (int i : arrayInput) {
			System.out.print(i + " ");

		}
	}
}
