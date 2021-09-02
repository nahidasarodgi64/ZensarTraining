package Loops;

import java.util.Scanner;
import java.util.*;
public class Loop9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result=1;
		while(num!=0){
			result=result*(num%10);
			num=num/10;
		}
		System.out.println(result);
		sc.close();
}
}