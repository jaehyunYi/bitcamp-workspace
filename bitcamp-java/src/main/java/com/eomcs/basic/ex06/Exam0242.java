package com.eomcs.basic.ex06;

//# 흐름 제어문 - switch 문법 II\
// enum

public class Exam0242 {

	enum Level {
		GUEST, MEMBER, ADMIN
	}

	public static void main(String[] args) {
		Level level = Level.MEMBER;

		switch (level) {
			case GUEST:
				System.out.println("조회만 가능합니다.");
			case MEMBER:
				System.out.println("글 작성 가능합니다.");
			case ADMIN:
				System.out.println("다른 회원의 글을 변경, 삭제할 수 있습니다.");
			break;
		}



	}

}