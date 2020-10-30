package com.eomcs.oop.ex03;

public class Exam0910 {

	static class Monitor {

		int bright;
		int contrast;
		int widthRes;
		int heightRes;

		void display() {
			System.out.println("-------------------------");
			System.out.printf("밝기(%d)\n", bright);
		      System.out.printf("명암(%d)\n", contrast);
		      System.out.printf("해상도(%d x %d)\n", widthRes, heightRes);
		      System.out.println("----------------------------------");
		}
	}

	public static void main(String[] args) {
		Monitor m1 = new Monitor();

		m1.display();

		m1.bright = 50;
		m1.contrast = 50;
		m1.widthRes = 1920;
		m1.bright = 1080;

		m1.display();
	}

}
