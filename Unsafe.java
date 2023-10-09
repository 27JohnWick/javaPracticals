class Reserved implements Runnable
{
	int avail=1;
	int want;
	Reserved(int val)
	{
		want=val;
	}
	public void run()
	{
		System.out.println("Available berths are: "+avail);
		if(avail>=want)
		{
			String Name= Thread.currentThread().getName();
			System.out.print(want+" berth reserved for "+Name);
			try
			{
				Thread.sleep(1500);
				avail=avail-want;
			}
			catch(Exception obo)
			{
				System.out.println("obo");
			}
		}
		else
		{
			System.out.println("Sorry , No berths are available for now:---------------->");
		}			
	}
}

class Unsafe
{
	public static void main(String args[])
	{
		Reserved obj = new Reserved(5);
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t1.setName("DeadPool");
		t2.setName("JohnWick");
		t1.start();
		t2.start();
	}
}
