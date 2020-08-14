package com.eomcs.corelib.ex03;
import java.util.ArrayList;

public class MyArrayListTest4 {
	public static void main(String[] args) {
		// aaa, bbb, ccc, ddd, eee
		ArrayList list1 = new ArrayList();
		list1 .add("aaa");	// aaa
		list1.add("bbb");		// aaa bbb
		list1.add("ccc");		// aaa bbb ccc
		list1.add("ddd");		// aaa bbb ccc ddd
		list1.add("eee");		// aaa bbb ccc ddd eee


		// fff, ggg, hhh, iii
		ArrayList list2 = new ArrayList();
		list2.add("fff");		// aaa bbb ccc ddd eee fff
		list2.add("ggg");		// aaa bbb ccc ddd eee fff ggg
		list2.add("hhh");		// aaa bbb ccc ddd eee fff ggg hhh
		list2.add(8,"iii");
		print(list1);
		print(list2);
	}


	static void print(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.print(str+", ");

		}
		System.out.println();
	}
}