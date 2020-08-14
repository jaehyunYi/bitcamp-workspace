package com.eomcs.oop.ex03;

public class Exam0110 {
	static class A {
		static int v1;		// class에서 static이 붙지 않은 변수를 인스턴스라고 부름.
		static boolean v2;
		}

	public static void main(String[] args) {
		// 인스턴스 변수
		A obj1 = new A();
		A obj2 = new A();

		obj1.v1 = 100;
		obj2.v1 = 200;


		System.out.println(obj1.v1);
		System.out.println(obj2.v1);


	}

}
