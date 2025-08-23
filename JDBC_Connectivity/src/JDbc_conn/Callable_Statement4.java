package JDbc_conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Callable_Statement4 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db";
	    String user = "root";
	    String password = "j12@KOTA";
	    try (Connection con = DriverManager.getConnection(url, user, password)) 
	    {
	    	CallableStatement cst = con.prepareCall("{CALL getorderedbyaddate()}");
	    	ResultSet rs = cst.executeQuery();
	    	System.out.println("ORDERED BY ADMITTED DATE\n");
	    	System.out.println("ID\tNAME\tAdmitted Date\tWarddNumber");
	        System.out.println("---------------------------------------");
	        while (rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDate(3)+"\t"+rs.getInt(4));
            }
	    	
	        
	        CallableStatement cst1 = con.prepareCall("{CALL getavgpatientcount() }");
	        ResultSet rs1 = cst1.executeQuery();
	        System.out.println("\nAverage Patient Count\n");
	    	System.out.println("Admitted Date\tPatient Count\tAveragecount");
	        System.out.println("---------------------------------------");
	        while (rs1.next()) {
                System.out.println(rs1.getDate(1)+"\t"+rs1.getInt(2)+"\t\t"+rs1.getFloat(3));
            }
	        
	        
	        CallableStatement cst2 = con.prepareCall("{CALL getsameward() }");
	        ResultSet rs2 = cst2.executeQuery();
	        System.out.println("\nWard wise Patient Count\n");
	    	System.out.println("WardNumber \tPatient Count\t");
	        System.out.println("---------------------------------------");
	        while (rs2.next()) {
                System.out.println(rs2.getInt(1)+"\t\t"+rs2.getInt(2));
            }
	        
	        
	 
	    }
	    catch (SQLException e) {
	        e.printStackTrace();
	    }

	}

}
