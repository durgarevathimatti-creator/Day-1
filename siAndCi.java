package com.codegnan.fundamentals;

import java.util.Scanner;

public class siAndCi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input the principal amount
		System.out.println("Enter the principal amount : ");
		double principal=sc.nextDouble();
		//input the rate of interest
		System.out.println("Enter the rate of interest : ");
		double interest=sc.nextDouble();
		System.out.println("Enter the time in months : ");
		int months=sc.nextInt();
		//converting time from months to years
		double time=months/12f;
		//calculating simple and compound interests
		double simpleInterest=(principal*interest*time)/100;
		double siAmount=principal+simpleInterest;
		double compoundInterest=(principal*Math.pow(1+interest/100,time))-principal;
		double ciAmount=principal+compoundInterest;
		//displying results
		System.out.println("Time in years :  "+time);
		System.out.println("simple interest is: "+simpleInterest+"and its total amount is: "+siAmount);
		System.out.println("compound interest is: "+compoundInterest+"and its total amount is: "+ciAmount);
		sc.close();
		
	}

}
