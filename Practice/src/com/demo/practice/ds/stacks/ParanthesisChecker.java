package com.demo.practice.ds.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. example1: The program
 * should print 'balanced' for exp = “[()]{}{[()()]()}” example2: 'not balanced' for exp = “[(])”
 * 
 * @author faizan.ahmed
 */
public class ParanthesisChecker {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			System.out.println(balanceCheck(s.toCharArray()));
		}
		scan.close();

	}

	private static String balanceCheck(char[] cs) {

		Stack<Character> s1 = new Stack<>();
		for (Character c : cs) {
			switch (c) {
			case '{':
			case '[':
			case '(':
				s1.push(c);
				break;

			case '}':
				if (s1.isEmpty() || s1.peek() != '{') return "not balanced";
				s1.pop();
				break;
			case ']':
				if (s1.isEmpty() || s1.peek() != '[') return "not balanced";
				s1.pop();
				break;

			case ')':
				if (s1.isEmpty() || s1.peek() != '(') return "not balanced";
				s1.pop();
				break;
			default:
				break;
			}

		}

		if (s1.isEmpty())
			return "balanced";
		else
			return "not balanced";

	}

}
