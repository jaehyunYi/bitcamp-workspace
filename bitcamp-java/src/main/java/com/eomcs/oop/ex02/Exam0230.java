package com.eomcs.oop.ex02;

public class Exam0230 {
	public static void main(String[] args) {

		// 2 + 3 - 1 * 7 / 3 = 9
		Calculator.plus(2);
		Calculator.plus(3);
		Calculator.minus(1);
		Calculator.multiple(7);
		Calculator.divide(3);

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
