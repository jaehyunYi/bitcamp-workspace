// Class.forName()
package com.eomcs.oop.ex03;

public class Exam0650 {

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
		Class.forName("com.eomcs.oop.ex03.Exam0650$A");
		// Class(소문자 아님주의!)라는 이름의 클래스는 시스템클래스에 관련된 것을 다루는 도구가 들어있다!
		//.forname 은 Method Area로 클래스를 로딩하게 해준다.
		System.out.println("종료!");
	}

}
