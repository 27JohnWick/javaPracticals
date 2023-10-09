import java.util.*;
interface Calculator
{
	void add();
	void sub();
	void mul();
	void div();
}
class Democalculator implements Calculator
{
	Scanner sc=new Scanner(System.in);
	int a,b,result;
	public void add()
	{
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		result=a+b;
		System.out.println("addition of two number is"+result);
	}
	public void sub()
	{
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		result=a-b;
		System.out.println("substraction of two number is="+result);
	}
	public void mul()
	{
		System.out.println("enter two number");
		a=sc.nextInt();
		b=sc.nextInt();
		result=a*b;
		System.out.println("multiplication of two number is="+result);
	}
	public void div()
	{
	System.out.println("enter two number");
	a=sc.nextInt();
	b=sc.nextInt();
	result=a/b;
	System.out.println("division of two number is="+result);
	}
}
class Driverinterface
{
	public static void main(String args[])
	{
		Calculator ob;
		ob=new Democalculator();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
	}
}
		
		
		