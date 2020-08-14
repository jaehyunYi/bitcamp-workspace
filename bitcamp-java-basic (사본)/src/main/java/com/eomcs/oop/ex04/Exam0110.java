package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0110 {
	public static void main(String[] args) throws Exception {
		String s1 = new String();	// 주소를 가리키는 애는 초기화 필수!
		System.out.println("=>" +s1);

		String s2 = new String("Hello!");
		System.out.println("=>" +s2);

		char[] chars = new char[] {'H','e','l','l','o','2','!'};
		String s3 = new String(chars);
		System.out.println("=>" +s3);

		byte[] bytes = new byte[] {
				0x41,	//	A
				0x42,	//	B
				(byte)0xEA,	// 가 ==> AC00
				(byte)0xB0,
				(byte)0x80,
				(byte)0xEA,	// 각 ==> AC01
				(byte)0xB0,
				(byte)0x81,
		};

		String s4 = new String(bytes, "UTF-8");
		System.out.println("=>" + s4);


		byte[] bytes2 = new byte[] {
				0x41,	//	A
				0x42,	//	B

				(byte)0xB0,	// 가
				(byte)0xA1,
				(byte)0xB0,	// 각
				(byte)0xA2,
				(byte)0xB6,	// 똘 (EUC-KR)
				(byte)0xCA,
				(byte)0x8C,	// 똠 (MS949/CP949)
				(byte)0x63,
				(byte)0xB6,	// 똥 (EUC-KR)
				(byte)0xCB,
		};

		String s5 = new String(bytes2, "MS949");
		System.out.println("=>" + s5);

		Date d1 = new Date();		// 실행하는 시저의 날짜와 시간으로 초기화.
		System.out.println(d1.toGMTString());
		System.out.println(d1.toString());
		System.out.println(d1);
		// 아규먼트가 primitive type이나 String type이 아니면
		// 인스턴스에 대해 toStirng()을 호출하여 그 리턴 값을 출력한다.


		int[] arr = new int[] {100, 200, 300};
		System.out.println(arr);
		System.out.println(arr.toString());
		// 둘이 똑같은 뜻

		int a = 100;
		System.out.println(a);


		Date d2 = new Date(100000);
		System.out.println(d2);

		Date d3 = new Date(120, 8, 10);
		System.out.println(d3);

		// 클래스 중에서는 생성자를 공개하지 않은 경우가 있다.
		// 이런 클래스의 인스턴스를 만드려면 보통 다음 2가지 방법을 사용한다.
		// 1) 다른 클래스의 도움을 받는다.
		// 2) 해당 클래스에서 제공하는 클래스 메서드(스태틱 메서드)를 사용한.
		// Calendar c1 = new Calendar();
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);//c1.toString()


		Car car1 = new Car();
		Car car2 = new Car();
		System.out.println(car1 == car2);
		car1.model = "티코";
		car1.cc = 980;
		car2.model = "소나타";
		car2.cc = 1980;
		System.out.println(car1.model);
		System.out.println(car2.model);


		//Car2 car3 = new Car2();
		Car2 car3 = Car2.getInstatnce();
		Car2 car4 = Car2.getInstatnce();
		System.out.println(car3 == car4);
		car3.model = "비트카";
		System.out.println(car4.model);

	}
}

class Car {
	String model;
	int cc;
}

class Car2 {
	String model;
	int cc;
	static Car2 obj;

	private Car2() {
	}

	static Car2 getInstatnce() {
		// 보통 생성자를 private으로 막는 경우
		// 인스턴스를 한 개만 생성하도록 제한하고 싶을 때 주로 사용한다.
		return new Car2();
	}
}

// 비트암호
// 문자 ---> 암호
// A   ---> C
// B   ---> D
// C   ---> E
// 가    ---> 100
// 각    ---> 101
//


