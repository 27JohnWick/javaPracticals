class TestException2
{
	public static void main(String args[])
	{
		System.out.println("welcome and good morning");
		try
		{
			String str="hii";
			int value=str.length();
			System.out.println("value is "+value);
		}
		catch(NullPointerException ob)
		{
			System.out.println("Null value");
		}
		System.out.println("good bye");
		System.out.println("over");
	}
}
	