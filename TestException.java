import java.util.*;
class TestException
{
	public static void main(String args[])
	{
		System.out.println("Welcome and good morning");
		try
		{
			int no=10;
			int res;
			res=no/2;
			System.out.println("result is"+res+" ");
		}
		catch(ArithmeticException ob)
		{
			System.out.println("can't divideed by zero");
		}
		System.out.println("good bye");
		System.out.println("Over");
	}
}
		
			
		