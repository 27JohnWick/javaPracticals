class Testthread extends Thread
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
class TestClass
	{
		public static void main(String args[])
		{
			Testthread ob1=new Testthread();
			Testthread ob2=new Testthread();
			Testthread ob3=new Testthread();
			ob1.start();
			ob2.start();
			ob3.start();
		}
	}
			
			