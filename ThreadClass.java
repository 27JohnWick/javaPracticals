class TestThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+"  ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob)
			{
				System.out.println(ob);
			}
		}
	}
}
class ThreadClass
{
	public static void main(String args[])
	{
		TestThread ob = new TestThread();
		TestThread ob1= new TestThread();
		TestThread ob2= new TestThread();
		ob.start();
		System.out.println(ob.getName());
		ob.setName("1st");
		System.out.println(ob.getName());
		ob1.start();
		System.out.println(ob1.getName());
		ob1.setName("2nd");
		System.out.println(ob1.getName());
		ob2.start();
		System.out.println(ob2.getName());
		ob2.setName("3rd");
		System.out.println(ob2.getName());
	}
}