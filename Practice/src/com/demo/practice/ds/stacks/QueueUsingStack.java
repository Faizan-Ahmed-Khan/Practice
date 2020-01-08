package com.demo.practice.ds.stacks;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

	private static Stack<Integer>	stack		= new Stack<>();
	private static Stack<Integer>	tempStack	= new Stack<>();

	public static void main(String[] args) {

		System.out.println("Choose the method to be made costly");
		System.out.println("1. Enque");
		System.out.println("2. Deque");
		Scanner scan = new Scanner(System.in);
		int methodChoice = scan.nextInt();

		if (methodChoice == 2) {
			System.out.println("------Deque Operation is Costly----");
		} else {
			System.out.println("------Enque Operation is Costly----");
		}

		enque(1, methodChoice);
		enque(2, methodChoice);
		enque(3, methodChoice);
		deque(methodChoice);
		System.out.println("stack contents:: " + stack);
		enque(4, methodChoice);
		deque(methodChoice);
		deque(methodChoice);
		deque(methodChoice);
		deque(methodChoice);
		System.out.println("stack contents:: " + stack);
		scan.close();

	}

	private static void deque(int methodChoice) {

		if (methodChoice == 2) {
			costylyDequeOp();
		} else {
			normalDequeOp();
		}

	}

	private static void normalDequeOp() {

		if (!stack.isEmpty())
			System.out.println("popped Element:: " + stack.pop());
		else
			System.out.println("Stack is Empty!!!");

	}

	/**
	 * If tempStack is empty While stack is not empty, push everything from stack to tempStack.
	 * Pop the element from tempStack and return it.
	 */
	private static void costylyDequeOp() {

		if (tempStack.isEmpty()) {
			while (!stack.isEmpty()) {
				tempStack.push(stack.pop());
			}
		}

		if (!tempStack.isEmpty())
			System.out.println("popped Element:: " + tempStack.pop());
		else
			System.out.println("Stack is Empty!!!");

	}

	private static void enque(int num, int methodChoice) {

		if (methodChoice == 1) {
			costylyEnqueOp(num);
		} else {
			normalEnqueOp(num);
		}

	}

	private static void normalEnqueOp(int num) {

		stack.push(num);
		System.out.println("element added:: " + num + " stack contents:: " + stack);

	}

	/**
	 * While stack is not empty, push everything from stack to tempStack.
	 * Push num to stack.
	 * Push everything back  to stack.
	 * 
	 * @param num
	 */
	private static void costylyEnqueOp(int num) {

		while (!stack.isEmpty()) {
			int nextElt = stack.pop();
			tempStack.push(nextElt);
		}

		stack.push(num);

		while (!tempStack.isEmpty()) {
			int nextElt = tempStack.pop();
			stack.push(nextElt);
		}

		System.out.println("element added:: " + num + " stack contents:: " + stack);
	}

}
