package StringAssignment;

import java.util.Scanner;

public class ValidEmail {
	public void checkEmail(String str) {
		if(str.contains("@")) {
			if(str.contains(".")){
				System.out.println("Email Id is Valid");
			}
			else {
				System.out.println("Email is not Valid");
			}
		}
		else {
			System.out.println("Email is not Valid");
		}
	}
	public static void main(String[] args) {
		ValidEmail a1=new ValidEmail();
		Scanner str=new Scanner(System.in);
		String s1=str.nextLine();
		
		a1.checkEmail(s1);
	}


}
