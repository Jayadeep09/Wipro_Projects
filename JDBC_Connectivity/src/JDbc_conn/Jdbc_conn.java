package JDbc_conn;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Jdbc_conn {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// import packages
		//create object for connection
		//Retrieve data
		//close connection
		
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String password="j12@KOTA";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection Created");
		
		
		//create statement
		
		Statement stmt=con.createStatement();
		
		
		ResultSet rs=stmt.executeQuery("select * from emp");
		System.out.println("ID\tname\tSalary\tDepartment\tAddress\tMobilenumber");
		
		while(rs.next())
		{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary=rs.getInt("salary");
			System.out.println(id+"\t"+name+"\t"+salary);
		}
		//stmt.executeUpdate("create table emp1(id int,name varchar(50))");
		stmt.executeUpdate("insert into emp1 values(101,'Hari'),(102,'Eswar')");
		
		System.out.println("Table created");
		System.out.println("inserted data successfully");
		//rs.close();
		stmt.close();
		con.close();
	}

}
