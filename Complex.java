import java.util.*;
class complex
{
	int real,img;
public static void main(String args[])
{
	complex ob1=new complex();
	complex ob2=new complex();
	complex ob3=new complex();
	System.out.println("enter real and img number part1");
	ob1.input();
	System.out.println("enter real and imaginary part2");
	ob2.input();
	ob3.add(ob1,ob2);
	ob3.display();
}
void input()
{
	Scanner sc=new Scanner(System.in);
	real=sc.nextInt();
	img=sc.nextInt();
}
void add(complex ob1,complex ob2)
{
	real=ob1.real+ob2.real;
	img=ob1.img+ob2.img;
}
void display()
{
	System.out.println("addition of real"+real+"imaginary is"+img);
}
}
