package com.eomcs.basic.ex05;

public class Ex681 {
	public static void main(String[] args) {
		int a = 5;
		int r = --a + --a / --a;
		
		// r = 4 + 3 / 2 = 4 + 1 = 5
		
		System.out.printf("%d, %d\n", a, r);
		
		
	}

}
