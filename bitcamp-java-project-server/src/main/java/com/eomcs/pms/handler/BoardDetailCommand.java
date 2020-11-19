package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Map;
import com.eomcs.pms.domain.Board;
import com.eomcs.pms.service.BoardService;
import com.eomcs.util.Prompt;

public class BoardDetailCommand implements Command {

  BoardService boardService;

  public BoardDetailCommand(BoardService boardService) {
    this.boardService = boardService;
  }

  @Override
  public void execute(PrintWriter out, BufferedReader in, Map<String, Object> context) {
    try {
      out.println("[게시물 상세보기]");
      int no = Prompt.inputInt("번호? ", out, in);
      Board board = boardService.get(no);

      if (board == null) {
        out.println("해당 번호의 게시글이 없습니다.");
        return;
      }
      out.printf("제목: %s\n", board.getTitle());
      out.printf("내용: %s\n", board.getContent());
      out.printf("작성자: %s\n", board.getWriter());
      out.printf("등록일: %s\n", board.getRegisteredDate());
      out.printf("조회수: %d\n", board.getViewCount());

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
      e.printStackTrace();
    }
  }
}
