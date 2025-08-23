package JDbc_conn;

import java.sql.*;

public class Callable_Statement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/db";
	    String user = "root";
	    String password = "j12@KOTA";
	    try (Connection con = DriverManager.getConnection(url, user, password)) 
	    {
	    	CallableStatement cst = con.prepareCall("{CALL getUniqueNames()}");
	    	ResultSet rs = cst.executeQuery();
	    	System.out.println("NAME\tCount");
	        System.out.println("---------------------------");
	        while (rs.next()) {
                System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
            }
	    	
	 
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	  }
	

}
