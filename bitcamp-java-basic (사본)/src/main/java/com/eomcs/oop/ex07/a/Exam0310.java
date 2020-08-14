package com.eomcs.oop.ex07.a;

class Score3 {
	String name;

	private int kor;
	private int eng;
	private int math;


	public void setKor(int kor) {
		this.kor = kor;
		this.compute();
	}
	public int getKor() {
		return kor;
	}


	public void setEng (int eng) {
		this.eng = eng;
		this.compute();
	}
	public int getEng() {
		return eng;
	}

	public void setMath (int Math) {
		math = math;
		this.compute();
	}
	public int getMath() {
		return math;
	}


	private int sum;
	private float avg;

	public int getSum() {
		return sum;
	}
	public float getAvg() {
		return avg;
	}

	void compute() {
		sum = kor + eng + math;
		avg = sum / 3f;
	}
}


public class Exam0310 {
	public static void main(String[] args) {
		Score3 s1 = new Score3();

		s1.name = "홍길동";
		s1.setKor(100);
		s1.setEng(90);
		s1.setMath(80);

		s1.setEng(100);
		s1.setMath(100);

		System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
				s1.name, s1.getKor(), s1.getEng(), s1.getMath(),
				s1.getSum(), s1.getAvg());


	}
}







