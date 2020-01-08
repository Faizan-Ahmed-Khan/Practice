package com.demo.practice.ds.stacks;

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
		q.enque(1);
		q.enque(2);
		q.enque(3);
		q.deque();
		q.enque(4);
		q.deque();
		q.deque();
		q.deque();
	}

	/**
	 * Add element to the stack
	 * 
	 * @param elt
	 */
	private void enque(int elt) {

		s1.push(elt);
		System.out.println(s1);
	}

	/**
	 * remove the first inserted element
	 */
	private void deque() {

		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		if (!s2.isEmpty()) {
			System.out.println("Item removed::" + s2.pop());
			System.out.println("remaining items in stack:: " + s2);
		} else
			System.out.println("No Elements to DeQueue");

	}

}
