package Loops;

import java.util.Scanner;
public class Loop17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp,r,sum=0;
		temp=num;
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum){
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");

			}
		sc.close();
}
}
