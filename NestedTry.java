import java.util.*;
class NestedTry
{
	public static void main(String args[])
	{
		int no1,no2,res;
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter the first number: ");
			no1=sc.nextInt();
			System.out.println("Enter the second number: ");
			no2=sc.nextInt();
			if(no2>=no1)
			{
				ArithmeticException ob= new ArithmeticException();
				throw ob;
			}
			try
			{
				if(no2==0)
				{
					ArithmeticException obo= new ArithmeticException();
					throw obo;
				}
				else
				{
					res=no1/no2;
					System.out.println("The result is:"+res);
				}
			}
			catch(ArithmeticException oboj)
			{
				System.out.println("Cant Divide denominator is 0:");
			}
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Cant Divide denominator is greater than no 1:");
		}
	}
}
