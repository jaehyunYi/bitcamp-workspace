package com.eomcs.basic.ex05;

public class Ex470 {
	public static void main(String[] args) {
		final int JAVA          = 0x0001; // 0000 0000 0000 0001
	    final int C             = 0x0002; // 0000 0000 0000 0010
	    final int CPP           = 0x0004; // 0000 0000 0000 0100
	    final int PYTHON        = 0x0008; // 0000 0000 0000 1000
	    final int PHP           = 0x0010; // 0000 0000 0001 0000
	    final int KOTLIN        = 0x0020; // 0000 0000 0010 0000
	    final int GROOVY        = 0x0040; // 0000 0000 0100 0000
	    final int JAVASCRIPT    = 0x0080; // 0000 0000 1000 0000
	    final int TYPESCRIPT    = 0x0100; // 0000 0001 0000 0000
	    final int GO            = 0x0200; // 0000 0010 0000 0000
	    final int SQL           = 0x0300; // 0000 0100 0000 0000
	    final int R             = 0x4000; // 0000 1000 0000 0000
	    
	    
	    int d1 = JAVA | C | CPP | JAVASCRIPT;
	    
	    System.out.printf("Java      : %b\n", (d1 & JAVA) == JAVA);
	    System.out.printf("C         : %b\n", (d1 & C) == C);
	    System.out.printf("C++       : %b\n", (d1 & CPP) == CPP);
	    System.out.printf("Python    : %b\n", (d1 & PYTHON) == PYTHON);
	    System.out.printf("PHP       : %b\n", (d1 & PHP) == PHP);
	    System.out.printf("Kotlin    : %b\n", (d1 & KOTLIN) == KOTLIN);
	    System.out.printf("Groovy    : %b\n", (d1 & GROOVY) == GROOVY);
	    System.out.printf("JavaScript: %b\n", (d1 & JAVASCRIPT) == JAVASCRIPT);
	    System.out.printf("TypeScript: %b\n", (d1 & TYPESCRIPT) == TYPESCRIPT);
	    System.out.printf("Go        : %b\n", (d1 & GO) == GO);
	    System.out.printf("SQL       : %b\n", (d1 & SQL) == SQL);
	    System.out.printf("R         : %b\n", (d1 & R) == R);
	    
		
	}

}
