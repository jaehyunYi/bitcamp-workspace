package com.eomcs.oop.ex02;

// 중복된 실행 메서드로 만들기

public class Exam0113 {
	static class Score {
		String name = "홍길동";
		int kor = 100;
		int eng = 90;
		int math = 87;
		int sum = kor + eng + math;
		float avg = sum / 3f;


	}

	public static void main(String[] args) {
		Score s1 = new Score ();

		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 87;
		computeScore(s1);


		Score s2 = new Score();
		s2.name = "임꺽정";
		s2.kor = 90;
		s2.eng = 100;
		s2.math = 100;
		computeScore(s2);

		printScore(s1);
		System.out.println("-----------------------");

		printScore(s2);
	}

	static void computeScore(Score s) {
		s.sum = s.kor + s.eng + s.math;
		s.avg = s.sum / 3f;
	}

	static void printScore(Score s) {
		System.out.printf("%s: %d, %d, %d, %d, %.1f\n",s.name, s.kor, s.eng, s.math, s.sum, s.avg);

	}
}
