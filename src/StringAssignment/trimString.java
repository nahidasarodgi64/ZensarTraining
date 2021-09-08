package StringAssignment;

import java.util.Scanner;

public class trimString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=sc.nextLine();
	System.out.println("String with Trime="+s1);
	s1=s1.trim();
	System.out.println("Trime of String="+s1);

}
}
