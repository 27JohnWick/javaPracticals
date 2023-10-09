import java.util.*;
class Account
{
	Scanner sc=new Scanner(System.in);
	int Accountno;
	String Customername;
	float Accountbalance;
	Account(int ac,String cn,float ab)
	{
		Accountno=ac;
		Customername=cn;
		Accountbalance=ab;
	}
	void Deposite()
	{
		int Amount;
		System.out.println("enter howmuch amount you want to enter");
		Amount=sc.nextInt();
		Accountbalance=Accountbalance+Amount;
	}
	void Withdraw()
	{
		int Amount;
		System.out.println("enter howmuch you want to withdraw");
		Amount=sc.nextInt();
		Accountbalance=Accountbalance-Amount;
	}
	void Accountinfo()
	{
		System.out.println("customer name= "+Customername);
		System.out.println("customer Accountno="+Accountno);
		System.out.println("customer Accountbalance="+Accountbalance);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		String Customername;
		int Accountno;
		float Accountbalance;
		System.out.println("enter custmer name");
		Customername=sc.next();
		System.out.println("enter Customer accountnumber");
		Accountno=sc.nextInt();
		System.out.println("Enter accountbalance");
		Accountbalance=sc.nextFloat();
		Account ob1[]=new Account[3];
			for(i=0;i<3;i++)
			{
				ob1[i]=new Account(Accountno,Customername,Accountbalance);
				ob1[i].Deposite();
				ob1[i].Withdraw();
				ob1[i].Accountinfo();
			}				
			
	}
}
			
				
			
		
		
	
	