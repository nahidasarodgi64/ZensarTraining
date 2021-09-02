package com.demo.conditional;

import java.util.Scanner;

public class Salary{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		if(salary<=10000){
			int hra=(20/100)*salary;
			int da=(80/100)*salary;
			int gross=salary+hra+da;
			System.out.println("Gross salary="+gross);
		}
		else if(salary<=20000){
			int hra=(25/100)*salary;
			int da=(90/100)*salary;
			int gross=salary+hra+da;
			System.out.println("Gross salary="+gross);
		}
		else if(salary>20000){
			int hra=(30/100)*salary;
			int da=(95/100)*salary;
			int gross=salary+hra+da;
			System.out.println("Gross salary="+gross);
		}
		sc.close();
}
}