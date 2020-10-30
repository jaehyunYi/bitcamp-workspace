// 변수 초기화 문장(variable initializer)
package com.eomcs.oop.ex03;

public class Exam0670 {

	public static class A {
		static int a = 100;


		// static int a;
	    // static {
	    //   a = 100;
	    // }
	}

	public static void main(String[] args) throws Exception {
		System.out.println(A.a);
	}
}
