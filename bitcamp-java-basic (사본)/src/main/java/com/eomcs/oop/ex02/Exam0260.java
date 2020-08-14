package com.eomcs.oop.ex02;

public class Exam0260 {
	  static class Calculator {
		    int result = 0;

		   void plus(int value) {
		     result += value;
		    }

		   void minus(int value) {
		      result -= value;
		    }

		    void multiple(int value) {
		      result *= value;
		    }

		    void divide(int value) {
		      result /= value;
		    }

		  }

		  public static void main(String[] args) {


		    Calculator c1 = new Calculator(); // 식1의 계산 결과를 보관할 메모리 준비
		    Calculator c2 = new Calculator(); // 식2의 계산 결과를 보관할 메모리 준비

		    c1.plus(2); // + 2
		    c2.plus(3); // + 3

		    c1.plus(3); // + 2 + 3
		    c2.multiple(2); // + 3 * 2

		    c1.minus(1); // + 2 + 3 - 1
		    c2.plus(7); // + 3 * 2 + 7

		    c1.multiple(7); // + 2 + 3 - 1 * 7
		    c2.divide(4); // + 3 * 2 + 7 / 4

		    c1.divide(3); // + 2 + 3 - 1 * 7 / 3 = ?
		    c2.minus(5); // + 3 * 2 + 7 / 4 - 5 = ?

		    // 식1의 계산 결과는 c1 인스턴스의 result 변수에 들어 있고,
		    // 식2의 계산 결과는 c2 인스턴스의 result 변수에 들어 있다.
		    System.out.printf("c1.result = %d\n", c1.result);
		    System.out.printf("c2.result = %d\n", c2.result);

		  }
}
