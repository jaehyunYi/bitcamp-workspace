package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;


//	1) 회원의 번호, 이름, 이메일, 암호, 사진, 전화번호, 등록일을 담을 수 있는
//		메모리를 설계한다. => Member 클래스 정의
// 2) Member 클래스의 레퍼런스 배열을 만들어 Member의 인스턴스를 보관한다.
// 3)
public class App{

  public static void main(String[] args) {

	  class Member {
		  int no;
		  String name;
		  String email;
		  String password;
		  String photo;
		  String tel;
		  Date createdDate;
	  }

	  Scanner sc = new Scanner(System.in);
	  int count = 0;
	  final int LENGTH = 100;

	  Member[] members = new Member[LENGTH];

	  System.out.println("[회원]");

	  for (int i = 0; i < LENGTH; i++) {
		  Member m = new Member();
		  System.out.print("번호? ");
		  m.no = Integer.parseInt(sc.nextLine());

		  System.out.print("이름? ");
		  m.name = sc.nextLine();

		  System.out.print("이메일? ");
		  m.email = sc.nextLine();

		  System.out.print("암호? ");
		  m.password = sc.nextLine();

		  System.out.print("사진? ");
		  m.photo = sc.nextLine();

		  System.out.print("전화? ");
		  m.tel = sc.nextLine();

		  System.out.print("날짜? ");
		  m.createdDate = Date.valueOf(sc.nextLine());

		  members[i] = m;
		  count++;

		  System.out.println("");
		  System.out.print("계속 입력하시겠습니까?(Y/N)");
		  String str = sc.nextLine();
		  System.out.println();
		  if (!str.equalsIgnoreCase("y"))
			  break;
	  }
	  sc.close();

	  System.out.println("-------------------------------------");
	  for(int i = 0; i < LENGTH; i++) {
		 System.out.printf("[%d %s %s %s %s]\n",
				 members[i].no,
				 members[i].name,
				 members[i].email,
				 members[i].tel,
				 members[i].createdDate
				 );
	  }







  }
}
