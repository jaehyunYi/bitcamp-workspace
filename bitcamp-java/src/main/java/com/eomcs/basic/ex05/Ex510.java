package com.eomcs.basic.ex05;

public class Ex510 {
	public static void main(String[] args) {
		
		int age = 20;
		
		String message = (age > 18)? "성년" : "미성년";
		System.out.printf("나이 %d는 %s이다.\n", age, message);
	}

}
