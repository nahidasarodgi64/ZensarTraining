package SwitchAssignment;

import java.util.Scanner;

public class Countdays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choice are\n 1.Jan\n2.Feb\n3.March\n4.April\n5.May\n6.Jun\n7.July\n8.Agust\n9.September\n10.Oct\n11.Nov\n12.Dec");
		System.out.println("Enter the Choice");
		int choice=sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Jan has 30 days");
				break;
			case 2:
				System.out.println("Feb has 31 days");
				break;
			case 3:
				System.out.println("March has 30 days");
				break;
			case 4:
				System.out.println("April has 31 days");
				break;
			case 5:
				System.out.println("May has 30 days");
				break;
			case 6:
				System.out.println("Jun has 31 days");
				break;
			case 7:
				System.out.println("July has 30 days");
				break;
			case 8:
				System.out.println("Agust has 31 days");
				break;
			case 9:
				System.out.println("Sep has 30 days");
				break;
			case 10:
				System.out.println("Oct has 31 days");
				break;
			case 11:
				System.out.println("Nov has 30 days");
				break;
			case 12:
				System.out.println("Dec has 31 days");
				break;
			
		}
		sc.close();

	}
}
