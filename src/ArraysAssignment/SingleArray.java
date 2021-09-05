package ArraysAssignment;

import java.util.Scanner;

public class SingleArray {
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	
	void getArray() {
		System.out.println("Enter Array Values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	void display() {
		System.out.println("Array Values are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		SingleArray s1=new SingleArray();
		s1.getArray();
		s1.display();
		
	}
	
}
