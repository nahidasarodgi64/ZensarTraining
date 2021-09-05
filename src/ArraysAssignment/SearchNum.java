package ArraysAssignment;

import java.util.Scanner;

public class SearchNum {
	int a[]={12,34,56,78,1};
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	 void Search() {
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==num) {
				 System.out.println(num+ " Is Found At "+a[i]);	 
			 }
 
		 }
	 }
	 public static void main(String[] args) {
		 SearchNum s1=new SearchNum();
		 s1.Search();
		 
		 
	 }
	

}
