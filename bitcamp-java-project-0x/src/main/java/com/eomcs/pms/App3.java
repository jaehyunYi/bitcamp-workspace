package com.eomcs.pms;
// 클래스이름 Task
import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {

	  class Task {
		 int no;
		 String content;
		 Date completedDate;
		 int status;
		 String worker;


	 }
	 System.out.println("[작업]");
      Scanner sc = new Scanner(System.in);

      final int LENGTH = 100;
      Task[] tasks = new Task[LENGTH];

      System.out.print("프로젝트? ");
      String project = sc.nextLine();
      System.out.println();
      int count = 0;

      for (int i = 0; i < LENGTH; i++) {
    	  Task t = new Task();
    	  System.out.print("번호? ");
    	  t.no = Integer.parseInt(sc.nextLine());

    	  System.out.print("내용? ");
    	  t.content = sc.nextLine();

    	  System.out.print("마감일? ");
    	  t.completedDate = Date.valueOf(sc.nextLine());

    	  System.out.print("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    	  t.status = Integer.parseInt(sc.nextLine());

    	  System.out.print("담당자? ");
    	  t.worker = sc.nextLine();

    	  tasks[count++] = t;

    	  System.out.println();
    	  System.out.print("계속 입력하시겠습니까?(y/N)");
    	  String str = sc.nextLine();
    	  if (!str.equalsIgnoreCase("y"))
    			  break;
    	  System.out.println();
      }
      sc.close();
      System.out.println("-----------------------------");
      System.out.printf("[%s]\n", project);

      for (int i = 0; i < LENGTH; i++) {
    	  String stateLabel = null;
    	  switch(tasks[i].status) {
    	  	case 0:
    	  		stateLabel = "신규";
    	  		break;
    	  	case 1:
    	  		stateLabel = "진행중";
    	  		break;
    	  	default :
    	  	stateLabel = "완료";
    	  }

      		System.out.printf("%d, %s, %s, %s, %s\n",
      				tasks[i].no,
      				tasks[i].content,
      				tasks[i].completedDate,
      				stateLabel,
      				tasks[i].worker
      				);


      	}



  }
}
