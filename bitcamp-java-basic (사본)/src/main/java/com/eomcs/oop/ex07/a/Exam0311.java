package com.eomcs.oop.ex07.a;

class Score4 {

	private String name;
	  private int kor;
	  private int eng;
	  private int math;
	  private int sum;
	  private float aver;

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setKor(int kor) {
	    this.kor = kor;
	    this.compute();
	  }

	  public int getKor() {
	    return kor;
	  }

	  public void setEng(int eng) {
	    this.eng = eng;
	    this.compute();
	  }

	  public int getEng() {
	    return eng;
	  }

	  public void setMath(int math) {
	    this.math = math;
	    this.compute();
	  }

	  public int getMath() {
	    return math;
	  }

	  public int getSum() {
	    return sum;
	  }

	  public float getAver() {
	    return aver;
	  }

	  void compute() {
	    sum = kor + eng + math;
	    aver = sum / 3f;
	  }
	}

	public class Exam0311 {
	  public static void main(String[] args) {

	    Score4 s1 = new Score4();

	    s1.setName("홍길동");
	    s1.setKor(100);
	    s1.setEng(90);
	    s1.setMath(80);

	    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
	        s1.getName(),
	        s1.getKor(), s1.getEng(), s1.getMath(),
	        s1.getSum(), s1.getAver());
	  }
	}



public class Exam0311 {

}
