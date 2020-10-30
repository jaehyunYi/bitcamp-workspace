// 클래스 필드 사용

package com.eomcs.oop.ex03;

public class Exam0620 {

	public static class A {
		static int a;

		static void m() {}		// = static method = class method

		static {
			System.out.println("Static{} 11111");
		}

		static {
			System.out.println("Static{} 22222");
		}
	}

	public static void main(String[] args) throws Exception{
		A.a = 100;
		System.out.println("종료!");

	}
}
