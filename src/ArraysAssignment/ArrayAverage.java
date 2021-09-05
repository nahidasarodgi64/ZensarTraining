package ArraysAssignment;

import java.util.Scanner;

public class ArrayAverage {
	int a[]=new int[5];
	int sum=0;
	Scanner sc=new Scanner(System.in);
	
	void getArray() {
		System.out.println("Enter Array Values");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	void Average() {
		System.out.println("Array Average is");
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		int average=sum/5;
		System.out.println(average);
		
	}
	
	public static void main(String[] args) {
		ArrayAverage s1=new ArrayAverage();
		s1.getArray();
		s1.Average();
		
	}
	
}
