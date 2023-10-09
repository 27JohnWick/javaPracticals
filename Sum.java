import java.util.*;
class Sum
{
	public static void main(String args[])
	{
		int num1,num2;
		double res;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		num1=sc.nextInt();
		System.out.println("enter 2nd number");
		num2=sc.nextInt();
		res=Math.pow(num1,num2);
		System.out.println(res);
	}
}
		