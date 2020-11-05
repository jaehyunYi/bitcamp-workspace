package com.eomcs.basic.ex07;

public class Exam0280 {
	public static void main(String[] args) {
		// 2 + 3 + 4 + 5 = ?

		// 1) 메서드의 리턴값을 변수로 받을 때
		int result = plus(2, 3);
		result = plus(result, 4);
		result = plus(result, 5);
		System.out.println(result);

		// 2) 메서드의 리턴값을 바로 파라미터에 전달할 때
		result = plus(plus(plus(2, 3), 4), 5);

		System.out.println(result);
		System.out.printf("100 + 200 = %d\n", plus(100, 200));


	}

	static int plus (int a, int b) {
		return a + b;
	}
}