import java.util.Scanner;
import java.util.*;
public class Threedigit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int l=String.valueOf(num).length();
		int result=0;
		
		if(l==3){
			result=num[0]+num[1];
			System.out.println("yes");
			System.out.println(result);
		}
}
}