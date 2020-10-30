package com.eomcs.oop.ex03;

public class Exam0210 {

	static class A {
		static int v1;	// 스태틱 변수 = static field = class field
		int v2;			// 인스턴스 변수 = instance field = non-static field

		static void m1() {
			System.out.println("m1()");
			A.v1 = 100;
			v1 = 200; // 같은 스태틱 멤버이기 때문에 생략 가능

			// 스태틱 메서드는 this라는 내장 변수가 없다.
			// this.v2 = 200;
			// this.m2();
			// 스태틱 메서드는 this 라는 내장 변수가 없기때문에
			// this 를 사용하여 접근하는 인스턴스 멤버(필드, )에 접근할 수 없다.
		}

		// non-static method = instance method
		void m2() {
			System.out.println("m2()");

			// 인스턴스 필드에 접근하려면
			// 메서드 내장 변수인 this를 사용하라.
			// this는 메서드가 호출될 때 외부로부터 받은 인스턴스 주소를 갖고다.
			v2 = 100;
			v2 = 300;	//코드를 작성할 때 this를 생략할 수 있다.

			// 스태틱 필드는 인스턴스 레퍼런스를 통해 접근할 수 있다.
			// 그러나 비권장!
			v1 = 100;

			// 물론 다음과 같이 클래스 이름을 생략할 수 있다.
			// => 반반!
			v1 = 200;
			A.v1 = 200;
			m1();
			A.m1();
			// 인스턴스 메서드는 인스턴스 멤버(필드나 메서드 ) 뿐만아니라
			// 클래스 멤버
		}
		static int abs(int value) {
			if (value < 0) {
				return value * (-1);
			}
			else {
				return value;
			}

		}
	}

	public static void main(String[] args) {
		A.m1();
		// A.m2();

		// non-static 메서드는 인스턴스가 있어야만 호출가능
		// => 인스턴스 메서드
		A obj1 = new A();
		obj1.m2();

		obj1.m1();		//A.m1();

		System.out.println(A.abs(100));
		System.out.println(Math.abs(-100));
	}
}
