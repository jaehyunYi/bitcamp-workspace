package com.eomcs.pms.handler;

import com.eomcs.util.Prompt;
//import com.eomcs.pms.handler.BoardList.Board;

public class BoardHandler {
	//BoardHandler가 사용할 BoardList객체를 준비한다.
	BoardList boardList = new BoardList();



		  // 다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
		  public void add() {
		    System.out.println("[새 게시글]");

		    BoardList.Board b = new BoardList.Board();
		    b.no = Prompt.inputInt("번호? ");
		    b.title = Prompt.inputString("제목? ");
		    b.content = Prompt.inputString("내용? ");
		    b.writer = Prompt.inputString("작성자? ");

		    list[size++] = b;
		    System.out.println("게시글을 등록하였습니다.");
		  }

		  public  void list() {
		    System.out.println("[게시물 등록]");

		    BoardList.Board[] boards = boardList.toArray();

		    for (Board board : boards) {
		      Board b = list[i];
		      System.out.printf("%d, %s, %s, %s, %s, %d\n",
		    		  b.no,
		    		  b.title,
		    		  b.writer,
		    		  b.registeredDate,
		    		  b.viewCount);

		    }
		  }

}
