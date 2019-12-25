package com.demo.practice.concepts.polymorphism;

public class MainClass {

	public static void main(String[] args) throws Exception {

		// A obj = new B();
		// obj.somemethod();
		A obj = null;
		try {
			obj.somemethod();
		} catch (Exception ex) {
			System.out.println("Hi");
		}

	}
}
