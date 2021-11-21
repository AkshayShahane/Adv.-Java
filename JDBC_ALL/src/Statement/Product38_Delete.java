package Statement;
import java.util.Scanner;
import java.sql.*;
public class Product38_Delete 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product Code to delete:");
		String productCode=sc.next();
		try
		{
			Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("delete from product38 where pcode='"+productCode+"'");
			if(k>0)
			{
				System.out.println("Record Deleted Successfully...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
