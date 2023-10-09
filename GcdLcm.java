import java.util.*;
class GcdLcm
{
	public static void main(String args[])
	{
		int n1,n2,gcd,no1,no2,lcm;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1= sc.nextInt();
		System.out.println("Enter second number: ");
		n2= sc.nextInt();
		no1=n1;
		no2=n2;
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
		gcd=n1;
		lcm=(no1*no2)/gcd;
		System.out.println("Gcd of "+no1+" and "+no2+" is "+gcd+" Lcm is "+lcm);
	}
}
		