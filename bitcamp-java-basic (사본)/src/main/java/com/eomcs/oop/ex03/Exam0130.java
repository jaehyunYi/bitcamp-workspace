package com.eomcs.oop.ex03;

public class Exam0130 {
	// static field = non-static variable
	static class A {
		static int v1;		// class에서 static이 붙지 않은 변수를 인스턴스라고 부름.
		static boolean v2;
		}

	public static void main(String[] args) {

		A.v1= 100;
		A.v2 = true;


		System.out.printf("%d, %b\n", A.v1, A.v2);

	}

}
