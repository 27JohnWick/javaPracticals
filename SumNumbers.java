import java.util.*;
class SumNumbers
{
	public static void main(String args[])
	{
		int n1,n2,res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1= sc.nextInt();
		System.out.println("Enter second number: ");
		n2= sc.nextInt();
		res= n1+n2;
		System.out.println("The sum of "+n1+" and "+n2+" is "+ res);
	}
}
		