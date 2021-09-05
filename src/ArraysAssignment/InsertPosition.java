package ArraysAssignment;

import java.util.Scanner;

public class InsertPosition {
	public static void main(String[] args) {
		int a[]= {2,45,6,12};
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		int value=sc.nextInt();
		a[index]=value;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
