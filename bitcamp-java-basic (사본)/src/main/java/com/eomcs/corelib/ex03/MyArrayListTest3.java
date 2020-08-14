package com.eomcs.corelib.ex03;

public class MyArrayListTest3 {
	public static void main(String[] args) {
		// aaa, bbb, ccc, ddd, eee
		MyArrayList list1 = new MyArrayList();
		list1 .add("aaa");	// aaa
		list1.add("bbb");		// aaa bbb
		list1.add("ccc");		// aaa bbb ccc
		list1.add("ddd");		// aaa bbb ccc ddd
		list1.add("eee");		// aaa bbb ccc ddd eee


		// fff, ggg, hhh, iii
		MyArrayList list2 = new MyArrayList();
		list2.add("fff");		// aaa bbb ccc ddd eee fff
		list2.add("ggg");		// aaa bbb ccc ddd eee fff ggg
		list2.add("hhh");		// aaa bbb ccc ddd eee fff ggg hhh
		list2.add(8,"iii");
		print(list1);
		print(list2);
	}


	static void print(MyArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.print(str+", ");

		}
		System.out.println();
	}
}