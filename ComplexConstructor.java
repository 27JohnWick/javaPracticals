import java.util.*;
class ComplexConstructor
{
	int r,i;
	ComplexConstructor(int u,int v)
	{
		r=u.r+v.r;
		i=u.i+v.i;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		ComplexConstructor ob1= new ComplexConstructor(5,6);
		ComplexConstructor ob2= new ComplexConstructor(3,10);
	}
}
	