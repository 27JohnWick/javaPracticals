import java.util.*;
class TestReThrow
{
	void f1()
	{
		try
		{
			int res= 10/0;
		}
		catch(Exception ob)
		{
			System.out.println("Exception Handled and thrown:");
			throw ob;
		}
	}
	public static void main(String args[])
	{
		TestReThrow ob= new TestReThrow();
		try
		{
			ob.f1();
		}
		catch(Exception obj)
		{
			System.out.println("Exception Handled in main method:");
		}
	}
}
