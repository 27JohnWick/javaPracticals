import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		int n1,i,cnt=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		n1= sc.nextInt();
		if(n1==1||n1==2||n1==3)
		{
			System.out.println(n1+" is prime number");
		}
		else
		{
			for(i=2;i<n1+1;i++)
			{
				if(n1%i==0)
				{
					cnt++;
				}
			}
			if(cnt==1)
			{
				System.out.println(n1+" is prime number");
			}
			else
			{
				System.out.println(n1+" is not prime number");
			}
		}
	}
}
		