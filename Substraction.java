package file3;
import java.util.*;
public class Substraction
{
	Scanner sc=new Scanner(System.in);
	int a,b,res;
	public void sub()
	{
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		res=a-b;
		System.out.println("Substraction of two number is"+res);
	}
}