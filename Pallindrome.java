import java.util.*;
class Pallindrome
{
	public static void main(String args[])
	{
		int n1,n,res=0,t;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		n1= sc.nextInt();
		t=n1;
		while(n1!=0)
		{
			n=n1%10;
			res= res * 10 + n;
			n1=n1/10;
		}		
		if(t==res)
		{
			System.out.println(t+" is pallindrome");
		}
		else
		{
			System.out.println(t+" is not pallindrome");
		}
	}
}System.out.println(res);