package PreparedStatement;
import java.sql.*;
import java.util.*;
public class Student38_Insert
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection(
		   "jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			
			System.out.println("Enter the Student Roll Number: ");
			String rNo=sc.next();
			System.out.println("Enter the Student Name: ");
			String sname=sc.next();
			System.out.println("Enter the Student Branch: ");
			String br=sc.next();
			System.out.println("Enter the Student Address: ");
			String addr=sc.next();
			System.out.println("Enter the Student Mail-Id: ");
			String mid=sc.next();
			System.out.println("Enter the Student Phone Number: ");
			long phno=sc.nextLong();

			PreparedStatement ps=con.prepareStatement("insert into student38 values(?,?,?,?,?,?)");
			ps.setString(1,rNo);
			ps.setString(2,sname);
			ps.setString(3,br);
			ps.setString(4,addr);
			ps.setString(5,mid);
			ps.setLong(6,phno);
			
			int k=ps.executeUpdate();
			if(k>0)
			{
				System.out.println("Record Inserted Successfull");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
