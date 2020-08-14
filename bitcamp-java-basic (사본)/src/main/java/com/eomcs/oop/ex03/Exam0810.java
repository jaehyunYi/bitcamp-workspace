// 변수 초기화 문장
package com.eomcs.oop.ex03;

public class Exam0810 {

	static class A {
		int a = 100;
		int b = 200;
		int c;

		// 생성자를 작성하지 않아도 자동으로 생성되어 앞부분에 삽입.
		// 초기화된 변수들은 생성자 앞에 삽입된다.
	}

	public static void main(String[] args) {
		A obj1 = new A();
		System.out.printf("a=%d, b=%d, c=%d\n",
				obj1.a, obj1.b, obj1.c);
	}
}

