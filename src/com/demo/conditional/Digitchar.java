package com.demo.conditional;

import java.util.Scanner;
public class Digitchar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char s1=sc.next().charAt(0);
		if(s1>='0' && s1<='9'){
			System.out.println("Input contain digit");
		}
		else if((s1>='a' && s1<='z')||(s1>='A' && s1<='Z')){	
			System.out.println("Input contain charcter ");
		}
		else{
			System.out.println("Input contain special charcter");
		}
		sc.close();
		
}
}
