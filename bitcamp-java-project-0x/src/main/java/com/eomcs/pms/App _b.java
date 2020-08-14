package com.eomcs.pms;

import java.sql.Date;


//	1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//		메모리를 설계한다. => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 Member의 인스턴스를 보관한다.

public class App{

  public static void main(String[] args) {

	  // 값을 담기 위해 메모리를 준비할 때
	  // 어떤 종류의 메모리를 준비해야 하는지 설계도를 작성한다.
	  // => 이것을 "클래스 정의"라고 부른다.
	  class Member {
		  int no;
		  String name;
		  String email;
		  String password;
		  String photo;
		  String tel;
		  Date createdDate;
	  }

	  // Member 설계도에 따라 준비한 메모리의 주소를 담을 변수 선언
	  // m은 인스턴스의 주소를 담을 레퍼런스이다.
	  Member m;
	  //  Member 설계도에 따라 메모리 생성
	  m = new Member();

	  // m에 저장된 주소로 찾아가서 해당 인스턴스의 각 항목에 데이터 넣기
	  m.no = 1;
	  m.name = "홍길동";
	  m.email = "hong@test.com";
	  m.password = "1111";
	  m.photo = "hong.gif";
	  m.tel = "010-1111-2222";
	  m.createdDate = Date.valueOf("2020-01-01");

	  // m에 저장된 주소로 찾아가서 해당 인스턴스의 각 항목의 값을 꺼내기
	  System.out.println(m.no);
	  System.out.println(m.name);
	  System.out.println(m.email);
	  System.out.println(m.password);
	  System.out.println(m.photo);
	  System.out.println(m.tel);
	  System.out.println(m.createdDate);
	  // => m이라는 변수에 저장된 주소로 찾아가서 no이라는 이름의 항목 값을 꺼내기  )
	  // => 레퍼런스 m이 가리키는 인스턴스의 no 항목의 값을 꺼내기
	  // => 레퍼런스 m이 가리키는 인스턴스의 no 필드 값 꺼내기
	  // => m 객체의 no 필드 값 꺼내기


 /*지우라!!!!!!!
	  Member m2;
	  m2 = m;
	  m2.name = "임꺽정";
	  System.out.println(m.name);

	  Member x1, x2, x3, x4;
	  Member[] members = new Member[4];
	  // 인스턴스의 주소를 담는 레퍼런스를 4개 만든다는 의미.
	  // 인스턴스는 배열처럼 여러개 만들 수 없음 즉 인스턴스 배열은 없다 자바에!!!!
	  members[0] = new Member();
	  members[1] = new Member();
	  members[2] = new Member();
	  members[3] = new Member();

	  members[0].name = "홍길동";		// members가 가리키는 0번레퍼런스에 찾아가서 "홍길동"을 집어 넣어
	  members[1].name = "임꺽정";
	  members[2].name = "유관순";
	  members[3].name = "안중근";

	  Member x;
	  x = members[2];
	  x.name = "오호라";
	  x = members[0];		// x는 더이상 2번 레퍼런스를 가리키는게 아니라 0번 레퍼런스와 같다.
	  x.name = "우헤헤";

	  Member x02;
	  x02 = x;
	  x02.name = "헐"; //우헤헤 대신 헐이 들어간다.
*/



	  // Member 인스턴스의 주소를 담을 레퍼런스 배열을 준비한다.
	  final int LENGTH = 100;
	  Member[] members = new Member[LENGTH];	// [ , , , , ]


	 java.util.Scanner keyInput = new java.util.Scanner(System.in);

    System.out.println("[회원]");

    final int MAX_LENGTH = 5;		// final을 입력하면 변수 값을 바꿀 수 없다
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];
    long currentMillis;
    int count = 0;

    for (int i = 0; i < MAX_LENGTH; i++) {
    	count++;
    	Member m = new Member();

    	System.out.print("번호? ");
    	no[i] = keyInput.nextInt();
    	keyInput.nextLine();

    	System.out.print("이름? ");
    	name[i] = keyInput.nextLine();

    	System.out.print("이메일? ");
    	email[i] = keyInput.nextLine();

    	System.out.print("암호? ");
    	password[i] = keyInput.nextLine();

    	System.out.print("사진? ");
    	photo[i] = keyInput.nextLine();;

    	System.out.print("전화? ");
    	tel[i] = keyInput.nextLine();

    	currentMillis = System.currentTimeMillis();		//1970-1-1 00:00:00에서 경과된 밀리초를 나타낸다.
    	now[i] = new java.sql.Date(currentMillis);
    	System.out.println();

    	System.out.print("계속 입력하시겠습니까?(y/N)");
    	String response =keyInput.nextLine();

    if(response.equalsIgnoreCase("y") == false)
    	break;	//반복문을 멈춰라.
    }
    keyInput.close();

    System.out.println("-----------------------------------------");
    for (int i = 0; i < LENGTH; i++) {
        // 번호, 이름, 이메일, 전화, 가입일
        System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
            members[i].no, // 회원 번호
            members[i].name, // 이름
            members[i].email, // 이메일
            members[i].tel, // 전화
            members[i].createdDate // 가입일
            );





  }
}
