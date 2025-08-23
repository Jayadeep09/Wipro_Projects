package JDbc_conn;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Create_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String password="j12@KOTA";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection Created");
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("update students set name='Kumars' where rollno=103");
			System.out.println("Updated Successfully");
//			stmt.executeUpdate("create table students(rollno int"
//					+ ",name varchar(50),"
//					+ "per int,"
//					+ "email varchar(50))");
			//System.out.println("Table created");
			//System.out.println(stmt.executeUpdate("insert into students values(105,'Kiran',92,'bcd@gmail.com'),(106,'Gopi',89,'gp@gmail.com')"));
			//System.out.println("Data inserted succcessfully");
//			ResultSet rs=stmt.executeQuery("show tables");
//			while(rs.next())
//			{
//				String tn=rs.getString(1);
//				System.out.println(tn);
//			}
			
			ResultSet rs=stmt.executeQuery("select * from students");
			System.out.println("rollno"+"\t "+"name"+"\t"+"per"+"\t"+"mail"+"\t");
			while(rs.next())
			{
				int rollno=rs.getInt("rollno");
				String name=rs.getString("name");
				int per=rs.getInt("per");
				String mail=rs.getString("email");
				
				System.out.println(rollno+"\t "+name+"\t"+per+"\t"+mail+"\t");
			}
			
			stmt.close();
			con.close();
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);		
		}
		
		
		
		//create statement
		
		
		
		//stmt.executeUpdate("insert into emp1 values(101,'Hari'),(102,'Eswar')");
		
		//System.out.println("inserted data successfully");
		
	}

}
