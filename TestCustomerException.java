import java.util.*;
class AgeFormatException extends Exception
{
	String str;
	AgeFormatException()
	{
	}
	AgeFormatException(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class TestCustomerException
{
	static void validate(int age) throws AgeFormatException
	{
		if(age<18)
		{
			throw new AgeFormatException("Not allowed for voting: ");
		}
		else
		{
			System.out.println("Welcome to voting:");
		}
	}
	public static void main(String args[])
	{
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		try
		{
			validate(age);
		}
		catch(AgeFormatException ob)
		{
			System.out.println("Age is less than 18:"+ob);
		}
	}
}
