package JDbc_conn;

import java.sql.*;

public class Callable_Statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/db";
	    String user = "root";
	    String password = "j12@KOTA";
	    try (Connection con = DriverManager.getConnection(url, user, password)) 
	    {
	    	CallableStatement cst = con.prepareCall("{CALL getEmployeeSalary1()}");
	    	ResultSet rs = cst.executeQuery();
	    	System.out.println("Highest Salary \t LowestSalary");
	        System.out.println("--------------    -------------");
	        if (rs.next()) {
                System.out.println(rs.getInt(1)+"\t\t\t"+rs.getInt(2));
            }
	 
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	  }
	

}
