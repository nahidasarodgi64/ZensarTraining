package StringAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public void checkAnagram(String str1,String str2) {
		
		if(str1.length()!=str2.length()) {
			char[] arr1=str1.toLowerCase().toCharArray();
			char[] arr2=str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(arr1.equals(arr2)){
				System.out.println("String is Anagram");
			
			}
			else {
				System.out.println("String is Anagram");
			}
		}
		else {
			System.out.println("String is not Anagram");
		}
		
	}
	public static void main(String[] args) {
		Anagram a1=new Anagram();
		Scanner str=new Scanner(System.in);
		String s1=str.nextLine();
		String s2=str.nextLine();
		a1.checkAnagram(s1,s2);
	}

}
