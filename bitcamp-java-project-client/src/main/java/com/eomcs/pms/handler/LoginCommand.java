package com.eomcs.pms.handler;

import java.util.Map;

import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class LoginCommand implements Command {

	try {
	MemberDao memberDao;

	public LoginCommand(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

  @Override
  public void execute(Map<String,Object> context) {
    System.out.println("[ 로그인 ]");
    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("암호? ");

    Member member = memberDao.findByEamilPassword(email, password);
    if (member == null) {
    	System.out.println("사용 자 정보가 맞지 않습니다.");
    } else {
    	// 로그인이 성공했으면 회원 정보를 context 보관소에 저장한다.
    	context.put("loginUser, member)
    	System.out.println(" 	--- xxx님 반갑습니다!!!!!!!!!  ---  ");
    }
  }
	}catch (Exception e) {
	  System.out.println(" 로그인 중 오류발생!");
	  e.printStackTrace();

	}
}
