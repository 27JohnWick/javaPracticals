import java.util.*;
class Testthrows
{
	void f3() throws ArithmeticException
	{
		int res= 10/0;
	}
	void f2()throws ArithmeticException
	{
		f3();
	}
	void f1()throws ArithmeticException
	{
		f2();
	}
	public static void main(String args[])
	{
		Testthrows ob= new Testthrows();
		try
		{
			ob.f1();
		}
		catch(Exception obj)
		{
			System.out.println("Exception Handled");
		}
	}
}
