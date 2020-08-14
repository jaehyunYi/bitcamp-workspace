package com.eomcs.basic.ex07;

public class Exam0520 {

	// 실행하는 클래스는 다음과 같이 main() 메서드의 시그니처(signature)를 가져야 한다.
	// => method signature == function prototype == 메서드 선언
	// => 파라미터의 이름은 상관없다.	args 말고 다른 거 써도 괜찮다.
	public static void main(String[] args) {
		for(String value : args) {
			System.out.printf("[%s]\n",value);
		}
		System.out.println("종료!");

	}

}