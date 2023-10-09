package file4;
import java.util.*;
public class Multiplication
{
	Scanner sc=new Scanner(System.in);
	int a,b,res;
	public void mul()
	{
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		res=a*b;
		System.out.println("Multiplication  of two number is"+res);
	}
}