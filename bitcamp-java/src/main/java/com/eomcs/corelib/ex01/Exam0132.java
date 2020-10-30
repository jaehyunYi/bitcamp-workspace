package com.eomcs.corelib.ex01;

public class Exam0132 {

	static class Member {
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 20);
		Member m2 = new Member("홍길동", 20);

		System.out.println(m1 == m2);

		System.out.println(m1.equals(m2));
		System.out.println("------------------------------");

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		System.out.println(s1 == s2);
		// 인스턴스의 주소가 다르니까 false

		System.out.println(s1.equals(s2));
	}
}