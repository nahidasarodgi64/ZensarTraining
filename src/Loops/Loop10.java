package Loops;

import java.util.Scanner;
public class Loop10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] digitcount=new int[10];
		while(num!=0){
			int lastdigit=num%10;
			digitcount[lastdigit]++;
			num=num/10;
		}
		sc.close();
		for(int i=0;i<digitcount.length;i++){
			if(digitcount[i]!=0){
				System.out.println(" "+i+" = "+digitcount[i]);
			}
		}
	}
}