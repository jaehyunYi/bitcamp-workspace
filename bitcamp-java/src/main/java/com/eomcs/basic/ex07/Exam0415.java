package com.eomcs.basic.ex07;


public class Exam0415 {
	public static void main(String[] args) throws Exception {

		int result = 1;
		int n = 5;

		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		System.out.println(result);

		System.out.println("--------------------------------");

		result = factorial(5);
		// result = 5 * factorial(4)
		// result = 5 * 4 * factorial(3)
		// result = 5 * 4 * 3 * factorial(2)
		// result = 5 * 4 * 3 * 2 * factorial(1)
		// result = 5 * 4 * 3 * 2 * 1

		System.out.println(result);
	 }

	static int factorial(int n) {

		return n * factorial(n - 1);
	}
}
// 재귀함수 : 실행속도가 느리지만 직관적임.
// 실행속도가 중요하다면 반복문을 사용하는 것이 좋다.