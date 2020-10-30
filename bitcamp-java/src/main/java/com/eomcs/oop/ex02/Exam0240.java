package com.eomcs.oop.ex02;

public class Exam0240 {
	public static void main(String[] args) {

		// 2 + 3 - 1 * 7 / 3 = 9
		Calculator.plus(2);
		Calculator.plus(3);
		Calculator.minus(1);
		Calculator.multiple(7);
		Calculator.divide(3);

		System.out.printf("result = %d\n", Calculator.result);

		Calculator.result = 0;

	    Calculator.plus(3); // + 3
	    Calculator.multiple(2); // + 3 * 2
	    Calculator.plus(7); // + 3 * 2 + 7
	    Calculator.divide(4); // + 3 * 2 + 7 / 4
	    Calculator.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

	    System.out.printf("result = %d\n", Calculator.result);
	}

	static class Calculator {

		static int result = 0;

		static void plus(int value) {
			result += value;
		}

		static void minus(int value) {
			result -=  value;
		}

		static void multiple(int value) {
			result *= value;
		}

		static void divide(int value) {
			result /= value;
		}
	}
}
