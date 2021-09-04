package SwitchAssignment;

import java.util.Scanner;

public class NumberWords{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 to 5");
		int choice=sc.nextInt();
	 if(choice<=5){
		switch(choice){
			case 1:
				System.out.println(choice+"- One");
				break;
			case 2:
				System.out.println(choice+"- Two");
				break;
			case 3:
				System.out.println(choice+"- Three");
				break;
			case 4:
				System.out.println(choice+"- Four");
				break;
			case 5:
				System.out.println(choice+"- Five");
				break;
			default:
				System.out.println("Number is Invalid");
		}
	}
	 sc.close();
}
}