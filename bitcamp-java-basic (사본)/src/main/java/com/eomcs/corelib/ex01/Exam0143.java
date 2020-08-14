package com.eomcs.corelib.ex01;

public class Exam0143 {
	static class Score{
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
	}

	public static void main(String[] args) {
		Score s1 = new Score("홍길동", 100, 100, 100);
		Score s2 = new Score("홍길동", 100, 100, 100);

		System.out.println(s1 == s2);

		System.out.printf("%d, %d\n",
				s1.hashCode(), s2.hashCode());
	}

}
