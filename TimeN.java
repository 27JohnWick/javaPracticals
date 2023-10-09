import java.util.*;
class TimeN
{
	int h,m,s;
	public static void main(String args[])
	{
		TimeN ob1= new TimeN();
		TimeN ob2= new TimeN();
		TimeN ob3= new TimeN();
		ob1.Input();
		ob2.Input();
		ob3=ob1.Add(ob2);
		ob3.Display();
	}
	void Input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Hour: ");
		h= sc.nextInt();
		System.out.println("Enter minute: ");
		m= sc.nextInt();
		System.out.println("Enter second: ");
		s= sc.nextInt();
	}
	TimeN Add( TimeN ob5)
	{
		TimeN ob3= new TimeN();
		int i,j;
		ob3.h=h+ob5.h;
		ob3.m=m+ob5.m;
		ob3.s=s+ob5.s;
		i=ob3.s;
		j=ob3.m;
		if(i>60)
		{
			i=ob3.s/60;
			ob3.s=ob3.s%60;
			ob3.m+=i;
		}
		if(j>60)
		{
			j=ob3.m/60;
			ob3.m=ob3.m%60;
			ob3.h+=j;
		}	
		return ob3;		
	}
	void Display()
	{
		System.out.println(h+":"+m+":"+s);
	}
}