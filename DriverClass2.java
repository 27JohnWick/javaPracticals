import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	String empname;
	int empid;
	float empsal;
	Employee(String Name, int id, float sal)
	{
		empname=Name;
		empid= id;
		empsal=sal;
	}
}
class Manager extends Employee
{
	float da, hra,grosssal;
	Manager(String Name, int id, float sal)
	{
		super(Name,id,sal);
	}
	void calGross()
	{
		da= 0.2f*empsal;
		hra= 0.1f*empsal;
		grosssal= da+hra+empsal;
	}		
	void showEmpdetails()
	{
		System.out.println("details of the employee is");
		System.out.println("name is "+empname);
		System.out.println("employee id is "+empid);
		System.out.println("employee salary is "+empsal);
		System.out.println("employee gross is "+grosssal);
	}
}
class EmpManager
{
	public static void main(String args[])
	{
		Manager ob=new Manager("Prem",19,2400000);
		ob.calGross();
		System.out.println("Details are: ");
		ob.showEmpdetails();
	}
}