package com.demo.practice.ds.queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	static Queue<Integer>	q1	= new LinkedList<>();
	static Queue<Integer>	q2	= new LinkedList<>();

	public static void main(String[] args) {

		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		// System.out.println(popUsingTwoQueues());
		System.out.println(popUsingsingleQueue());
		// push(3);
		// push(4);
		// pop();
		// pop();
		// pop();
	}

	private static int popUsingsingleQueue() {

		if (q1.isEmpty())
			return -1;
		else {
			for (int i = 0; i < q1.size() - 1; i++) {
				q1.add(q1.poll());
			}

			int elt = q1.poll();
			// Remove the last element
			return elt;
		}
 
	}

	private static int popUsingTwoQueues() {

		if (q1.isEmpty())
			return -1;
		else {
			while (!q1.isEmpty() && q1.size() != 1) {
				q2.add(q1.poll());
			}

			int elt = q1.poll();
			// put all elements of q2 back to q1
			q1 = q2;
			q2 = new LinkedList<>();

			// Remove the last element
			return elt;
		}

	}

	private static void push(int i) {

		q1.add(i);

	}

}
