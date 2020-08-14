package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator;

public class Exam0280 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();

		c1.plus(2); // + 2
	   c2.plus(3); // + 3

	    c1.plus(3); // + 2 + 3
	    c2.multiple(2); // + 3 * 2

	    c1.minus(1); // + 2 + 3 - 1
	    c2.plus(7); // + 3 * 2 + 7

	    c1.multiple(7); // + 2 + 3 - 1 * 7
	    c2.divide(4); // + 3 * 2 + 7 / 4

	    c1.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?
	    c2.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

	    printResult(c1.result);
	    printResult(c2.result);
	}

	static void printResult(int value) {

		System.out.printf("* RESULT = %d *\n", value);
		System.out.println("**********************");

	}

}
