package com.eomcs.basic;

import java.util.Scanner;

public class ja{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no1, no2, no3;
        no1 = sc.nextInt();
        no2 = sc.nextInt();
        no3 = sc.nextInt();

        sc.close();

        int no = no1 * no2 * no3;

        int[] count = new int[10];

        for (int i = 0; i < 10; i++) {
        	count[i] = 0;
        }

        while(true) {
        	for (int i = 0; i < 10; i ++) {
        		if (no % 10 == count[i])
        			count[i]++;
        	}
        	no = no / 10;

        	if(no / 10 == 0)
        		break;
        }
        for(int i = 0; i < 10; i++) {
        	System.out.println(count[i]);
        }
    }
}