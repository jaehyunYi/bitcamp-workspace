package com.eomcs.oop.ex02.util;

 public class Score {
	public String name = "홍길동";
	public int kor;
	public int eng;
	public int math;
	public int sum;
	public float avg;

	public void compute() {
	sum = kor + eng + math;
	avg = sum / 3f;
	}
 }