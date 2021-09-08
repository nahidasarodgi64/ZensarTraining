package StringAssignment;

import java.util.Scanner;

public class PalindromeString {
	public void  palindrome(String s1) {
		char ch[]=s1.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		if(s1.equals(rev)) 
			System.out.println(s1+" is palindrome");
		else {
		System.out.println(s1+" is not palindrome");
		}
	}
	public static void main(String[] args) {
		PalindromeString p1=new PalindromeString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		p1.palindrome(str);
	}

}
