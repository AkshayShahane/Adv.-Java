package Statement;
import java.util.Scanner;
import java.sql.*;
public class Customer38_Insert 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter the Customer Id:");
			String cid=sc.next();
			System.out.println("Enter the Customer Name:");
			String cname=sc.next();
			System.out.println("Enter the Customer Account No:");
			int accno=sc.nextInt();
			System.out.println("Enter the Customer account balance:");
			float bal=sc.nextFloat();
			System.out.println("Enter the Customer Account Type:");
			String acctype=sc.next();
			
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into customer38 values("
		+ " '"+cid+"','"+cname+"',"+accno+","+bal+",'"+acctype+"')");
			if(k>0)
			{
				System.out.println("Record Inserted Successfully");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
