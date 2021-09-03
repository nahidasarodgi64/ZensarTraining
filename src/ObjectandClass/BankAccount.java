package ObjectandClass;

import java.util.Scanner;

public class BankAccount {
	public int accountNo,balance=300,Age;
	public String Name;
	long mobileNo;
	Scanner sc=new Scanner(System.in);
	public void insert(String n,int an,long mob,int ag) {
		accountNo=an;
		Name=n;
		mobileNo=mob;
		Age=ag;
	}
	public void deposite()
	{
		System.out.println("Enter the value to Deposite");
		
		int result=sc.nextInt();
		balance+=result;
		sc.close();
	}
	public void withdraw() {
		System.out.println("Enter the Amount to witdraw");
		int result=sc.nextInt();
		balance=result-balance;
		
	}
	public void display() {
		System.out.println("Name of Holder="+Name);
		System.out.println("Account Number="+accountNo);
		System.out.println("Account holder Age="+Age);
		System.out.println("Account holder Mobile number="+mobileNo);
		System.out.println("Balance="+balance);
	}
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.insert("Xyz", 1022, 2367905, 23);
		b1.deposite();
		b1.display();
	}
}
