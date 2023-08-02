package com.javaAssignments;

import java.util.Scanner;

public class Class_8_Activity_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a+b>c+d) {
			System.out.println("Sum of a and b is greater than c and d ");
		}else {
			System.out.println("Sum of a and b is not greater than c and d");
		}

		
	}

}
