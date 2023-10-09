import java.util.*;
class Fact
{
	public static void main(String args[])
	{
		int n1,n2,res=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		n1= sc.nextInt();
		n2=n1;
		while(n1>0)
		{
			res= res*n1;
			n1--;
		}
		System.out.println(n2+" factorial is "+res);
	}
}
		