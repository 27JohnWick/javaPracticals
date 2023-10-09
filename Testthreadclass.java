class TestThread implements Runnable
{
	public void run()
	{
		int index;
		for(index=1;index<=10;index++)
		{
			System.out.println(index);
		}
	}
}
class Testthreadclass
{
	public static void main(String args[])
	{
		TestThread ob1=new TestThread();
		TestThread ob2=new TestThread();
		TestThread ob3=new TestThread();
		Thread obj1=new Thread(ob1);
		Thread obj2=new Thread(ob2);
		Thread obj3=new Thread(ob3);
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
		