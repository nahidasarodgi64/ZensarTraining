package Loops;

import java.util.Scanner;

public class Loop6{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int result=0;
		for(int i=1;i<=num;i++){
			if(num%2==0){
				result+=num;
			}
		}
		System.out.println("Sum of n="+result);
		
		Scanner close;
}
}
