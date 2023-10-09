import java.util.*;
class employee
{
	String name;
	int age;
	int basic;
	float gross;
void input()
{
	System.out.println("enter name of the employee");
	Scanner sc=new Scanner(System.in);
	name=sc.nextLine();
	System.out.println("enter the age of the employee");
	age=sc.nextInt();
	System.out.println("enter the basic salary of the employee");
	basic=sc.nextInt();
}
void calculate()
{
	gross=basic+(basic*0.15f)+(basic*0.2f)-(basic*0.05f);
}
void show()
{
	System.out.println("name of the employee is"+name);
	System.out.println("age of the employee is"+age);
	System.out.println("basic salary of the employee is"+basic);
	System.out.println("gross salary of the employee is"+gross);
}
public static void main(String args[])
{
	employee ob=new employee();
	ob.input();
	ob.calculate();
	ob.show();
}
}
