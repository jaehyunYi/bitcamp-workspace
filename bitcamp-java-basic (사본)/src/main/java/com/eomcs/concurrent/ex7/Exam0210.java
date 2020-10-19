// Executors 태스크 프레임워크 - 스레드풀 만들기 : 고정크기 스레드풀
package com.eomcs.concurrent.ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0210 {

  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중...\n",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    // 일단 스레드풀의 크기만큼 작업 수행을 요청한다.
    // - 작업은 큐에 등록된 순서대로 보관된다.
    // - 스레드풀은 큐에서 작업을 꺼내 스레드에게 일을 시킨다.
    //
    executorService.execute(new MyRunnable(6000));
    executorService.execute(new MyRunnable(3000));
    executorService.execute(new MyRunnable(9000));
    executorService.execute(new MyRunnable(2000));
    executorService.execute(new MyRunnable(4000));

    System.out.println("main() 종료!");
  }
}

