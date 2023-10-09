import java.util.*;
class Employee
{
	String empName;
	int empID;
	float empSal;
	Scanner sc= new Scanner(System.in);
	void Input()
	{
		System.out.println("Enter name of the employee:");
		empName= sc.nextLine();
		System.out.println("Enter the employee Id:");
		empID= sc.nextInt();
		System.out.println("Enter the employee salary:");
		empSal= sc.nextFloat();
	}
}
class Manager extends Employee
{
	float bonus;
	void Bonus()
	{
		System.out.println("Enter the Bonus:");
		bonus= sc.nextFloat();
		empSal+=bonus;
	}
	void Show()
	{
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Id:"+empID);
		System.out.println("Employee salary:"+empSal);
	}
}

class Company
{
	public static void main(String args[])
	{
		Manager emp= new Manager();
		emp.Input();
		System.out.println("Employee Details");
		System.out.println("-------------------------------");
		emp.Show();
		System.out.println("-------------------------------");
		emp.Bonus();
		System.out.println("Employee Details after bonus");
		System.out.println("-------------------------------");
		emp.Show();
	}
}
		
		
	