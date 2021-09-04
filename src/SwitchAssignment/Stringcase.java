package SwitchAssignment;

import java.util.Scanner;

public class Stringcase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
		String s1=sc.nextLine();
		switch(s1){
			case "Hi":
				System.out.println("Hello");
				break;
			case "Good morning":	
				System.out.println("Good Morning");
				break;
		}
		sc.close();
}
}