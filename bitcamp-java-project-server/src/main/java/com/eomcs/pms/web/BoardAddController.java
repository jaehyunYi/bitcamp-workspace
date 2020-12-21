package com.eomcs.pms.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.Controller;

import com.eomcs.pms.domain.Board;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.BoardService;

@RequestMapping("/board/add")
public class BoardAddController implements Controller {

  BoardService boardService;

  public BoardAddController(BoardService boardService) {
    this.boardService = boardService;
  }

  public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

    Board board = new Board();
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    Member loginUser = (Member) request.getSession().getAttribute("loginUser");
    board.setWriter(loginUser);
    boardService.add(board);
    return "redirect:list";
  }
}
