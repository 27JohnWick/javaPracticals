import java.util.*;
class PosiiveCalculator extends Exception
{
	String str;
	PosiiveCalculator()
	{
	}
	PosiiveCalculator(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class PositiveCalc
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
				throw new PosiiveCalculator("Cant Divide denominator is greater than no 1:");
			}
			try
			{
				if(no2==0)
				{
					throw new PosiiveCalculator("Cant Divide denominator is 0:");
				}
				try
				{
					if(no1/no2==1)
					{
						throw new PosiiveCalculator("Result is 1:");
					}
					
					else
					{
						res=no1/no2;
						System.out.println("The result is:"+res);
					}
				}
				catch(PosiiveCalculator obaj)
				{
					System.out.println("You got your ans:"+obaj);
				}
			}
			catch(PosiiveCalculator oboj)
			{
				System.out.println("Reason is:"+oboj);
			}
		}
		catch(PosiiveCalculator obj)
		{
			System.out.println("Something is greater:"+obj);
		}
	}
}
