package JDbc_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mini_Project {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String password="j12@KOTA";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connection Created");
		Statement stmt=con.createStatement();
		
//		stmt.executeUpdate("create table student (rollno int,name varchar(50),city varchar(50),inst_name varchar(50),per int)");
//		System.out.println("Table created");
		
//		stmt.executeUpdate("insert into student values(1, 'Sai', 'Hyderabad', 'ABC College', 85),"
//				+ "(2, 'Nikhil', 'Vijayawada', 'XYZ College', 78)"
//				+ "(3, 'Kumar', 'Hyderabad', 'PQR College', 92)"
//				+"(4, 'Eswar', 'Vijayawada', 'LMN College', 81)"
//				+"(5, 'Ram', 'Guntur', 'DEF College', 89);");
		
//		System.out.println(stmt.executeUpdate("insert into student values(1, 'Sai', 'Hyderabad', 'ABC College', 85),"
//				+ "(2, 'Nikhil', 'Vijayawada', 'XYZ College', 78),"
//				+ "(3, 'Kumar', 'Hyderabad', 'PQR College', 92),"
//				+"(4, 'Eswar', 'Vijayawada', 'LMN College', 81),"
//				+"(5, 'Ram', 'Guntur', 'DEF College', 89);")+" rows of data inserted successfully");
		
		
		//stmt.executeUpdate("update  student set city='Rajamundry' where rollno=5");
		
//		ResultSet rs=stmt.executeQuery("select * from student");
//		System.out.println("rollno"+"\t"+"name"+"\t"+"city"+"\t\t"+"inst_name"+"\t"+"per");
//		while(rs.next())
//		{
//			int rollno=rs.getInt("rollno");
//			String name=rs.getString("name");
//			String city=rs.getString("city");
//			String inst_name=rs.getString("inst_name");
//			int per=rs.getInt("per");
//			
//			System.out.println(rollno+"\t"+name+"\t"+city+"\t"+inst_name+"\t"+per);
//		}
		
		
       
//		ResultSet rs=stmt.executeQuery("select * from student where per=(select max(per) from student)");
//		System.out.println("rollno"+"\t"+"name"+"\t"+"city"+"\t\t"+"inst_name"+"\t"+"per");
//		while(rs.next())
//		{
//			int rollno=rs.getInt("rollno");
//			String name=rs.getString("name");
//			String city=rs.getString("city");
//			String inst_name=rs.getString("inst_name");
//			int per=rs.getInt("per");
//			
//			System.out.println(rollno+"\t"+name+"\t"+city+"\t"+inst_name+"\t"+per);
//		}
		

		
//		ResultSet rs=stmt.executeQuery("select * from student order by per asc");
//		System.out.println("rollno"+"\t"+"name"+"\t"+"city"+"\t\t"+"inst_name"+"\t"+"per");
//		while(rs.next())
//		{
//			int rollno=rs.getInt("rollno");
//			String name=rs.getString("name");
//			String city=rs.getString("city");
//			String inst_name=rs.getString("inst_name");
//			int per=rs.getInt("per");
//			
//			System.out.println(rollno+"\t"+name+"\t"+city+"\t"+inst_name+"\t"+per);
//		}
		
		
		
//		 ResultSet rs = stmt.executeQuery(
//			        "SELECT city, COUNT(*) as student_count " +
//			        "FROM stud " +
//			        "GROUP BY city " +
//			        "HAVING COUNT(*) > 1"
//			    );
//		System.out.println("city"+"\t\t"+"count");
//		while(rs.next())
//		{
//
//			String city=rs.getString("city");
//			int student_count=rs.getInt("student_count");
//		
//			
//			System.out.println(city+"\t"+student_count);
//		}
		
		
		//stmt.executeUpdate("alter table student add age int");
		//stmt.executeUpdate("update student set age=20 where rollno=1");
//		stmt.executeUpdate("update student set age=21 where rollno=2");
//		stmt.executeUpdate("update student set age=22 where rollno=3");
//		stmt.executeUpdate("update student set age=23 where rollno=4");
//		stmt.executeUpdate("update student set age=24 where rollno=5");


		//stmt.executeUpdate("alter table student modify age float");
//		stmt.executeUpdate("alter table student modify age int");
//		ResultSet rs=stmt.executeQuery("select * from student");
//		System.out.println("rollno"+"\t"+"name"+"\t"+"city"+"\t\t"+"inst_name"+"\t"+"per"+"\t"+"age");
//		while(rs.next())
//		{
//			int rollno=rs.getInt("rollno");
//			String name=rs.getString("name");
//			String city=rs.getString("city");
//			String inst_name=rs.getString("inst_name");
//			int per=rs.getInt("per");
//			int age=rs.getInt("age");
//			
//			System.out.println(rollno+"\t"+name+"\t"+city+"\t"+inst_name+"\t"+per+"\t"+age);
//		}
		
		
		//stmt.executeUpdate("rename  table student to stud");
		ResultSet rs=stmt.executeQuery("show tables");
		while(rs.next())
		{
			String tn=rs.getString(1);
			System.out.println(tn);
		}
		
		
		
		
//		ResultSet rs=stmt.executeQuery("select * from stud");
//		System.out.println("rollno"+"\t"+"name"+"\t"+"city"+"\t\t"+"inst_name"+"\t"+"per"+"\t"+"age");
//		while(rs.next())
//		{
//			int rollno=rs.getInt("rollno");
//			String name=rs.getString("name");
//			String city=rs.getString("city");
//			String inst_name=rs.getString("inst_name");
//			int per=rs.getInt("per");
//			int age=rs.getInt("age");
//			
//			System.out.println(rollno+"\t"+name+"\t"+city+"\t"+inst_name+"\t"+per+"\t"+age);
//		}
		
		
		
		
		//System.out.println(stmt.executeUpdate("delete from stud where rollno=5")+"rows deleted");
		//stmt.executeUpdate("truncate table student");
      //		stmt.executeUpdate("drop table student");
		
//	stmt.executeUpdate("create table institute (inst_name varchar(50),Fee int)");
//    System.out.println("Table created");
   // stmt.executeUpdate("insert into institute values('ABC College',20000),('XYZ College',40000),('PQR College',25000),('LMN College',40000),('AZB College',56000)");
//    ResultSet rs=stmt.executeQuery("select * from institute");
//    System.out.println("Institution Name"+"\t"+"City");
//    while(rs.next())
//    {
//    	System.out.println(rs.getString("inst_name")+"\t"+rs.getInt("Fee"));
//    }
		
		
//		ResultSet rs=stmt.executeQuery("select * from stud inner join institute on stud.inst_name=institute.inst_name");
//		
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("city")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("per")+"\t"+rs.getInt("age")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("Fee"));
//		}

//		ResultSet rs=stmt.executeQuery("select * from stud left join institute on stud.inst_name=institute.inst_name");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("city")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("per")+"\t"+rs.getInt("age")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("Fee"));
//		}

//		
//		ResultSet rs=stmt.executeQuery("select * from stud right join institute on stud.inst_name=institute.inst_name");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("city")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("per")+"\t"+rs.getInt("age")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("Fee"));
//		}

//		ResultSet rs=stmt.executeQuery("select * from stud full  join institute;");
//		while(rs.next())
//		{
//			System.out.println(rs.getInt("rollno")+"\t"+rs.getString("name")+"\t"+rs.getString("city")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("per")+"\t"+rs.getInt("age")+"\t"+rs.getString("inst_name")+"\t"+rs.getInt("Fee"));
//		}
		
		
	}

}
