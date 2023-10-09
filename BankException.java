import java.util.*;
class AmountWithdraw extends Exception
{
	String str;
	AmountWithdraw()
	{
		System.out.println("Pass the parameters:");
	}
	AmountWithdraw(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class BankException
{
	static void validate(float ama,float bal) throws AmountWithdraw
	{
		if(ama>bal)
		{
			throw new AmountWithdraw("Withdrawing Amount is greater than balance: ");
		}
		else
		{
			bal=bal-ama;
			System.out.println("The remaining balance is: "+bal);
		}
	}
	public static void main(String args[])
	{
		float amount,balance;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the balance: ");
		balance=sc.nextFloat();
		System.out.println("Enter the amount want to withdraw: ");
		amount=sc.nextFloat();
		try
		{
			validate(amount,balance);
		}
		catch(AmountWithdraw ob)
		{
			System.out.println("Failed Transastion:"+ob);
		}
	}
}
