package com.javaAssignments;

import java.util.Scanner;

public class Class_8_Activity_10 {

	public static void main(String[] args) {
		int num, totalDigits = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = s.nextInt();

		while (num != 0) {
			totalDigits++;
			num = num / 10;
		}

		System.out.println("\nThe Total Number of Digits = " + totalDigits);
	}

}
