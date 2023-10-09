import java.util.*;
class Bank
{
	Scanner sc=new Scanner(System.in);
	int accono;
	String name;
	float balance;
	void input()
	{
		System.out.println("enter account number");
		accono=sc.nextInt();
		System.out.println("enter name of the customer");
		name=sc.next();
		System.out.println("enter account balance");
		balance=sc.nextFloat();
	}
}
	class Customer extends Bank
	{
		float amount;
		void deposite()
		{
			System.out.println("enter amount to be deposite");
			amount=sc.nextFloat();
			balance=balance+amount;
		}
		void withdraw()
		{
			float amount2;
			System.out.println("enter amount to be withdraw");
			amount2=sc.nextFloat();
			balance=balance-amount2;
		}
		void show()
		{
			System.out.println("name of the customer is "+name);
			System.out.println("account number is "+accono);
			System.out.println(balance);
		}
			
	}
	class Driverclass
	{
		public static void main(String args[])
		{
			Customer ob=new Customer();
			ob.input();
			System.out.println("before deposite the amount is");
			ob.show();
			ob.deposite();
			System.out.println("after deposite the amount is");
			ob.show();
			ob.withdraw();
			System.out.println("after withdraw the amount is");
			ob.show();
		}
	}
			
			
			
		