//Assignment on inhertance and constructor no -3
import java.util.*;
class Account
{
	int acc;
	float bal;
	String name;
	Scanner sc= new Scanner(System.in);
	void Input()
	{
		System.out.println("Enter account number: ");
		acc= sc.nextInt();
		System.out.println("Enter name: ");
		name= sc.next();
		System.out.println("Enter balance: ");
		bal= sc.nextFloat();
	}
}
class Customer extends Account
{
	float amount;
	void Deposit()
	{
		System.out.println("Enter Ammount to deposite: ");
		amount= sc.nextFloat();
		bal+= amount;
	}
	void Withdraw()
	{
		int i;
		float am,bl;
		do{
			i=0;
			System.out.println("Enter Ammount to withdraw: ");
			amount= sc.nextFloat();
			am= amount;
			bl=bal;
			bl-= am;
			if(bl<500)
			{
				i=1;
				System.out.println("You can't withdraw this ammount, try again with less ammount");
				
			}
		}while(i==1);
		bal=bl;
	}
	void Show()
	{
	System.out.println("Name: "+name);
	System.out.println("Account Number: "+acc);
	System.out.println("Balance: "+bal);
	}
}
	
class BankDesk
{
	public static void main(String args[])
	{
		Customer c= new Customer();
		c.Input();
		System.out.println("Before Deposite");
		System.out.println("----------------------------");
		c.Show();
		c.Deposit();
		System.out.println("After Deposite");
		System.out.println("----------------------------");
		c.Show();
		c.Withdraw();
		System.out.println("After Withdraw");
		System.out.println("----------------------------");
		c.Show();
		
	}
}