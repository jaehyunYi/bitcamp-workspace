package com.eomcs.oop.ex02;

public class Exam0250 {
	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();


		// 2 + 3 - 1 * 7 / 3 = 9
		c1.plus(c1, 2);
		c1.plus(c1, 3);
		c1.minus(c1, 1);
		c1.multiple(c1, 7);
		c1.divide(c1, 3);


	    c2.plus(c2, 3); // + 3
	    c2.multiple(c2, 2); // + 3 * 2
	    c2.plus(c2, 7); // + 3 * 2 + 7
	    c2.divide(c2, 4); // + 3 * 2 + 7 / 4
	    c2.minus(c2, 5); // + 3 * 2 + 7 / 4 - 5 = ?

	    System.out.printf("c1.result = %d\n", c1.result);
	    System.out.printf("c2.result = %d\n", c2.result);
	}

	static class Calculator {

		static int result = 0;

		static void plus(Calculator obj, int value) {
			obj.result += value;
		}

		static void minus(Calculator obj, int value) {
			result -=  value;
		}

		static void multiple(Calculator obj, int value) {
			result *= value;
		}

		static void divide(Calculator obj, int value) {
			result /= value;
		}
	}

}
