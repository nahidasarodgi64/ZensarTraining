import java.util.Scanner;
public class Maxthree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		int three=sc.nextInt();
		if(one>two && one>three){
			System.out.println("One is greater");
		}
		else if(two>one && two>three){
			System.out.println("One is greater");
		}
		else{
			System.out.println("three is greater");
		}
}
}