package SwitchAssignment;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choices are\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Mod");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		System.out.println("Enter the values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=0;
		switch(choice) {
			case 1:
				result=a+b;
				System.out.println(result);
				break;
			case 2:
				result=a-b;
				System.out.println(result);
				break;
			case 3:
				result=a*b;
				System.out.println(result);
				break;
			case 4:
				result=a/b;
				System.out.println(result);
				break;
			case 5:
				result=a%b;
				System.out.println(result);
				break;
			default:
				System.out.println("Enter choice is Invalid");
	}
}
}
