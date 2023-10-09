import java.util.*;
class BalancewithdrawExceptions extends Exception
{
	String str;
	BalancewithdrawExceptions()
	{}
	BalancewithdrawExceptions(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class BankAmount
{
	static void validate(float amount,float balance)throws BalancewithdrawExceptions
	{
		if(amount>balance)
		{
			System.out.println("Withdraw amount is greater the balance");
		}
		else
		{
			balance=balance-amount;
			System.out.println("remaing balance is"+balance);
		}
	}
public static void main(String args[])
{
	float amount,balance;
	try
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter total balance in you account");
	balance=sc.nextFloat();
	System.out.println("Enter amount to be withdraw");
	amount=sc.nextFloat();
	}
	catch(BalancewithdrawExceptions ob)
	{
		System.out.println("transaction is failed");
	}
}
}
	
		
		