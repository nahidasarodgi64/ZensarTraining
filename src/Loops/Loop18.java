package Loops;

import java.util.Scanner;
public class Loop18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int square=num*num;
		while(num>0){
			if(num%10 !=square%10){
				System.out.println("number is not Automorphic");
			}
			num=num/10;
			square=square/10;

		}
		System.out.println("number is Automorphic");
		sc.close();
}
}