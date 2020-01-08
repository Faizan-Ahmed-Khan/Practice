package com.demo.practice.ds.arrays;

public class ArrayRotationCount {

	public static void main(String[] args) {

		int[] arr = {7, 9, 11, 12, 15};

		int rotationCount = 0;
		int first = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (first > arr[i]) {
				rotationCount = i;
				break;
			}
			first = arr[i];
		}
		System.out.println(rotationCount);
	}

}
