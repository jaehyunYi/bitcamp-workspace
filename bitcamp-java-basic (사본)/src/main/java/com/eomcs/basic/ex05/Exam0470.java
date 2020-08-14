package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 III
//
public class Exam0470 {
  public static void main(String[] args) {
	  final int CSS           = 0x0001; // 0000 0001
	  final int HTML          = 0x0002; // 0000 0010
	  final int PHP           = 0x0004; // 0000 0100
	  final int PYTHON        = 0x0008; // 0000 1000
	  final int JAVASCRIPT    = 0x0080; // 0001 0000
	  final int JAVA          = 0x0040; // 0010 0000
	  final int CPP 		     = 0x0100; // 0100 0000
	  final int C             = 0x0200; // 1000 0000

    // C, Java, PYTHON, HTML  할 줄 아는 개발자의 정보를 설정하라!
    int lang= C | JAVA | PYTHON | HTML; // 10101010

    // 정수 값에서 특정 비트의 값만 검사하는 방법
    //   10101010 (C, Java, Python, HTML)
    //
    // CPP 언어를 할 줄 아는지 검사하
    //     10101010
    //   & 01000000 (조사하려는 값과 AND 한다. 01000000)
    //   ----------------------  (조사하려는 값에 0을 AND 하면 무조건 0으로 만든다.)
    //     0000 0000 0000 0000   (조사하려는 값에 1을 AND 하면 원래 값 그래도 리턴한다.)
    //
    // AND 결과 값을 검사 값과 같은지 비교하면 된다.
    //     00000000 (결과값)
    //    01000000 (CPP 여부를 조사하는 값)
    // => 결과 값과 조사한 값이 같지 않으면 해당 비트가 0이라는 의미다.

    System.out.printf("CSS      	: %b\n", (lang & CSS) == CSS);
    System.out.printf("HTML        : %b\n", (lang & HTML) == HTML);
    System.out.printf("PHP       	: %b\n", (lang & PHP) == PHP);
    System.out.printf("Python    	: %b\n", (lang & PYTHON) == PYTHON);
    System.out.printf("JavaScript  : %b\n", (lang & PHP) == PHP);
    System.out.printf("Java    		: %b\n", (lang & JAVA) == JAVA);
    System.out.printf("C++    		: %b\n", (lang & CPP) == CPP);
    System.out.printf("C				: %b\n", (lang & C) == C);
    System.out.println("-----------------------------");
    System.out.printf("CSS      	: %b\n", (lang & CSS) > 0);
    System.out.printf("HTML        : %b\n", (lang & HTML) > 0);
    System.out.printf("PHP       	: %b\n", (lang & PHP) > 0);
    System.out.printf("Python    	: %b\n", (lang & PYTHON) > 0);
    System.out.printf("JavaScript  : %b\n", (lang & JAVASCRIPT) > 0);
    System.out.printf("Java    		: %b\n", (lang & JAVA) > 0); 
    System.out.printf("C++    		: %b\n", (lang & CPP) > 0);
    System.out.printf("C				: %b\n", (lang & C) > 0);




  }
}
