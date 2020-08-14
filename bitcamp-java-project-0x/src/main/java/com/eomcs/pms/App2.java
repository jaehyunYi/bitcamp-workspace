package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  public static void main(String[] args) {

	  class Project {
		  int no;
		  String title;
		  String content;
		  Date startDate;
		  Date endDate;
	     String owner;
	     String members;
	  }
	  System.out.println("[프로젝트]");

	  Scanner sc = new Scanner(System.in);

	  final int LENGTH = 100;
	  Project[] projects = new Project[LENGTH];

	  int count = 0;
	  for (int i = 0; i < 100; i++) {
		  Project p = new Project();

		  System.out.print("번호? ");
		  p.no = sc.nextInt();

		  System.out.print("프로젝트명? ");
		  p.title = sc.nextLine();

		  System.out.print("내용? ");
		  p.content = sc.nextLine();

		  System.out.print("시작일? ");
		  p.startDate = Date.valueOf(sc.nextLine());

		  System.out.print("종료일? ");
		  p.endDate = Date.valueOf(sc.nextLine());

		  System.out.print("만든이? ");
		  p.owner = sc.nextLine();

		  System.out.print("팀원? ");
		  p.members = sc.nextLine();

		  projects[count++] = p;
		  // 밖에서 선언한 projects에 p 레퍼런스를... 저장

		  System.out.println();
		  System.out.println("계속 입력하시겠습니까?(Y/N)");
		  String str = sc.nextLine();
		  if (!str.equalsIgnoreCase("y")) {
			  break;
		  }
		  System.out.println();
	  }
	  sc.close();
	  System.out.println("-----------------------------");

	  for (int i = 0; i < count; i++) {
		  System.out.printf("[%d, %s, %s, %s, %s, %s]\n",
				  projects[i].no,
				  projects[i].title,
				  projects[i].content,
				  projects[i].startDate,
				  projects[i].endDate,
				  projects[i].owner,
				  projects[i].members
				  );
	  }






	    }
}
