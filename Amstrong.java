import java.util.*;
class Amstrong
{
	public static void main(String args[])
	{
		int st,en,i,j,t,len,m;
		double res;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		st= sc.nextInt();
		System.out.println("Enter the ending range: ");
		en= sc.nextInt();
		for(i=st;i<en;i++)
		{
			res=0;
			t=i;
			m=i;
			len=0;
			while(t!=0)
			{
				t=t/10;
				len++;
			}
			while(m!=0)
			{
				j=m%10;
				res= res+Math.pow(j,len);
				m=m/10;
			}
			if(i==res)
			{
				System.out.println(i+" is amstrong");
			}
		}
	}
}
		