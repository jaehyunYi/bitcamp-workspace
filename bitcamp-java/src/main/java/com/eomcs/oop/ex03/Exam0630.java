// 클래스 메서드 사용

package com.eomcs.oop.ex03;

public class Exam0630 {

	public static class A {
		static int a;

		static void m() {}

		static {
			System.out.println("Static{} 11111");
		}

		static {
			System.out.println("Static{} 22222");
		}
	}

	public static void main(String[] args) throws Exception {

		A.m();
		System.out.println("종료!");

	}

}
