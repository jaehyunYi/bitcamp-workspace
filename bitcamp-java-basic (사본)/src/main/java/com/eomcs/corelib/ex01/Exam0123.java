package com.eomcs.corelib.ex01;

public class Exam0123 {

	static class Score {
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float avg;

		public Score(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			sum = kor + eng + math;
			avg = sum / 3f;
		}

		@Override
		public String toString() {
			return String.format("%s, %d, %d, %d, %d, %.1f",
					name, kor, eng, math,
					sum, avg);
		}
	}

	public static void main(String[] args) {
		Score s1= new Score("홍길동", 100, 100, 100);

		String str = s1.toString();

		System.out.println(str);

		System.out.println(s1);
	}
}
