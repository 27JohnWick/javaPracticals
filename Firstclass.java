package package2;
public class Firstclass
{
	void f1()
	{
		System.out.println("This is default");
	}
	public void f2()
	{
		System.out.println("This is public");
	}
	protected void f3()
	{
		System.out.println("This is protected");
	}
	private void f4()
	{
		System.out.println("This is private");
	}
}
class FirstChild extends Firstclass
{
	public static void main(String args[])
	{
		FirstChild ob=new FirstChild();
		ob.f1();
		ob.f2();
		ob.f3();
		//ob.f4();
	}
}