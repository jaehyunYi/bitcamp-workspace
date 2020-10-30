// for 반복문

package com.eomcs.basic.ex06;

import java.util.ArrayList;

public class Exam0410 {
	public static void main(String[] args) {

		ArrayList scores = new ArrayList();

		scores.add(100);
		scores.add(90);
		scores.add(80);
		scores.add(70);
		scores.add(60);
		scores.add(50);

		for (int i = 0; i < scores.size(); i++) {
			System.out.println(scores.get(i));
		}

		for (Object value : scores) {
			System.out.println(value);
		}



	}
}
