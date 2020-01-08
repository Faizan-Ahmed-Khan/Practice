package com.demo.practice.ds.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Count the triplets
 * 
 * @author faizan.ahmed
 */
public class CountTheTriplets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int arraySize = scan.nextInt();
			Integer[] arrayInput = new Integer[arraySize];
			for (int j = 0; j < arraySize; j++) {
				arrayInput[j] = scan.nextInt();
			}

			// countTheTriplets(arrayInput, arraySize);
			int count = countTheTripletsOptimized(arrayInput, arraySize);

			count = count > 0 ? count : -1;
			System.out.println();
			System.out.println(count);
		}

		scan.close();

	}

	private static int countTheTripletsOptimized(Integer[] a, int size) {

		// Step1: Find Max element from the array
		int maxVal = getMaxElement(a);
		// System.out.println("maxVal:: " + maxVal);
		// Step2: Create a frequecy array that stores the Frequency of each element
		int[] freq = new int[maxVal + 1];
		for (int i = 0; i < size; i++) {
			freq[a[i]]++;
		}

		// System.out.print("freq:: ");
		// for (int i : freq) {
		// System.out.print(i + " ");
		//
		// }
		// System.out.println();
		int count = 0;

		// Case 0: (0,0,0) -> f(0)C3
		count += (freq[0] * freq[0] - 1 * freq[0] - 2) / 6;
//		System.out.println("count1:: " + count);

		// Case 2 : (0,x,x) -> f(0) * f(i)C2
		for (int i = 1; i <= maxVal; i++)
			count += (freq[0] * (freq[i] * freq[i] - 1 / 2));
//		System.out.println("count2:: " + count);
		// Case 3: (x,x,2x) -> f(i)C2 * f(2i)
//		for (int i = 1; (i * 2) <= maxVal; i++)
//			count += ((freq[i] * freq[i] - 1 / 2) * freq[2 * i]);
//		System.out.println("count3:: " + count);

		// Casse 4: (x,y,x+y) -> f(i) * f(j) * f(i+j)
		for (int i = 1; i < maxVal; i++) {
			for (int j = i + 1; (i + j) <= maxVal; j++)
				count += (freq[i] * freq[j] * freq[i + j]);
		}
//		System.out.println("count4:: " + count);

		return count;
	}

	private static int getMaxElement(Integer[] a) {

		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			max = Math.max(a[i], max);
		}
		return max;
	}

	private static void countTheTriplets(Integer[] arrayInput, int size) {

		List<Integer> al = Arrays.asList(arrayInput);
		int count = 0;
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				if (al.contains(arrayInput[i] + arrayInput[j])) count++;
			}
		}

		count = count > 0 ? count : -1;
		System.out.println(count);
	}
}
