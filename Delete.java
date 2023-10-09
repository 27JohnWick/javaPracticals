import java.util.*;
class Delete
{
	public static void main(String args[])
	{
		int arr[]=new int[30];
		int i,element,n,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		n=sc.nextInt();
		System.out.println("enter the values of the array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter which element you want to delete");
		element=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==element)
			{
				for(k=i;k<n;k++)
				{
				arr[k+1]=arr[k+2];
				//n--;
				}
			}
		}
		System.out.println("after delete element new array is");
		for(i=0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
		
		