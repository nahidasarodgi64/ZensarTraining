package SwitchAssignment;

import java.util.Scanner;

public class VowelConsonante {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the chracter");
		char ch=sc.next().charAt(0);
		
		switch(ch) {
		case 'a','e','i','o','u':
			System.out.println(ch+" is Vowel");
			break;
			default:
				System.out.println(ch+" is Consonante");
			break;
		}
	sc.close();

}
}
