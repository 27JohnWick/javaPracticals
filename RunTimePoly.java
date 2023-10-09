import java.util.*;
abstract Shape
{
	int dimOne();
	int dimTwo();
	abstract void ComputeArea();
	Scanner sc= new Scanner(System.in);
}

class Rectangle extends Shape
{
	int area;
	System.out.println("Enter the sides of rectrangle :");
	dimOne=sc.nextInt();
	dimTwo=sc.nextInt();
	public void ComputeArea()
	{
		area=dimOne*dimTwo;
		System.out.println("Area of the rectrangle is "+area);
	}
}
class Triangle extends Shape
{
	float area;
	System.out.println("Enter the sides of rectrangle :");
	dimOne=sc.nextInt();
	dimTwo=sc.nextInt();
	public void ComputeArea()
	{
		area=0.5f*(dimOne*dimTwo);
		System.out.println("Area of the rectrangle is "+area);
	}
}
class RunTimePoly
{
	public static void main(String args[])
	{
		Shape s;
		s=new Rectangle();
		s=new Triangle();
	}
}