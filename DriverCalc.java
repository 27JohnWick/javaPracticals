interface Calculator
{
	void add();
	void sub();
	void mul();
	void div();
}
class DemoCalculator implements Calculator
{
	int no1,no2;
	DemoCalculator(int n1,int n2)
	{
		no1=n1;
		no2=n2;
		System.out.println("Enter the number 1 is: "+no1);
		System.out.println("Enter the number 2 is: "+no2);
	}
	public void add()
	{
		System.out.println("addition of "+no1+" and "+no2+" is:"+(no1+no2));
	}
	public void sub()
	{
		System.out.println("substraction of "+no1+" and "+no2+" is:"+(no1-no2));
	}
	public void mul()
	{
		System.out.println("multiplication of "+no1+" and "+no2+" is:"+(no1*no2));
	}
	public void div()
	{
		System.out.println("division of "+no1+" and "+no2+" is:"+(no1/no2));
	}
}
class DriverCalc
{
	public static void main(String args[])
	{
		Calculator c;
		c= new DemoCalculator(10,5);
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}