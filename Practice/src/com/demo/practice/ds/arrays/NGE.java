package com.demo.practice.ds.arrays;

class Stack {

	int	top;
	int	items[]	= new int[100];

	void push(int x) {

		if (top == 99) {
			System.out.println("Overflow");
		} else {
			items[++top] = x;
		}
	}

	int pop() {

		int element = -1;
		if (top == -1) {
			System.out.println("underflow");
			return -1;
		} else {
			element = items[top];
			top--;
			return element;
		}
	}

	boolean isEmpty() {

		return top == -1;
	}
}

public class NGE {

	public static void main(String args[]) {

		int arr[] = { 11, 13, 21, 3 };
		int n = arr.length;
		printNGE(arr, n);
	}

	public static void printNGE(int[] arr, int n) {

		Stack s = new Stack();
		s.top = -1;
		// push 1st element into the array
		s.push(arr[0]);
		int element, next;

		for (int i = 1; i < n; i++) {
			next = arr[i];

			if (!s.isEmpty()) {
				element = s.pop();
				while (element < next) {
					System.out.println(element + "-->" + next);
					if (s.isEmpty()) break;
					element = s.pop();
				}
				if (element > next) {
					s.push(element);
				}
			}
			s.push(arr[i]);

		}

		// System.out.println(s.top);
		while (!s.isEmpty()) {
			element = s.pop();
			next = -1;
			System.out.println(element + "-->" + next);
		}
	}

}
