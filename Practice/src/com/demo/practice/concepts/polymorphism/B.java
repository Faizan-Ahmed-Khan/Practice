package com.demo.practice.concepts.polymorphism;

import java.io.IOException;

public class B extends A {

	@Override
	public void somemethod() throws IOException {

		System.out.println("Inside Class B");
	}
}
