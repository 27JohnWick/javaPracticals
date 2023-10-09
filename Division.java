package file5;
import java.util.*;
public class Division
{
	Scanner sc=new Scanner(System.in);
	int a,b,res;
	public void div()
	{
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		res=a/b;
		System.out.println("Division of two number is"+res);
	}
}