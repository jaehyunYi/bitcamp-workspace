package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator;

public class Exam0 {

	public static void main(String[] args) {
		// 연산자 우선순위를 고려하지 말고 나온 순서대로 계산하라.
		// 식1) 2 + 3 - 1 * 7 / 3 = 9
		// 식2) 3 * 2 + 7 / 4 - 5 = ?

		// 식1과 식2를 동시에 계산할 수 있는가?
		// => 불가하다!
		// => Calculator는 result 변수를 한 개만 관리하기 때문에
		// 		동시에 여러 개의 식 결과를 따로 관리할 수 없다.

		// 식1과 식2의 변수를 따로 두어야한다.
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();


		// 현재 버전에서는 식1과 식2를 차례대로 계산해야 한다.
		c1.plus(2);
		c1.plus(3);
		c1.minus(1);
		c1.multiple(7);
		c1.divide(3);
		printResult(c1.result);


		c2.plus(3);
		c2.multiple(2);
		c2.plus(7);
		c2.divide(4);
		c2.minus(5);
		printResult(c2.result);


	}

	static void printResult(int value) {
		System.out.println("*************************");
		System.out.printf("* 결과 = %d\n", value);
		System.out.println("*************************");
	}

}