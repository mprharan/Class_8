package com.javaAssignments;

import java.util.Scanner;

public class Class_8_Activity_9 {

	public static void main(String[] args) {

		int seniorage = 60;
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age > seniorage) {
			System.out.println("This person is a senior citizen");
		} else {
			System.out.println("This person is not a senior citizen");
		}

	}

}
