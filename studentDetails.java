package com.codegnan.fundamentals;

import java.util.Scanner;

public class studentDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input student name
		System.out.println("Enter the student name: ");
		String name=sc.next();
		//input the student roll number
		System.out.println("Enter the student roll number: ");
		int rollNumber=sc.nextInt();
		//input the student Age
		System.out.println("Enter the student Age: ");
		int age=sc.nextInt();
		//input student Grade
		System.out.println("Enter the student Grade: ");
		String grade=sc.next();
		//display student details in a clear format
		System.out.println("Student Name : "+name);
		System.out.println("Student Roll Number : "+rollNumber);
		System.out.println("Student Age : "+age);
		System.out.println("Student Grade : "+grade);
		sc.close();
	}

}
