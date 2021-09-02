package Loops;

import java.util.Scanner;
public class Loop7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=0;
		for(int i=1;i<=num;i++){
			if(num%2!=0){
				result+=num;
			}
		}
		
		System.out.println("Sum of n="+result);
		sc.close();
}
}
