import java.util.*;
class ComplexN
{
	int r,i;
	public static void main(String args[])
	{
		ComplexN ob1= new ComplexN();
		ComplexN ob2= new ComplexN();
		ComplexN ob3= new ComplexN();
		ob1.Input();
		ob2.Input();
		ob3=ob1.Add(ob2);
		ob3.Display();
	}
	void Input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter real number: ");
		r= sc.nextInt();
		System.out.println("Enter imaginary number: ");
		i= sc.nextInt();
	}
	ComplexN Add( ComplexN ob5)
	{
		ComplexN ob3= new ComplexN();
		ob3.r= r + ob5.r;
		ob3.i= i + ob5.i;
		return ob3;
	}
	void Display()
	{
		System.out.println(r+"+"+i+"i");
	}
}