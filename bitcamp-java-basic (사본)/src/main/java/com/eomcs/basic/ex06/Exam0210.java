package com.eomcs.basic.ex06;

public class Exam0210 {
	public static void main(String[] args) {
		int type = 1;

		if (type == 1) {	//개발자
			System.out.println("정보처리자격증");
			System.out.println("졸업증명서");
			System.out.println("이력서");
		} else if (type == 2) {	// 일반관리
			System.out.println("졸업증명서");
			System.out.println("이력서");
		} else if (type == 3) {	// 시설관리
			System.out.println("이력서");
		} else {
			System.out.println("잘못된 지원입니다.");
		}

		System.out.println("----------------------");

		switch (type) {
			case 1:			// case 뒤에는 값이 와야해. 변수가 오면 안됨.
				System.out.println("정보처리자격증");
				System.out.println("졸업증명서");
				System.out.println("이력서");
				break;
			case 2:
				System.out.println("졸업증명서");
				System.out.println("이력서");
				break;
			case 3:
				System.out.println("이력서");
				break;
			default:
				System.out.println("잘못된 지원입니다.");
			}

		System.out.println("----------------------");

		final int DEVELOPER = 1;
		final int GENERAL_MANAGER = 2;
		final int BUILDING_MANAGER = 3;
		switch (type) {
			case DEVELOPER:			// case 뒤에는 값이 와야해. 변수가 오면 안됨.
				System.out.println("정보처리자격증");
				System.out.println("졸업증명서");
				System.out.println("이력서");
				break;
			case GENERAL_MANAGER:
				System.out.println("졸업증명서");
				System.out.println("이력서");
				break;
			case BUILDING_MANAGER:
				System.out.println("이력서");
				break;
			default:
				System.out.println("잘못된 지원입니다.");
		}

		System.out.println("----------------------");

				// break문을 없앰.
		switch (type) {
			case DEVELOPER:			// case 뒤에는 값이 와야해. 변수가 오면 안됨.
				System.out.println("정보처리자격증");

			case GENERAL_MANAGER:
				System.out.println("졸업증명서");

			case BUILDING_MANAGER:
				System.out.println("이력서");
				break;
			default:
				System.out.println("잘못된 지원입니다.");
		}

		System.out.println("----------------------");

		int score = 70;

		switch (score) {		// switch문은 범위를 나타낼 수는 없고 단순 값만 나타낼 수 있음.

		case 100:
		case 90:
			System.out.println("A");
			break;
		case 80:
		case 70:
			System.out.println("B");
			break;
		case 60:
		case 50:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}

		System.out.println("----------------------");

		// short value = 100;
		String value = "developer";
		final String value2 = "hello";

		switch (value) { // 4byte 이하 정수(byte, short, int, char), 문자
			case "developer":		//100:
				break;
			case "manager":		//20:
				break;
			case value2:			// final을 안붙이면 오류
			default:
		}

		int value3 = 100;
		final int x =200;
		switch (value3) {
		case 100:
			break;
		case 100 + 3:
			break;
		case x:
			break;
		case x + 3:
			break;
		}

		System.out.println("----------------------------");

		Job type2 = Job.DEV;

		switch (type2) {


		}

		}

	enum Job {
		DEV, GM, BM		// 얘네는 상수임 따라서 main에 int, byte같은걸로 선언 못해.

	}

}
