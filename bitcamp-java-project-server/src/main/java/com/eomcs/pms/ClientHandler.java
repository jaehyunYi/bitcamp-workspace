package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

// 클라이언트의 요청을 처리하는 일을 한다.
public class ClientHandler implements Runnable {

	Socket socket;

	public ClientHandler(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		InetAddress address = socket.getInetAddress();
		System.out.printf("클라이언트(%s)가 연결되었습니다!\n",
			address.getHostAddress());

		try (Socket socket = this.socket; // 자동으로 close() 호출하기 위해 괄호안에 socket선언함.
  	          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
  	          PrintWriter out = new PrintWriter(socket.getOutputStream());) {


  	    	  while(true) {
  	    		  String request = in.readLine();
  	    		   sendResponse(out, request);
  	    		  if (request.equalsIgnoreCase("quit"))
  	    			  break;
  	    	  }

		} catch (Exception e) {
			System.out.println("클라이언트와 통신 오류!");
		}
		System.out.printf("클라이언트(%s)와의 연결을 끊었습니다.\n",
				address.getHostAddress());


	}

	// 인스턴스 멤버를 사용하지 않는다면 스태틱이 기본이지만
	// 추후 확장 가능성을 고려해 인스턴스를 사용한다.
	private void sendResponse(PrintWriter out, String message) {
		out.println(message);
		out.println();	// 응답의 끝났음을 알려주는 빈 줄.
		out.flush();
}


}
