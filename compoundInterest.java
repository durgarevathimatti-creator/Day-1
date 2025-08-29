package com.codegnan.fundamentals;

import java.util.Scanner;

public class compoundInterest {

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
		//calculate compound interest and total amount
        double totalAmount=principal*Math.pow(1+interest/100,time);
        double compoundInterest=totalAmount-principal;
        //displaying the result
        System.out.println("compound interest is: "+compoundInterest);
        System.out.println("total amount is: "+totalAmount);
        sc.close();
	}
}
