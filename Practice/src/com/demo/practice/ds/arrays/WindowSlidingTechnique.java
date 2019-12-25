package com.demo.practice.ds.arrays;

import java.util.Scanner;

public class WindowSlidingTechnique {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Size of the array:: ");
		int n = scan.nextInt();
		System.out.println();
		System.out.println("Enter the elements of array");
		int[] inputArr = new int[n];
		for (int i = 0; i < n; i++) {
			inputArr[i] = scan.nextInt();
		}

		System.out.println("Enter fixed length k");
		int k = scan.nextInt();
		scan.close();
		calculateSum(n, inputArr, k);

	}

	private static void calculateSum(int n, int[] inputArr, int k) {

		int maxStartIndex = 0;
		int maxEndIndex = 0;
		int max = 0;
		int startPos = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			startPos = i;
			while (startPos < (i + k) && (i + k) < n) {
				sum += inputArr[startPos];
				startPos++;
			}

			if (max < sum) {
				max = sum;
				maxStartIndex = i + 1;
				maxEndIndex = i + k;
				break;
			}
			System.out.println("sum = " + sum);
		}

		System.out.println("startPos:: " + maxStartIndex);
		System.out.println("endPos:: " + maxEndIndex);
	}

}
