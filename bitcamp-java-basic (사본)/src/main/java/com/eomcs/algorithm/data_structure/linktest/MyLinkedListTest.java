package com.eomcs.algorithm.data_structure.linktest;

public class MyLinkedListTest {
	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));

		System.out.println("----------------------------");

		print(list);

		System.out.println("----------------------------");

		System.out.println("< 삽입하는 add >");
		System.out.println();
		list.add(2, "eee");
		print(list);
		list.add(0, "fff");
		print(list);
		list.add(6, "ggg");
		print(list);
		list.add("hhh");
		print(list);


		System.out.println("---------------------------");
		System.out.print("<REMOVE>\n\n");
		list.remove(4);
		print(list);
		list.remove(0);
		print(list);
		list.remove(5);
		print(list);

		System.out.println("-----------------------------------");
		System.out.print("< SET >\n\n");
		list.set(1, "xxx");
		print(list);
		list.set(0, "yyy");
		print(list);
		list.set(4, "zzz");
		print(list);

	}


	static void print(MyLinkedList list) {
		for (int i = 0; i < list.size; i++) {
			System.out.print(list.get(i) + ",");
		}
		System.out.println();

	}


	static void print2(Object[] arr) {
		for (Object obj : arr) {
			System.out.print(obj + ",");
		}
		System.out.println();
	}

}
