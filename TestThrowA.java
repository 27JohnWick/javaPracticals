import java.util.*;
class TestThrowA
{
	public static void main(String args[])
	{
		int no1,no2,res;
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		no1=nextInt();
		System.out.println("Ente 2nd number");
		no2=nextInt();
		if(no2==0)
		{
			ArithmeticException=new ArthimeticException();
			throw ob;
		}
		else
		{
			res=no1/no2;
			System.out.println("result is"+res);
		}
		catch(ArthimeticException obj)
		{
			System.out.println("can't divide  by zero");
		}
		}
	
}
}
		