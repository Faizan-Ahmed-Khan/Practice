package com.demo.practice.ds;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Stack Implementation using Queue
 * 
 * @author faizan.ahmed
 */
public class Stue {

	Queue<Integer>	q1	= new LinkedList<>();
	Queue<Integer>	q2	= new LinkedList<>();

	public static void main(String[] args) {

		Stue s = new Stue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.push(4);
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

	private void push(int elt) {

		q1.add(elt);
		System.out.println(q1);
	}

	private void pop() {

		while (!q1.isEmpty()) {
			if (q1.size() == 1) {
				System.out.println("Element Poped:: " + q1.peek());
				q1.poll();
			} else {
				q2.add(q1.poll());
			}
		}

		while (!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		System.out.println(q1);
		System.out.println(q2);
	}

}
