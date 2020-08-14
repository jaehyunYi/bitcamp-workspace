// Object 클래스 - 자바 최상위 클래스
package com.eomcs.corelib.ex01;



//클래스를 정의할 때 수퍼 클래스를 지정하지 않으면
//컴파일러는 자동으로 Object를 상속 받는다.
public class Exam0110 /*extends Object*/ {

	static class My {
	}

	public static void main(String[] args) {
		My obj = new My();
		System.out.println(obj instanceof My);
		System.out.println(obj instanceof Object);

		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals("Hello"));
	}
}