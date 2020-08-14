
// 반복문 : while (조건) 문장

package com.eomcs.basic.ex06;

public class Exam0310 {
	public static void main(String[] args) {
		int count = 0;

		while (count < 5)System.out.println(count++);

		System.out.println("----------------------");

		count = 0;
		while (count < 5)
			System.out.println(count++);

		System.out.println("---------------------------");

		count = 0;
		while (count < 5) {
			System.out.println(count);
			count++;
		}
	}
}
//continue;		// 즉시 조건문으로 실행을 이동, 밑에 문장을 실행하지 않음.