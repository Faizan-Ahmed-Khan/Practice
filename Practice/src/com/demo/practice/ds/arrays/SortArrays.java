package com.demo.practice.ds.arrays;

import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * Sort an array of 0s, 1s and 2s
 * 
 * @author faizan.ahmed
 */
public class SortArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int arraySize = scan.nextInt();
			int[] arrayInput = new int[arraySize];
			for (int j = 0; j < arraySize; j++) {
				arrayInput[j] = scan.nextInt();
			}

			sortArray(arrayInput);
		}

		scan.close();
	}

	private static void sortArray(int[] arrayInput) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arrayInput.length; i++) {
			if (Optional.ofNullable(hm.get(arrayInput[i])).isPresent())
				hm.put(arrayInput[i], (hm.get(arrayInput[i]) + 1));
			else
				hm.put(arrayInput[i], 1);
		}

		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>(hm);
		Set<Integer> keySet = tm.keySet();

		for (Integer key : keySet) {
			for (int i = 0; i < hm.get(key); i++)
				System.out.print(key + " ");
		}
		System.out.println();
	}

}
