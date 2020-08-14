package com.eomcs.oop.ex03;

class SmartPhone {

	int volume;
	int bright;
	int contrast;

	// 파라미터가 다른 생성자를 여러 개 정의할 수 있다.
	private SmartPhone() {
		// this(...) <== 다른 생성자를 호출한다.
		this(50, 50, 50);		// 다른 생성자를 호출할 때는 반드시 첫 문장이어야한다.
		System.out.println("SmartPhone() 생성자 호출됨!");
	}

	public SmartPhone(int volume) {
		System.out.println("SmartPhone(int) 생성자 호출됨!");

		this.volume = volume;
		bright = 50;
		contrast = 50;
	}

	public SmartPhone(int volume, int bright) {
		System.out.println("SmartPhone(int, int) 생성자 호출됨!");

		this.volume = volume;
		this.bright = bright;
		contrast = 50;
	}

	public SmartPhone(int volume, int bright, int contrast) {

		System.out.println("SmartPhone(int, int, int) 생성자 호출됨!");
		this.volume = volume;
		this.bright = bright;
		this.contrast = contrast;
	}
}

public class Exam0424 {


  void m1() {
	  // 일반 메서드에서 생성자를 임의로 호출할 수 없다.
	  // this();
  }

  public static void main(String[] args) {
	  // private로 접근을 제한한 경우 다른클래스가 생성자를 지정할 수 없다.
	  //SmartPhone obj1 = new SmartPhone();
	  SmartPhone obj2 = new SmartPhone(50);




  }
}
