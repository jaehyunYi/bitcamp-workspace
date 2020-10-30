package com.eomcs.corelib.ex02;

public class Exam0123 {

	static class Member {
		String name;
		int age;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public boolean equals(Object obj) {
			if(obj == null)
				return false;
			if (obj.getClass() != Member.class)
				return false;

			Member other = (Member) obj;

			if(!name.equals(other.name))
				return false;

			if(age != other.age)
				return false;

			return true;
		}
	}

	public static void main(String[] args) {
		Member m1 = new Member("홍길동",20);
		Member m2 = new Member("홍길동",20);

		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
	}

}
