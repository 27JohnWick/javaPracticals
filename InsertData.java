import java.util.*;
import java.sql.*;

class InsertData
{
	public static void main(String args[])
	{
		String NAME;
		int ROLLNO;
		double CGPA;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter NAME of the student: ");
		NAME = sc.nextLine();
		System.out.print("Enter ROLLNO number: ");
		ROLLNO = Integer.parseInt(sc.nextLine());
		System.out.print("Enter CGPA: ");
		CGPA = Double.parseDouble(sc.nextLine());
		//JDBC Program starts
		try
		{
			//Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establish the connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","silicon");
			//Execute Query
			String str = "Insert into student values("+ROLLNO+",'"+NAME+"',"+CGPA+")";
			//Required for building and submitting an SQL statement to the database
			Statement st = con.createStatement();
			//Return total no of rows affected
			int total = st.executeUpdate(str);
			//Process the result
			if(total > 0)
			{
				System.out.println(total+" record(s) inserted");
			}
			else
			{
				System.out.println("Error..!!!!");
			}
			//Close the connection
			st.close();
			con.close();
		}
		catch(ClassNotFoundException ob)
		{
			System.out.println(ob);
			
		}
		catch(SQLException ob)
		{
			System.out.println(ob);
		}
	}
}
