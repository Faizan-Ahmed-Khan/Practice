package com.demo.practice.algorithms.sort;

import java.util.Scanner;

public class QuickSortDemo {

	public static void main(String[] args) {

		System.out.println("-----QUICKSORT-----");
		System.out.print("Enter the size of input :: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Integer[] unsortedArray = new Integer[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			unsortedArray[i] = scan.nextInt();
		}
		scan.close();

		quickSort(unsortedArray, 0, n - 1);

		for (Integer a : unsortedArray) {
			System.out.print(a + ",");
		}
	}

	private static void quickSort(Integer[] a, int low, int high) {

		if (low < high) {
			int j = partition(a, low, high);
			quickSort(a, low, j);
			quickSort(a, j + 1, high);
		}
	}

	private static int partition(Integer[] a, int low, int high) {

		// Select mid element as pivot element
		int pivot = a[low];
		System.out.println("pivot:: " + pivot);

		// find the correct position of pivot element
		int i = low;
		int j = high;

		while (i < j) {
			while (a[i] <= pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i < j) {
				// swap a[i],a[j]
				swap(a, i, j);
			}
		}
		// swap a[j],a[low]
		swap(a, low, j);

		return j;
	}

	private static void swap(Integer[] a, int i, int j) {

		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;

	}

}
