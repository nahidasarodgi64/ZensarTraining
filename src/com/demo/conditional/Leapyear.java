package com.demo.conditional;

import java.util.Scanner;
public class Leapyear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%400==0){
			System.out.println("Year is Leap Year");
		}
		else if(year%100==0){
			System.out.println("Year is not Leap Year");
		}
		else if(year%4==0){
			System.out.println("Year is Leap Year");
		}
		
		else{
		System.out.println("Year is Leap Year");
}
}
}