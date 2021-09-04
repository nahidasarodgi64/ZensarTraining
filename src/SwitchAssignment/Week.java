package SwitchAssignment;
import java.util.Scanner;

public class Week{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1 to 7");
		int choice=sc.nextInt();
	 if(choice<=7){
		switch(choice){
			case 1:
				System.out.println(choice+"- Monday");
				break;
			case 2:
				System.out.println(choice+"- Tuesday");
				break;
			case 3:
				System.out.println(choice+"- Wesday");
				break;
			case 4:
				System.out.println(choice+"- Thusday");
				break;
			case 5:
				System.out.println(choice+"- Friday");
				break;
			case 6:
				System.out.println(choice+"- Satarday");
				break;
			case 7:
				System.out.println(choice+"- Sunday");
				break;
		}
	}
	else{
		System.out.println("Day not exit");
	}
	 sc.close();
}
}