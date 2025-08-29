package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("enter Radius:");
         int radius=sc.nextInt();
         double area=3.14*radius*radius;
         System.out.println("area of circle is : "+area);
         sc.close();
	}

}
