import java.util.*;
class Testthrow
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
			else
			{
				res=no1/no2;
				System.out.println("The result is:"+res);
			}
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Cant Divide:");
		}
	}
}
