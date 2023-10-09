import java.util.*;
class Shape
{
	void Draw()
	{
		System.out.println("Drawing Shape");
	}
	void Erase()
	{
		System.out.println("Erasing Shape");
	}
}
class Circle extends Shape
{
	void Draw()
	{
		System.out.println("Drawing Circle");
	}
	void Erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape
{
	void Draw()
	{
		System.out.println("Drawing Triangle");
	}
	void Erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape
{
	void Draw()
	{
		System.out.println("Drawing Square");
	}
	void Erase()
	{
		System.out.println("Erasing Square");
	}
}
class PloyGons
{
	public static void main(String args[])
	{
		Shape s;
		s= new Circle();
		System.out.println("-------------------------------");
		s.Draw();
		s.Erase();
		s= new Triangle();
		System.out.println("-------------------------------");
		s.Draw();
		s.Erase();
		s= new Square();
		System.out.println("-------------------------------");
		s.Draw();
		s.Erase();
		System.out.println("-------------------------------");
	}
}
		
		
	