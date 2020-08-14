package com.eomcs.oop.ex02;

// 낱개 변수를 묶어서 새로운 클래스와 메소드 만들기

public class Exam0111 {
	static class Score {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float avg;

	}

	public static void main(String[] args) {
		Score s1 = new Score ();

		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 87;
		s1.sum = s1.kor + s1.eng + s1.math;
		s1.avg = s1.sum / 3f;


		 printScore(s1);
	}
	static void printScore(Score s) {
		System.out.printf("%s: %d, %d, %d, %d, %.1f\n",s.name, s.kor, s.eng, s.math, s.sum, s.avg);

	}
}
