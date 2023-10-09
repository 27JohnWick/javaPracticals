import java.util.*;
class Time
{
	int h,m,s;
	public static void main(String args[])
	{
		Time ob1= new Time();
		Time ob2= new Time();
		Time ob3= new Time();
		ob1.Input();
		ob2.Input();
		ob3.Add(ob1,ob2);
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
	void Add( Time ob4, Time ob5)
	{
		int i,j;
		h=ob4.h+ob5.h;
		m=ob4.m+ob5.m;
		s=ob4.s+ob5.s;
		i=s;
		j=m;
		if(i>60)
		{
			i=s/60;
			s=s%60;
			m+=i;
		}
		if(j>60)
		{
			j=m/60;
			m=m%60;
			h+=j;
		}		
	}
	void Display()
	{
		System.out.println(h+":"+m+":"+s);
	}
}