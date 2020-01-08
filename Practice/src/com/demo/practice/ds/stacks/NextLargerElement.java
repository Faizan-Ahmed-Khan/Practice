package com.demo.practice.ds.stacks;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;

public class NextLargerElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n > 0) {
			Integer size = scan.nextInt();
			int[] arr = new int[size];
			for (int j = 0; j < size; j++) {
				arr[j] = scan.nextInt();
			}

			// nextLargeElt(arr);
			// findMinimumOfGreaterNumbers(arr, size);
			newApproach(arr);
			System.out.println();
			n--;
		}
		scan.close();

	}

	private static void findMinimumOfGreaterNumbers(int[] a, int n) {

		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		// next greater element array
		int[] ngeArr = new int[n];
		for (int i = 1; i < n; i++) {
			while (!stack.empty() && a[i] > a[stack.peek()]) {
				ngeArr[stack.peek()] = a[i];
				stack.pop();
			}
			stack.push(i);
		}
		while (!stack.empty()) {
			ngeArr[stack.peek()] = -1;
			stack.pop();
		}

		// print the resultant array
		for (int i = 0; i < n; i++) {
			System.out.print(ngeArr[i] + " ");
		}
	}

	private static void nextLargeEltSimple(int[] arr) {

		Stack<Integer> s1 = new Stack<>();
		s1.push(arr[0]);
		// next greater element array
		int[] ngeArr = new int[arr.length];

		for (int i = 1; i < arr.length; i++) {

			int nextElt = arr[i];
			if (!s1.isEmpty()) {
				int top = s1.pop();

				while (top < nextElt) {
					System.out.print(nextElt + " ");
					if (s1.isEmpty()) break;
					top = s1.pop();
				}

				if (top > nextElt) s1.push(top);
			}
			s1.push(nextElt);
		}
		while (!s1.isEmpty()) {

			System.out.print(-1 + " ");

		}
		System.out.println();
	}

	private static void nextLargeElt(int[] arr) {

		Stack<Integer> s1 = new Stack<>();
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		s1.push(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			int nextElt = arr[i];
			if (!s1.isEmpty()) {
				int top = s1.pop();

				while (top < nextElt) {
					// System.out.print(nextElt + " ");
					tm.put(top, nextElt);
					if (s1.isEmpty()) break;
					top = s1.pop();
				}

				if (top > nextElt) s1.push(top);
			}
			s1.push(nextElt);
		}
		while (!s1.isEmpty()) {

			tm.put(s1.pop(), -1);
			// System.out.print(-1 + " ");

		}
		// System.out.println();

		// System.out.println(tm);
		for (int i : arr) {
			System.out.print(tm.get(i) + " ");
		}
		System.out.println();
	}

	private static void newApproach(int[] arr) {

		Stack<Integer> s1 = new Stack<>();
		s1.push(0); // push index 0 into stack
		int[] indexArr = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			int next = arr[i];
			int elt = arr[s1.peek()];
			while (!s1.isEmpty() && next < elt) {
				indexArr[s1.peek()] = arr[i];
			}
			// add the index into stack
			s1.push(i);
		}

		while (!s1.isEmpty()) {
			indexArr[s1.peek()] = -1;
			s1.pop();
		}

		// print the output
		for (int i : indexArr) {
			System.out.print(i + " ");
		}
	}
}
