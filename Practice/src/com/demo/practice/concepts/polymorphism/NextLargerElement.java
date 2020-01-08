package com.demo.practice.concepts.polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class FastReader {

	BufferedReader	br;
	StringTokenizer	st;

	public FastReader() {

		br = new BufferedReader(new InputStreamReader(System.in));
	}

	String next() {

		while (st == null || !st.hasMoreElements()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return st.nextToken();
	}

	int nextInt() {

		return Integer.parseInt(next());
	}

	long nextLong() {

		return Long.parseLong(next());
	}

	double nextDouble() {

		return Double.parseDouble(next());
	}

	String nextLine() {

		String str = "";
		try {
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}

public class NextLargerElement {

	public static void main(String[] args) throws IOException {

		FastReader fs = new FastReader();

		int n = fs.nextInt();
		while (n > 0) {
			int size = fs.nextInt();
			long[] arr = new long[size];
			for (int j = 0; j < size; j++) {
				arr[j] = fs.nextLong();
			}

			newApproach(arr);
			System.out.println();
			n--;
		}

	}

	private static void newApproach(long[] arr) {

		Stack<Integer> s1 = new Stack<>();
		s1.push(0); // push index 0 into stack
		long[] ngeArr = new long[arr.length];
		for (int i = 1; i < arr.length; i++) {
			while (!s1.isEmpty() && arr[i] > arr[s1.peek()]) {
				ngeArr[s1.peek()] = arr[i];
				s1.pop();
			}
			// add the index into stack
			s1.push(i);
		}

		while (!s1.isEmpty()) {
			ngeArr[s1.peek()] = -1;
			s1.pop();
		}

		// print the output
		for (long i : ngeArr) {
			System.out.print(i + " ");
		}
	}

}
