package PreparedStatement;
import java.sql.*;
import java.util.Scanner;
public class UserReg38_Insert 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Username:");
			String uname=sc.next();
			System.out.println("Enter Password:");
			String pwd=sc.next();
			System.out.println("Enter First Name:");
			String fname=sc.next();
			System.out.println("Enter Last Name:");
			String lname=sc.next();
			System.out.println("Enter Address:");
			String addr=sc.next();
			System.out.println("Enter Mail-Id:");
			String mid=sc.next();
			System.out.println("Enter Phone No:");
			long phno=sc.nextLong();
			
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			PreparedStatement ps=con.prepareStatement("insert into UserReg38 values(?,?,?,?,?,?,?)");
			ps.setString(1 ,uname);
			ps.setString(2 ,pwd);
			ps.setString(3 ,fname);
			ps.setString(4 ,lname);
			ps.setString(5 ,addr);
			ps.setString(6 ,mid);
			ps.setLong(7 ,phno);
			
			int k=ps.executeUpdate();
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
