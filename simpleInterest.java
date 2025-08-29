package com.codegnan.fundamentals;

import java.util.Scanner;

public class simpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input the principal amount
		System.out.println("enter the principle amount: ");
		double principal=sc.nextDouble();
		//input the rate of interest in %
		System.out.println("enter the rate of interest in %: ");
		double interest=sc.nextDouble();
		//input the time period
		System.out.println("enter the time in years: ");
		double time=sc.nextDouble();
		//calculate simple interest and total amount
		double simpleInterest=(principal*interest*time)/100;
		double totalAmount=principal+simpleInterest;
		//display the result;
		System.out.println("The simple interest is: "+simpleInterest);
		System.out.println("The Total amount is: "+totalAmount);
		sc.close();
	}

}
