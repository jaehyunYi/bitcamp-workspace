package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : >>, >>>, <<
//
public class Exam0431 {
  public static void main(String[] args) {
    // 음수를 이동:
    // - 왼쪽 빈자리는 0으로 채운다.



    int i = -87;  // 11111111_11111111_11111111_10101001;

    System.out.println(i);

    System.out.println(i >>> 1);
    // [ 1111111111111111111111111010100]1
    // [01111111111111111111111111010100]1    => 2147483604

    System.out.println(i >>> 2);
    // [  111111111111111111111111101010]01
    // [00111111111111111111111111101010]    => 1073741802

    System.out.println(i >>> 3);
    // [   11111111111111111111111110101]001
    // [00011111111111111111111111110101]    => 536870901

    System.out.println(i >>> 4);
    // [    1111111111111111111111111010]1001
    // [00001111111111111111111111111010]    => 268435450
  }
}
