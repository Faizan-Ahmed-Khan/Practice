package com.demo.practice.ds.queues;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

/**
 * Stack Implementation using Queue --> Stue
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

		System.out.println("------------");

		while (!q1.isEmpty() && q1.size() != 1) {
			q2.add(q1.poll());
		}
		if (Optional.ofNullable(q1.peek()).isPresent()) {
			System.out.println("Element Popped ::: " + q1.peek());
			System.out.println("Remaining elements:: " + q1);
		} else {
			System.out.println("No Elements to POP");
		}
		q1 = q2;
		q2 = new LinkedList<>();

	}

}
