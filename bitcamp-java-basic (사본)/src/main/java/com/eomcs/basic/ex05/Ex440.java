package com.eomcs.basic.ex05;

public class Ex440 {
	public static void main(String[] args) {
		
		int i = 0x27a130ff ; // 00100111_10100001_00110000_11111111
		int a, b, c, d;
		System.out.println(Integer.toHexString(i));
		
		a = i >> 24;
		// 	  00100111_10100001_00110000_11111111
		// >> 00000000_00000000_00000000_00100111 
		
		b = (i >> 16) & 0xff;
		// 	  00000000_00000000_00100111_10100001
		//	& 00000000_00000000_00000000_11111111
		// ---------------------------------------
		// 	  00000000_00000000_00000000_10100001
		
		c = (i >> 8) & 0xff;
		//	  00000000_00100111_10100001_00110000
		//	& 00000000_00000000_00000000_11111111
		// ---------------------------------------
		//	  00000000_00000000_00000000_00110000
		d = i & 0xff;
		//	  00100111_10100001_00110000_11111111
		//	& 00000000_00000000_00000000_11111111
		// ---------------------------------------
		// 	  00000000_00000000_00000000_11111111
		
	    System.out.println(Integer.toHexString(a));
	    System.out.println(Integer.toHexString(b));
	    System.out.println(Integer.toHexString(c));
	    System.out.println(Integer.toHexString(d));
	}

}
