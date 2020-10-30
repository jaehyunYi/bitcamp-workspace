// 활용 II : 클래스 로딩과 스태틱 블록 실행
package com.eomcs.oop.ex03;

public class Exam0691 {

	public static class A {
		static int a = 7;

		static {
			System.out.println("A.static{}");

			a += B.b;

		}
	}

	static class B {
		static int b = 22;

		static {
			System.out.println("B.static{}");
			b += A.a;
		}
	}

	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.b);
	}

}
