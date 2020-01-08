package com.demo.practice.ds.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
 * 
 * @author faizan.ahmed
 */
public class ReverseWordsSeparatedByDot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			System.out.println(reverseWords(s));
		}
		scan.close();

	}

	private static String reverseWords(String s2) {

		String[] sc = s2.split("\\.");
		Stack<String> s1 = new Stack<>();
		for (String s : sc) {
			s1.push(s);
			s1.push(".");
		}

		s1.pop();
		StringBuilder sb = new StringBuilder();
		while (!s1.isEmpty()) {
			sb.append(s1.pop());
		}

		return sb.toString();
	}

}
