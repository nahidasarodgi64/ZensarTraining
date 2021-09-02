package Loops;

import java.util.Scanner;
public class Loop19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=0){
			sum=sum+(num%10);
			num=num/10;
		}
		if(num%sum==0){
			System.out.println("Harshad/Niven number");
		}
		else{
			System.out.println("not Harshad/Niven number");
		}
		sc.close();
	}
}