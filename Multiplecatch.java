class Multiplecatch
{
	public static void main(String args[])
	{
		int no=10;
		int arr[]=new int[0];
		//arr[0]=3;
		try
		{
			int res=no/0;
			System.out.println("Result is"+res);
			System.out.println("Array is"+arr[0]);
		}
		catch(NumberFormatException ob)
		{
			System.out.println("Numberformat is not alloewd");
		}
		catch(ArrayIndexOutOfBoundsException ob)
		{
			System.out.println("out of boundry of array");
		}
		catch(ArithmeticException ob)
		{
			System.out.println("you have a arthimeticException check it out");
		}
		System.out.println(" over program");
	}
}
			