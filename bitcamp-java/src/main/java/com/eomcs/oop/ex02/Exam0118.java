package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score3;

// Score2 만들기

public class Exam0118 {

	public static void main(String[] args) {
		Score3 s1 = new Score3();

		s1.init("홍길동", 100, 90, 87);

		Score3 s2 = new Score3();
		s2.init("임꺽정", 90, 100, 100);

		printScore(s1);
		System.out.println("------------------------------");

		printScore(s2);
	}



	static void printScore(Score3 s) {
		System.out.printf("%s: %d, %d, %d, %d, %.1f\n",s.name, s.kor, s.eng, s.math, s.sum, s.avg);

	}
}
