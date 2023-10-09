import java.util.*;
class Democonstruct
{
	int no;
	float value;
	Democonstruct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of no.");
		no=sc.nextInt();
		System.out.println("enter an number");
		value=sc.nextInt();
	}
	void show()
	{
		System.out.println("number is"+no+"and value number is"+value);
	}
	public static void main(String args[])
	{
		Democonstruct ob=new Democonstruct();
		ob.show();
	}
}
		
	