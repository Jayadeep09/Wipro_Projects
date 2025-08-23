package JDbc_conn;

import java.sql.*;

public class Callable_Statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/db";
	    String user = "root";
	    String password = "j12@KOTA";
	    try (Connection con = DriverManager.getConnection(url, user, password)) 
	    {
	    	CallableStatement cst = con.prepareCall("{CALL getBonus()}");
	    	ResultSet rs = cst.executeQuery();
	    	System.out.println("ID\tNAME\tSalary");
	        System.out.println("---------------------------");
	        while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
	    	
	 
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }
	  }
	

}
