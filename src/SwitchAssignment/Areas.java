package SwitchAssignment;

import java.util.Scanner;
public class Areas{
	public static void main(String[] args){
		System.out.println("Choices are\n1.Area of circle\n2.Area of rectangle\n3.Area of triangle");
		System.out.println("Enter the choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		double pie=3.14;
		switch(choice){
			case 1:
				int radius;
				double area=0;
				System.out.println("Enter Radius");
				radius=sc.nextInt();
				area=2*radius*pie;
				System.out.println("Area of circle="+area);
				break;
			case 2:
				int length,width;
				System.out.println("Enter length");
				length=sc.nextInt();
				System.out.println("Enter width");
				width=sc.nextInt();
				System.out.println("Area of Rectangle="+ length*width);
				break;
			case 3:
				int side;
				side=sc.nextInt();
				System.out.println("Area of Triangle="+ side*side*side);
				break;
		}
		sc.close();
}
}