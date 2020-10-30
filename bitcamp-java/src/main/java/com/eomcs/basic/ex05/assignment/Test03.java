package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 
// 다음 int 변수에 들어 있는 값 
// 다음과 같이 첫 바이트부터 끝 바이트까지 순서대로 출력하라!
// 실행 예)
// 입력? 28644344397
// aa
// bb
// cc
// dd

//
public class Test03 {

  public static void main(String[] args) {
    
	  int value = 0xaabbccdd;	 //10101010_10111011_11001100_11011101
	  // 코드를 완성하시오!
	  System.out.println(Integer.toHexString(value >> 24 & 0xff));
	  //	  11111111_11111111_11111111_10101010 = ffffffaa
	  //	& 000000000_0000000000_000000000_11111111 	 
	  // -----------------------------------------------------------
	  //	  000000000_000000000_000000000_10101010
	  
	  
	  System.out.println(Integer.toHexString(value >> 16 & 0xff));
	  
	  System.out.println(Integer.toHexString(value >> 8 & 0xff));
	  
	  System.out.println(Integer.toHexString(value & 0xff));
  }

}








