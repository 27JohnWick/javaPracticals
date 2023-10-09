import java.util.*;
class RotateArray
{
	public static void main(String args[])
	{
		int arr[]=new int[50];
		int i,rot,size,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=sc.nextInt();
		System.out.println("Enter the Elements to array: ");
		for(i=0;i<size;i++)
		{
			System.out.println("Enter values: ");
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter the time of rotation need: ");
		rot= sc.nextInt();
		while(rot!=0)
		{
			for(i=0;i<size;i++)
			{
				temp=arr[size-1];
				arr[size-1]=arr[i];
				arr[i]=temp;
			}
			rot--;
		}
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
			