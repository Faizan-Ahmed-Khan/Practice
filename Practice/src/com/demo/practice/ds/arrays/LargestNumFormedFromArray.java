package com.demo.practice.ds.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class NumComparator implements Comparator<String> {

	public int compare(String x, String y) {

		String XY = x + y;
		String YX = y + x;

		return XY.compareTo(YX) > 0 ? -1 : 1;
	}

}

public class LargestNumFormedFromArray {

	public static void main(String[] args) {

		Vector<String> arr = new Vector<>();
		arr.add("54");
		arr.add("546");
		arr.add("548");
		arr.add("60");
		printLargest(arr);
	}

	private static void printLargest(Vector<String> arr) {

		Collections.sort(arr, new NumComparator());
		Iterator it = arr.iterator();
		while (it.hasNext())
			System.out.print(it.next());

	}
}
