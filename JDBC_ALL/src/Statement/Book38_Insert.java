package Statement;
import java.util.Scanner;
import java.sql.*;
public class Book38_Insert 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Book Code:");
			String bcode=sc.next();
			System.out.println("Enter Book Name:");
			String bname=sc.next();
			System.out.println("Enter Book Author:");
			String bauthor=sc.next();
			System.out.println("Enter Book Price:");
			float bprice=sc.nextFloat();
			System.out.println("Enter Book Quantity:");
			int bqty=sc.nextInt();
			
			Connection con=DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
			Statement stm=con.createStatement();
			int k=stm.executeUpdate("insert into book38 values("
					+ " ' "+bcode+"','"+bname+"','"+bauthor+"',"+bprice+","+bqty+")");
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
