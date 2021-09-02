package com.demo.conditional;

import java.util.Scanner;
import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice are 1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modules");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter secound number");
		int num2=sc.nextInt();
		int result=0;
		switch(choice){
			case 1:
				result=num1+num2;
				System.out.println("Addition="+ result);
				break;
			case 2:
				result=num1-num2;
				System.out.println("Substraction="+ result);
				break;
			case 3:
				result=num1*num2;
				System.out.println("Multplication="+ result);
				break;
			case 4:
				result=num1%num2;
				System.out.println("Modules="+ result);
				break;
			default:
				System.out.println("Finished");
				
		}
		sc.close();
}
}
		