interface Test1
{
	int no=19;
	void Show();
	
}
interface Test2
{
	float value=40.5f;
	void Display();
}
class Test3
{
	void print()
	{
		System.out.println("this test is not valid:");
	}
}
class Exam extends Test3 implements Test1,Test2
{
	public void Show()
	{
		System.out.println("The number is "+no);
	}
	public void Display()
	{
		System.out.println("The value is "+value);
	}
}
class AnnualExam
{
	public static void main(String args[])
	{
		Exam ob= new Exam();
		ob.Show();
		ob.Display();
		ob.print();
	}
}