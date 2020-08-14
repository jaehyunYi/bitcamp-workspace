package com.eomcs.corelib.ex01;

public class Exam0144 {

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
		public int hashCode() {
			return 1000;
		}
	}

	public static void main(String[] args) {
		Score s1 = new Score("홍길동", 100, 100, 100);
		Score s2 = new Score("홍길동", 100, 100, 100);
		Score s3 = new Score("임꺽정", 90, 80 ,70);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
