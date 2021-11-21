package Statement;
import java.sql.*;
import java.util.Scanner;
public class Product38_Insert 
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			
			System.out.println("Enter the Product Code:");
			String pcode=sc.next();
			System.out.println("Enter the Product Name:");
			String pname=sc.next();
			System.out.println("Enter the Product Price:");
			float pprice=sc.nextFloat();
			System.out.println("Enter the Product Quantity: ");
			int pqty=sc.nextInt();
			
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into product38 values('"+pcode+"','"+pname+"',"+pprice+","+pqty+")");
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
