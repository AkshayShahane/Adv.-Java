package Statement;
import java.util.Scanner;
import java.sql.*;
public class Emp38_Insert
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Employee Id:");
			String eid=sc.next();
			System.out.println("Enter the Employee Name:");
			String ename=sc.next();
			System.out.println("Enter the Employee Designation:");
			String edesg=sc.next();
			System.out.println("Enter the Employee Salary:");
			int sal=sc.nextInt();
			
			Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into emp38 values("
		+ " '"+eid+"','"+ename+"','"+edesg+"',"+sal+")");
			if(k>0)
			{
				System.out.println("Record inserted Successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
