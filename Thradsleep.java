//use of sleep
class Testsleep extends Thread
{
	public void run()
	{
		
	  int index;
	  for(index=1;index<=10;index++)
	  {
	  try
	 {
		 System.out.println(index);
		Thread.sleep(1000);
	 } 
	 catch(Exception ob)
	 {
		System.out.println(ob);
    	}
	  }
	}
}
class Thradsleep
{
	public static void main(String args[])
	{
		Testsleep ob1=new Testsleep();
		Testsleep ob2=new Testsleep();
		Testsleep ob3=new Testsleep();
		ob1.start();
		ob2.start();
		ob3.start();
	}
}