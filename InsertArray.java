import java.util.*;
class InsertArray
{
	public static void main(String args[])
	{
		int arr[]=new int[50];
		int i=0;
		int n,size,pos,ele;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n= sc.nextInt();
		size= n+1;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position with in:"+n);
		pos= sc.nextInt();
		System.out.println("Enter the element with in:"+n);
		ele= sc.nextInt();
		for(i=n;i>pos;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[pos]=ele;
		System.out.println("Elements are: ");
		for(i=0;i<size;i++)
		{
			System.out.println(" " +arr[i]);
		}
		
	}
}
			