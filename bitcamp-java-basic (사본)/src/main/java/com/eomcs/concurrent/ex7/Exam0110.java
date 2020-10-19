package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0110 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		executorService.execute(() -> System.out.printf("%s = Hello\n",
				Thread.currentThread().getName()));
		executorService.shutdown();

		System.out.println("main() 종료!");

	}

}
