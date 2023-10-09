package file2;
import java.util.*;
public class Addition
{
	Scanner sc=new Scanner(System.in);
	int a,b,res;
	public void add()
	{
		System.out.println("enter value of a");
		a=sc.nextInt();
		System.out.println("enter value of b");
		b=sc.nextInt();
		res=a+b;
		System.out.println("addition of two number is" +res);
	}
}