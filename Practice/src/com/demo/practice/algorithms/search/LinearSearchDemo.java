package com.demo.practice.algorithms.search;

import java.util.Arrays;
import java.util.List;

public class LinearSearchDemo {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(1, 2, 3, 5, 6, 7, 4);
		Integer key = 4;
		long t1 = System.currentTimeMillis();
		System.out.println(numList.stream().anyMatch(num -> num.equals(key)));
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		for (Integer num : numList) {
			if (num.equals(key))
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
		long t3 = System.currentTimeMillis();
		System.out.println(t3 - t2);
	}

}
