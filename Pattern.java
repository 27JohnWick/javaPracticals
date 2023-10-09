import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int r,c=0,i,j,k,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row: ");	
		r= sc.nextInt();
		for(i=1;i<=r;i++)
		{
			c=i+1;
			for(j=i;j<=r-1;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				c=c-1;
				System.out.print(c);
			}
			for(m=2;m<=i;m++)
			{
				System.out.print(m);
			}
			System.out.println( );
		}
	}
}