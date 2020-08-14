// call by reference
package com.eomcs.basic.ex07;

public class Exam0320 {

	static void swap(int[] arr) {
		System.out.printf("swap(): arr[0] = %d, arr[1] = %d\n",arr[0], arr[1]);
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		System.out.printf("swap(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
	}
	public static void main(String[] args) {

		int[] arr = new int[] {100, 200};
		swap(arr);
		System.out.printf("main(): arr[0] = %d, arr[1] = %d\n",arr[0], arr[1]);
	}
}


