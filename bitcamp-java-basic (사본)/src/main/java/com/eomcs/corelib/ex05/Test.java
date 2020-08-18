package com.eomcs.corelib.ex05;

import java.util.Stack;

public class Test {
	public static void main(String[] args) {

		String s1 = new String("aaa");
		String s2 = new String("bbb");
	    String s3 = new String("ccc");
	    String s4 = new String("ddd");
	    String s5 = new String("eee");

	    Stack stack = new Stack();
	    stack.push(s1);
	    stack.push(s2);
	    stack.push(s3);
	    print(stack);

	    System.out.println("(pop)==>" + stack.pop());
	    System.out.println("(pop)==>" + stack.pop());
	    print(stack);

	    stack.push(s4);
	    stack.push(s5);
	    print(stack);

	    System.out.println("-----------------------------");

	    try {
	    	while (true) {
	    		System.out.println(stack.pop());
	    	}
	    } catch (Exception e) {
	    	System.out.println("스택에서 더 이상 꺼낼 값이 없습니다.");
	    }
	}

	static void print(Stack list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println();
	}



}
