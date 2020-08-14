package com.eomcs.basic.ex07;

import java.util.ArrayList;

//	Stack과 Heap메모리 영역
public class Exam0413 {
		  public static void main(String[] args) throws Exception {
			  ArrayList list = new ArrayList();


			  while(true){
				  createArray();
				  Thread.currentThread().sleep(2000);
			  }


		}

			  static int[] createArray() {
				  System.out.print(".");
				 return new int[10_000_000];
				  }



}
