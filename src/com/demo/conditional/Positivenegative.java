package com.demo.conditional;

import java.util.Scanner;
public class Positivenegative{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>0){
			System.out.println("Number is Positive");
		}
		else if(num==0){
			System.out.println("Number is Zero");
		}
		else{
			System.out.println("Number is Negative");
		}
		sc.close();
}
}