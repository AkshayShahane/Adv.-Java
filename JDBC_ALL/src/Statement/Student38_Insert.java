package Statement;
import java.util.Scanner;
import java.sql.*;
public class Student38_Insert 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Roll No:");
		int rollno=sc.nextInt();
		System.out.println("Enter the Student Name:");
		String name=sc.next();
		System.out.println("Enter the Student Branch:");
		String branch=sc.next();
		System.out.println("Enter the Student Address:");
		String address=sc.next();
		System.out.println("Enter the Student Mail-Id:");
		String mid=sc.next();
		System.out.println("Enter the Student Phno:");
		int phno=sc.nextInt();
		try
		{
		Connection con=DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521:orcl","c##akshaySS","akshay11");
		Statement stm=con.createStatement();
		int k=stm.executeUpdate("insert into student 38 values("
		+ " "+rollno+",'"+name+"','"+branch+"','"+address+"','"+mid+"',"+phno+")");
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
