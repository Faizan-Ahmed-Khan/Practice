package com.demo.practice.ds;

import java.util.Stack;

/**
 * Queue Implementation Using Stack
 * 
 * @author faizan.ahmed
 */
public class Quack {

	Stack<Integer>	s1	= new Stack<>();
	Stack<Integer>	s2	= new Stack<>();

	public static void main(String[] args) {

		Quack q = new Quack();
//		q.enque(1);
//		q.enque(2);
//		q.enque(3);
		q.deque();
	}

	/**
	 * Add element to the stack
	 * 
	 * @param elt
	 */
	private void enque(int elt) {

		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.push(elt);

		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		System.out.println(s1);
	}

	/**
	 * remove the first inserted element
	 */
	private void deque() {

		if (s1.isEmpty())
			System.out.println("no elements to POP");
		else {
			System.out.println("Item removed::" + s1.pop());
			System.out.println("remaining items in stack:: " + s1);
		}
	}

}
