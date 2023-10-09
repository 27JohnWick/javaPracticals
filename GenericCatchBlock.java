class GenericCatchBlock
{
	public static void main(String args[])
	{
		try
		{
			String str="hello";
			int no=Integer.parseInt(str);
			System.out.println("number is"+no);
		}
		catch(NullPointerException ob)
		{
			System.out.println("Number format is not allowed");
		}
		catch(Exception ob)
		{
			System.out.println("you are now in generic catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("program over");
	}
}