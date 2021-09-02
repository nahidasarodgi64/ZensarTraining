import java.util.Scanner;
public class Vowelornot{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char s1=sc.next().charAt(0);
	
		if(s1=='a' || s1=='e' || s1=='i' || s1=='o' || s1=='u'){
			System.out.println("Input is vowel");
		}
		else{
			System.out.println("Input is consonant");
		}
}
}