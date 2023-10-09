class TestSync 
{
	synchronized void resource(int val)
	{
		System.out.println("Astron martin");
		System.out.println("G Wagon");
		for(int i=50;i<=55;i++)
		{
			System.out.print((val*i)+" ");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob)
			{
				System.out.println(ob);
			}
		}
		System.out.println("price Updates:-------->");
	}
}
class T1 extends Thread
{
	TestSync ob;
	T1(TestSync ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		System.out.println("T1 Entered------->");
		ob.resource(5);
	}
}
class T2 extends Thread
{
	TestSync ob;
	T2(TestSync ob)
	{
		this.ob=ob;
	}
	public void run()
	{
		System.out.println("T2 Entered------->");
		ob.resource(2);
	}
}
class ThreadSync
{
	public static void main(String args[])
	{
		TestSync ob = new TestSync();
		T1 obj1 = new T1(ob);
		T2 obj2 = new T2(ob);
		obj1.start();
		try{
			obj1.join();
		}
		catch(Exception objo)
		{
			System.out.println("objo");
		}
		obj2.start();
	}
}