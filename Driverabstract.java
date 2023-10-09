import java.util.*;
import java.math.*;
abstract class Shape
{
	abstract void dimOne();
	abstract void dimTwo();
}
class Rectangle extends Shape
{
	void dimTwo()
	{
	}
	void dimOne()
	{
		Scanner sc=new Scanner(System.in);
		float side1,side2, area;
		System.out.println("enter two sides:");
		side1=sc.nextFloat();
		side2=sc.nextFloat();
		area=side1*side2;
		System.out.println("Area of the rectangle is="+area);
	}
}
class Triangle extends Shape
{
	void dimOne()
	{
		System.out.println("This is dim one");
	}
	void dimTwo()
	{
		int a,b,c,s;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three sides of the triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triangle is="+area);
	}
}
class Driverabstract
{
	 public static void main(String args[])
	{
		Shape ob;
		ob=new Rectangle();
		ob.dimOne();
		System.out.println("--------------------");
		ob=new Triangle();
		ob.dimTwo();
	}
}

		
		
		
		
		
		
		
	